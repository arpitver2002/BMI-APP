package com.arpit.bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText EdtWeight,EdtHeightft,EdtHeightin;
        Button btn;
        TextView result ;
        LinearLayout IILinear;
        EdtWeight=findViewById(R.id.EdtWeight);
        EdtHeightft=findViewById(R.id.EdtHeightft);
        EdtHeightin=findViewById(R.id.EdtHeightin);
        btn=findViewById(R.id.btn);
        IILinear=findViewById(R.id.IILinear);
        result=findViewById(R.id.result);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt=Integer.parseInt(EdtWeight.getText().toString());
                int htft=Integer.parseInt(EdtHeightft.getText().toString());
                int htin=Integer.parseInt(EdtHeightin.getText().toString());
                int totalIn=htft*12 +htin;
                double totalCm=totalIn*2.53;
                double totalM=totalCm/100;
                double BMI=wt/(totalM*totalM);
                if(BMI>25)
                {
                    result.setText("   You are Over Weight As Your BMI is "+BMI);
                    IILinear.setBackgroundColor(getResources().getColor(R.color.ColorOW));
                }
                else if(BMI<18)
                {
                    result.setText("   You are UnderWeight As Your BMI is "+BMI);
                    IILinear.setBackgroundColor(getResources().getColor(R.color.ColorUW));


                }
                else
                {
                    result.setText("    You're Healthy and Your BMI is "+BMI);
                    IILinear.setBackgroundColor(getResources().getColor(R.color.ColorH));
                }
            }
        });
    }

