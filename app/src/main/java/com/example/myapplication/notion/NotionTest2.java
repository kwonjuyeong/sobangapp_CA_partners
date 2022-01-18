package com.example.myapplication.notion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.ProjectMemberActivity;
import com.example.myapplication.R;
import com.example.myapplication.WorkNotionActivity;

public class NotionTest2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t_notiontest2);

        ImageView comeback = findViewById(R.id.toolbar_back_btn);
        comeback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), WorkNotionActivity.class);
                startActivity(intent);
                finish();
            }
        });








    }
}
