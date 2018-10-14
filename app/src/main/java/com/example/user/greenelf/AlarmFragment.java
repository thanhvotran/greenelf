package com.example.user.greenelf;


import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class AlarmFragment extends Fragment {

    Button set, cancel;
    TextView note;
    TimePicker timePicker;
    Calendar calendar;
    AlarmManager alarmManager;
    PendingIntent pendingIntent;

    View v;

    public AlarmFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_alarm, container, false);

        set = v.findViewById(R.id.btnSetTime);
        cancel = v.findViewById(R.id.btnCanCel);
        note = v.findViewById(R.id.txtShow);
        timePicker = v.findViewById(R.id.timePicker);
        calendar = Calendar.getInstance();
        alarmManager = (AlarmManager)getActivity().getSystemService(Context.ALARM_SERVICE);

        final Intent intent = new Intent(this.getContext(), AlarmReceiver.class);

        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationCompat.Builder noBuilder = new NotificationCompat.Builder(getContext())
                        .setSmallIcon(R.drawable.greenelficon)
                        .setLargeIcon(BitmapFactory.decodeResource(Resources.getSystem(),R.drawable.greenelicon1))
                        .setContentTitle("This is the title")
                        .setContentText("This is ... text");
                noBuilder.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
                NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(getContext());
                notificationManagerCompat.notify(1, noBuilder.build());
                calendar.set(Calendar.HOUR_OF_DAY, timePicker.getCurrentHour());
                calendar.set(Calendar.MINUTE, timePicker.getCurrentMinute());

                int h = timePicker.getCurrentHour();
                int m = timePicker.getCurrentMinute();

                String string_h = String.valueOf(h);
                String string_m = String.valueOf(m);

                if (m < 10){
                    string_m = "0" + String.valueOf(m);
                }

                intent.putExtra("extra","on");
                pendingIntent = PendingIntent.getBroadcast(
                        getActivity(),0,intent,PendingIntent.FLAG_UPDATE_CURRENT
                );
                alarmManager.set(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),pendingIntent);

                note.setText("Your setting time is: " + string_h + " : " + string_m);
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                note.setText("Stop");
                alarmManager.cancel(pendingIntent);
                intent.putExtra("extra","off");
                getActivity().sendBroadcast(intent);
            }
        });

        return v;
    }
}
