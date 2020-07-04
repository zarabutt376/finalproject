package com.example.screen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;


public class hunzabundle extends AppCompatActivity {
    private Button hbut1;
    private Button hp1;
    private Button hp2;
    private Button hp3;
    private Button hbut2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hunzabundle);


        hp1=(Button)findViewById(R.id.hprice1);
        hp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        hp2=(Button)findViewById(R.id.hprice2);
        hp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        hp3=(Button)findViewById(R.id.hprice3);
        hp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        hbut1=(Button)findViewById(R.id.hback);
        hbut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        hbut2=(Button)findViewById(R.id.hhome);
        hbut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
    }
    public void openActivity1()
    {
        Intent intent =new Intent(this,Hunza.class);
        startActivity(intent);
    }
    public void openActivity2()
    {
        Intent intent =new Intent(this,hunzahotel.class);
        startActivity(intent);
    }
    public void openActivity3()
    {
        Intent intent =new Intent(this,hunzadestination.class);
        startActivity(intent);
    }
}

