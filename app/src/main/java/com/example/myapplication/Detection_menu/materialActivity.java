package com.example.myapplication.Detection_menu;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.DetectionActivity;
import com.example.myapplication.R;

import java.util.Calendar;

public class materialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.materialrequest);
        Calendar cal = Calendar.getInstance();
        TextView tv = findViewById(R.id.date_text);
        ImageButton comeback = findViewById(R.id.toolbar_back_btn);
        ImageButton date = findViewById(R.id.date_select_btn);



        comeback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), DetectionActivity.class);
                startActivity(intent);
                finish();
            }
        });


        DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int yy, int mm, int dd){
                tv.setText(String.format("%d/%d/0%d", yy, mm + 1, dd));
            }
        };




        date.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                new DatePickerDialog(materialActivity.this, mDateSetListener, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE)).show();
            }
        });



    }
}
