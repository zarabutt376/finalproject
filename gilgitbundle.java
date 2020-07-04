package com.example.screen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;


public class gilgitbundle extends AppCompatActivity {
    private Button gbut1;
    private Button gp1;
    private Button gp2;
    private Button gp3;
    private Button gbut2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gilgitbundle);


        gp1=(Button)findViewById(R.id.gprice1);
        gp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
        gp2=(Button)findViewById(R.id.gprice2);
        gp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
        gp3=(Button)findViewById(R.id.gprice3);
        gp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
        gbut1=(Button)findViewById(R.id.gback);
        gbut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
        gbut2=(Button)findViewById(R.id.ghome);
        gbut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }
    public void openActivity()
    {
        Intent intent =new Intent(this,Gilgit.class);
        startActivity(intent);
    }
    public void openActivity1()
    {
        Intent intent =new Intent(this,gilgithotel.class);
        startActivity(intent);
    }
    public void openActivity2()
    {
        Intent intent =new Intent(this,gilgitdestination.class);
        startActivity(intent);
    }


}