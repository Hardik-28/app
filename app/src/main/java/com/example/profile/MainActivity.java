package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    Course_Model_class t1 = new Course_Model_class("java", R.drawable.men1);
    Course_Model_class t2 = new Course_Model_class("python", R.drawable.men2);
    Course_Model_class t3 = new Course_Model_class("hindi", R.drawable.men3);
    Course_Model_class t4 = new Course_Model_class("maths", R.drawable.men5);
    Course_Model_class t5 = new Course_Model_class("toc", R.drawable.men1);
    Course_Model_class t6 = new Course_Model_class("java", R.drawable.men2);
    Course_Model_class t7 = new Course_Model_class("DBMS", R.drawable.men3);
    Course_Model_class t8 = new Course_Model_class("java", R.drawable.men5);
    Course_Model_class t9 = new Course_Model_class("english", R.drawable.men1);
    Course_Model_class t10 = new Course_Model_class("computer", R.drawable.men2);
    Course_Model_class t11 = new Course_Model_class("java", R.drawable.men3);
    Course_Model_class t12 = new Course_Model_class("science", R.drawable.men5);
    Course_Model_class t13 = new Course_Model_class("c++", R.drawable.men1);

    Course_Model_class[] course_model_class = {t1,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13};


//    Teacher_Model_class m1 = new Teacher_Model_class("hardik","R.drawable.circular");
//    Teacher_Model_class m2 = new Teacher_Model_class("gautam","R.drawable.circular");
//    Teacher_Model_class m3 = new Teacher_Model_class("gourav","R.drawable.circular");
//    Teacher_Model_class m4  = new Teacher_Model_class("kunal","R.drawable.circular");
//
//    Teacher_Model_class[] teacher_model_class = {m1,m2,m3,m4};
//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        recyclerView = findViewById(R.id.recyclerview);
//        recyclerView = findViewById(R.id.recyclerview2);
        Course_adapter ad = new Course_adapter(course_model_class);
//        Teacher_adapter aa = new Teacher_adapter(teacher_model_class);
        recyclerView.setAdapter(ad);
//        recyclerView2.setAdapter(aa);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
//        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        recyclerView2.setLayoutManager(layoutManager2);



    }
}