package com.example.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_setting);


        ImageView bback = findViewById(R.id.toolbar_back_btn);
        Button Logout = findViewById(R.id.logout);
        Button signout = findViewById(R.id.sign_out);
        Button notion = findViewById(R.id.notion_app);
        Button call = findViewById(R.id.call_center);
        Button change = findViewById(R.id.change_info_btn);


        bback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        change.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), ChangeInfoActivity.class);
                startActivity(intent);
                finish();
            }
        });



        //로그아웃 구현
        Logout.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) { //회원탈퇴 버튼 클릭 시
                new AlertDialog.Builder(SettingActivity.this)
                        .setTitle("로그아웃").setMessage("로그아웃 하시겠습니까?")
                        .setPositiveButton("아니요", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                            }
                        })
                        .setNegativeButton("네", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                Intent i = new Intent(SettingActivity.this, LogInActivity.class);
                                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                                startActivity(i);
                            }
                        }).show();
                         }
                    });

        //회원 탈퇴
        signout.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) { //회원탈퇴 버튼 클릭 시
                new AlertDialog.Builder(SettingActivity.this)
                        .setTitle("회원 탈퇴").setMessage("정말 회원을 탈퇴하시겠습니까?")
                        .setPositiveButton("아니요", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                            }
                        })
                        .setNegativeButton("네, 탈퇴할게요", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                Intent i = new Intent(SettingActivity.this, LogInActivity.class);
                                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                                startActivity(i);
                            }
                        }).show();
            }
        });


        notion.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) { //회원탈퇴 버튼 클릭 시
                new AlertDialog.Builder(SettingActivity.this)
                        .setTitle("앱 정보").setMessage("앱 버젼 : v1.1.2 \n업데이트 내용 : UI 기본 디자인, 흐름 파악")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                            }
                        }).show();
            }
        });


        notion.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) { //회원탈퇴 버튼 클릭 시
                new AlertDialog.Builder(SettingActivity.this)
                        .setTitle("앱 정보").setMessage("앱 버젼 : v1.1.2 \n업데이트 내용 : UI 기본 디자인, 흐름 파악")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                            }
                        }).show();
            }
        });

        call.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) { //회원탈퇴 버튼 클릭 시
                new AlertDialog.Builder(SettingActivity.this)
                        .setTitle("고객 센터").setMessage("전화번호 : 02-1234-5678(80) \n운영 시간 :\n오전 10:00~12:00\n오후 14:00~17:00\n주소 : 서울특별시 서울로 서울구 \n서울동 서울빌딩 123-456")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                            }
                        }).show();
            }
        });


    }
}

