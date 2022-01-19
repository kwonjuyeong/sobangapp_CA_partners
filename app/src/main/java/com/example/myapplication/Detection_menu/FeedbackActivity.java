package com.example.myapplication.Detection_menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.DetectionActivity;
import com.example.myapplication.R;

public class FeedbackActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d_feedback);

        ImageView comeback = findViewById(R.id.toolbar_back_btn);


        comeback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), DetectionActivity.class);
                startActivity(intent);
                finish();
            }
        });









    }


}
