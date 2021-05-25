package com.example.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Teacher_adapter extends RecyclerView.Adapter {


    public Teacher_adapter(Teacher_Model_class[] teacherdataset) {
        Teacherdataset = teacherdataset;
    }

    private Teacher_Model_class[] Teacherdataset;
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.course, parent, false);
        return new Teacher_adapter.Teacher_View_holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  RecyclerView.ViewHolder holder, int position) {
        Teacher_View_holder view_holder = (Teacher_View_holder)holder;
        view_holder.teacher_image.setImageResource(Integer.parseInt(Teacherdataset[position].teacher_image));
        view_holder.teacher_text.setText(Teacherdataset[position].teacher_text);


    }

    @Override
    public int getItemCount() {
        return Teacherdataset.length;
    }
    public class Teacher_View_holder extends RecyclerView.ViewHolder {
        ImageView teacher_image;
        TextView teacher_text;
        public Teacher_View_holder(@NonNull View itemView) {
            super(itemView);
            teacher_image=(ImageView) itemView.findViewById(R.id.teacher_image);
            teacher_text=(TextView)itemView.findViewById(R.id.teacher_text);
        }
    }

}


