package com.example.screen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;


public class islamabadbundles extends AppCompatActivity {
    private Button ibut1;
    private Button ip1;
    private Button ip2;
    private Button ip3;
    private Button ibut2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islamabadbundles);


        ip1 = (Button) findViewById(R.id.iprice1);
        ip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        ip2 = (Button) findViewById(R.id.iprice2);
        ip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        ip3 = (Button) findViewById(R.id.iprice3);
        ip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        ibut1 = (Button) findViewById(R.id.iback);
        ibut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
        ibut2 = (Button) findViewById(R.id.ihome);
        ibut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }
    public void openActivity()
    {
        Intent intent =new Intent(this,Islamabad.class);
        startActivity(intent);
    }
    public void openActivity1()
    {
        Intent intent =new Intent(this,islamabadhotels.class);
        startActivity(intent);
    }
    public void openActivity2()
    {
        Intent intent =new Intent(this,isldestination.class);
        startActivity(intent);
    }

}