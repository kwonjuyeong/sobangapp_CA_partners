package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class TestInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_member_info);



        ImageView backback2 = findViewById(R.id.toolbar_back_btn);
        ImageView back = findViewById(R.id.imageView3);


        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), ProjectMemberActivity.class);
                startActivity(intent);
                finish();
            }
        });

        backback2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), ProjectMemberActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
    }