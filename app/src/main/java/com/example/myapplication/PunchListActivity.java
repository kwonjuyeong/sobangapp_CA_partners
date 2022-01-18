package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.punchlist.CheckListActivity;
import com.example.myapplication.punchlist.DailyActivity;
import com.example.myapplication.punchlist.DrawingActivity;
import com.example.myapplication.punchlist.FeedbackActivity;
import com.example.myapplication.punchlist.JajaeActivity;
import com.example.myapplication.punchlist.ProgressActivity;

public class PunchListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_punch_list);

        ImageView comeback = findViewById(R.id.toolbar_back_btn);

        Button progress =  findViewById(R.id.progress_btn);
        Button daily =  findViewById(R.id.daily_btn);
        Button check_list =  findViewById(R.id.checklist_btn);
        Button jajae= findViewById(R.id.jajae_btn);
        Button draw =  findViewById(R.id.drawingreview_btn);
        Button feedback =findViewById(R.id.feedback_btn);

        comeback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        progress.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), ProgressActivity.class);
                startActivity(intent);
                finish();
            }
        });


        daily.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), DailyActivity.class);
                startActivity(intent);
                finish();
            }
        });
        check_list.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), CheckListActivity.class);
                startActivity(intent);
                finish();
            }
        });
        jajae.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), JajaeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        draw.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), DrawingActivity.class);
                startActivity(intent);
                finish();
            }
        });
        feedback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), FeedbackActivity.class);
                startActivity(intent);
                finish();
            }
        });



    }

}
