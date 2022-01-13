package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    private Spinner spinner2;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main);

        Button project_intro_btn = findViewById(R.id.project_intro_button);
        Button project_member_btn = findViewById(R.id.project_member_button);
        Button punchlist_btn = findViewById(R.id.punchlist_button);
        Button settings_btn = findViewById(R.id.setting_btn);
        //TextView text = findViewById(R.id.main_text);


//        arrayList = new ArrayList<>();
//        arrayList.add("서울특별시 서울역 9번출구 위워크 앞 공사현장");
//        arrayList.add("서울특별시 중구 위워크 건물 2~14층");
//        arrayList.add("경기도 안산시 고잔동 ㅇㅇ건물 ");
//
//        arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrayList);
//        spinner2 = (Spinner)findViewById(R.id.spinner2);
//        spinner2.setAdapter(arrayAdapter);
//        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
//            @Override public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                text.setText("i");
//             }
//        @Override public void onNothingSelected(AdapterView<?> adapterView) { }
//        });


        String[] facilityList = {
                "서울특별시 서울역 9번출구 위워크 앞 공사현장", "서울특별시 중구 위워크 건물 2~14층", "경기도 안산시 고잔동 ㅇㅇ건물 ", "남양주 다산신도시 지금지구 근생 및 업무시설"
        };

        Spinner spinners = (Spinner)findViewById(R.id.spinner2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, R.layout.custom_item_1line, facilityList);
        spinners.setAdapter(adapter);
        spinners.setSelection(0);
        spinners.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //텍스트 색 흰색으로 바꿔주기
                ((TextView)adapterView.getChildAt(0)).setTextColor(Color.WHITE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }});


        project_intro_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), ProjectIntroActivity.class);
                startActivity(intent);
                finish();
            }
        });

        project_member_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), ProjectMemberActivity.class);
                startActivity(intent);
                finish();
            }
        });

        punchlist_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), PunchListActivity.class);
                startActivity(intent);
                finish();
            }
        });

        settings_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), SettingActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
