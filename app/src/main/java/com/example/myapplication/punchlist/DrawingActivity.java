package com.example.myapplication.punchlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.ProjectMemberActivity;
import com.example.myapplication.PunchListActivity;
import com.example.myapplication.R;

public class DrawingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d_drawingreview);



        ImageView comeback = findViewById(R.id.toolbar_back_btn);


        comeback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), PunchListActivity.class);
                startActivity(intent);
                finish();
            }
        });







    }

}
