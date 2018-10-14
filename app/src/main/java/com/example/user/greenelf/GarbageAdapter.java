package com.example.user.greenelf;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GarbageAdapter extends RecyclerView.Adapter<GarbageAdapter.ViewHolder> {
    ArrayList<DataGarbage> dataGarbages;
    Context context;
    Dialog myDialog;

    public GarbageAdapter(ArrayList<DataGarbage> dataGarbages, Context context) {
        this.dataGarbages = dataGarbages;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_row,parent,false);

        final ViewHolder viewHolder = new ViewHolder(itemView);

        // Dialog ini

        myDialog = new Dialog(context);
        myDialog.setContentView(R.layout.garbageinfo);



        viewHolder.item_row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView garbage_name = (TextView)myDialog.findViewById(R.id.tvGarbage_Name);
                TextView garbage_source = (TextView)myDialog.findViewById(R.id.tvGarbage_Source);
                TextView garbage_source_text = (TextView)myDialog.findViewById(R.id.tvGarbage_Source_Text);
                TextView garbage_type = (TextView)myDialog.findViewById(R.id.tvGarbage_Type);
                TextView garbage_type_text = (TextView)myDialog.findViewById(R.id.tvGarbage_Type_Text);
                TextView garbage_guide = (TextView)myDialog.findViewById(R.id.tvGarbage_Guide);
                TextView garbage_guide_text = (TextView)myDialog.findViewById(R.id.tvGarbage_Guide_Text);
                ImageView garbare_img = (ImageView)myDialog.findViewById(R.id.garbage_img);
                garbage_name.setText(dataGarbages.get(viewHolder.getAdapterPosition()).getTen());
                garbage_source_text.setText(dataGarbages.get(viewHolder.getAdapterPosition()).getNguonGoc());
                garbage_type_text.setText(dataGarbages.get(viewHolder.getAdapterPosition()).getPhanLoai());
                garbage_guide_text.setText(dataGarbages.get(viewHolder.getAdapterPosition()).getHuongDan());
                garbare_img.setImageResource(dataGarbages.get(viewHolder.getAdapterPosition()).getHinhAnh());
                myDialog.show();
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtName.setText(dataGarbages.get(position).getTen());
        holder.txtSubDes.setText(dataGarbages.get(position).getNguonGoc());
        holder.imgHinh.setImageResource(dataGarbages.get(position).getHinhAnh());
    }

    @Override
    public int getItemCount() {
        return dataGarbages.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        RelativeLayout item_row;
        TextView txtName;
        TextView txtSubDes;
        ImageView imgHinh;

        public ViewHolder(View itemView) {
            super(itemView);
            item_row = (RelativeLayout)itemView.findViewById(R.id.item_row_id);
            txtName = (TextView)itemView.findViewById(R.id.garbTitle);
            txtSubDes = (TextView)itemView.findViewById(R.id.garbSubDes);
            imgHinh = (ImageView)itemView.findViewById(R.id.imgRac);

        }
    }

    public void filterList(ArrayList<DataGarbage> filteredList){
        dataGarbages = filteredList;
        notifyDataSetChanged();
    }
}
