package com.example.user.greenelf;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MoreFragment extends Fragment {

    View v;

    private NavigationView navigationView;

    public MoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_more, container, false);

        navigationView = v.findViewById(R.id.nvView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.nav_list :
                        final Intent intentList = new Intent(getActivity(),MoreList.class);
                        startActivity(intentList);

                        return true;

                    case R.id.nav_news :
                        final Intent intentNews = new Intent(getActivity(),MoreNews.class);
                        startActivity(intentNews);

                        return true;

                    case R.id.nav_capture :
                        final Intent intentCapture = new Intent(getActivity(),MoreCamera.class);
                        startActivity(intentCapture);

                        return true;

                    case R.id.nav_gps :
                        final Intent intentGPS = new Intent(getActivity(),MoreGPS.class);
                        startActivity(intentGPS);

                        return true;

                    case R.id.nav_add :
                        final Intent intentAdd = new Intent(getActivity(),MoreAdd.class);
                        startActivity(intentAdd);

                        return true;

                    case R.id.nav_share :
                        navigationView.setItemBackgroundResource(R.color.colorGreenElf);
                        return true;

                    case R.id.nav_send :
                        navigationView.setItemBackgroundResource(R.color.colorGreenElf);
                        return true;

                    default:
                        return false;
                }
            }
        });

        return v;
    }

}
