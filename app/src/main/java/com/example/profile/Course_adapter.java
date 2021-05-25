package com.example.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Course_adapter extends RecyclerView.Adapter {
    public Course_adapter(Course_Model_class[] coursedataset) {
        Coursedataset = coursedataset;
    }

    private Course_Model_class[] Coursedataset;
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.course, parent, false);
        return new Course_adapter.Course_View_holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  RecyclerView.ViewHolder holder, int position) {
        Course_View_holder view_holder = (Course_View_holder)holder;
        view_holder.courseimage.setImageResource(Coursedataset[position].courseimage);
        view_holder.coursetext.setText(Coursedataset[position].coursetext);


    }

    @Override
    public int getItemCount() {
        return Coursedataset.length;
    }
    public class Course_View_holder extends RecyclerView.ViewHolder {
        ImageView courseimage;
        TextView coursetext;
        public Course_View_holder(@NonNull View itemView) {
            super(itemView);
            courseimage=(ImageView) itemView.findViewById(R.id.courseimage);
            coursetext=(TextView)itemView.findViewById(R.id.coursetext);
        }
    }

}
