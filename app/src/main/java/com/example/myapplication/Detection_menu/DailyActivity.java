package com.example.myapplication.Detection_menu;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.DetectionActivity;
import com.example.myapplication.LogInActivity;
import com.example.myapplication.R;
import com.example.myapplication.SettingActivity;

public class DailyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d_daily);

        ImageView comeback = findViewById(R.id.toolbar_back_btn);
        Button save = findViewById(R.id.daily_save_btn);

        comeback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), DetectionActivity.class);
                startActivity(intent);
                finish();
            }
        });


        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                new AlertDialog.Builder(DailyActivity.this)
                        .setTitle("저장").setMessage("감리 일지 작성을 완료하시겠습니까?")
                        .setPositiveButton("아니요", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                            }
                        })
                        .setNegativeButton("네", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                Toast.makeText(getApplicationContext(), "감리일지 저장 완료.", Toast.LENGTH_LONG).show();
                                Intent i = new Intent(DailyActivity.this, DetectionActivity.class);
                                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                                startActivity(i);
                            }
                        }).show();
            }
        });




    }
}
