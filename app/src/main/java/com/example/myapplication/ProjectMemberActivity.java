package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ProjectMemberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_project_member);

        ImageView add_member = findViewById(R.id.add_member_btn);
        ViewGroup layout = (ViewGroup) findViewById(R.id.testID);
        ImageView backback = findViewById(R.id.toolbar_back_btn);

        layout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), TestInfo.class);
                startActivity(intent);
                finish();
            }
        });

        backback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        add_member.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), Add_memberActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}