package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Add_memberActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_addmember);
        overridePendingTransition(R.anim.vertical_enter, R.anim.none);

        TextView comeback = findViewById(R.id.textView2);

        comeback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), ProjectMemberActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
