package com.example.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.notion.NotionTest1;
import com.example.myapplication.notion.NotionTest2;
import com.example.myapplication.notion.NotionTest3;

public class WorkNotionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_work_notion);

        ImageButton yes1 = findViewById(R.id.yesbtn);
        ImageButton yes2 = findViewById(R.id.yesbtn2);
        ImageButton yes3 = findViewById(R.id.yesbtn3);
        ImageButton yes4 = findViewById(R.id.yesbtn4);
        ImageButton yes5 = findViewById(R.id.yesbtn5);
        ImageView comeback = findViewById(R.id.toolbar_back_btn);
        LinearLayout layout = (LinearLayout) findViewById(R.id.hi5);


        comeback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        yes1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), NotionTest1.class);
                startActivity(intent);
                finish();
            }
        });


        yes2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), NotionTest2.class);
                startActivity(intent);
                finish();
            }
        });


        yes3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), NotionTest3.class);
                startActivity(intent);
                finish();
            }
        });

        yes5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                new AlertDialog.Builder(WorkNotionActivity.this)
                        .setTitle("멤버 추가 요청").setMessage("멤버 요청을 받을까요?")
                        .setPositiveButton("아니요", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                layout.setVisibility(View.GONE);
                            }
                        })
                        .setNegativeButton("네, 추가할래요", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                Toast.makeText(getApplicationContext(), "멤버에 추가되었습니다.", Toast.LENGTH_LONG).show();
                                layout.setVisibility(View.GONE);
                            }
                        }).show();
            }
        });


    }
}
