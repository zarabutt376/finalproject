package com.example.screen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;


public class swatbundles extends AppCompatActivity {
    private Button sbut1;
    private Button sp1;
    private Button sp2;
    private Button sp3;
    private Button sbut2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swatbundles);

        sbut1=(Button)findViewById(R.id.kback);
        sbut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
        sp1=(Button)findViewById(R.id.sprice1);
        sp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        sp2=(Button)findViewById(R.id.sprice2);
        sp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        sp3=(Button)findViewById(R.id.sprice3);
        sp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        sbut2=(Button)findViewById(R.id.khome);
        sbut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });

    }
    public void openActivity()
    {
        Intent intent =new Intent(this,Swat.class);
        startActivity(intent);
    }
    public void openActivity1()
    {
        Intent intent =new Intent(this,swathotel.class);
        startActivity(intent);
    }
    public void openActivity2()
    {
        Intent intent =new Intent(this,swatdestination.class);
        startActivity(intent);
    }

}
