package com.example.administrator.myapplication;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView topImage, bottomImage;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topImage = (ImageView) findViewById(R.id.image_top);
        bottomImage = (ImageView)findViewById(R.id.image_bottom);

        btn = (Button)findViewById(R.id.btn_gototop);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bottomImage.getDrawable() != null && topImage.getDrawable() == null) {
                    topImage.setImageDrawable(bottomImage.getDrawable());
                    bottomImage.setImageDrawable(null);
                }
            }
        });
        btn = (Button)findViewById(R.id.btn_gotobottom);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (topImage.getDrawable() != null && bottomImage.getDrawable() == null) {
                    bottomImage.setImageDrawable(topImage.getDrawable());
                    topImage.setImageDrawable(null);
                }
            }
        });

        btn = (Button)findViewById(R.id.btn_next);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                startActivity(intent);
            }
        });
        btn = (Button)findViewById(R.id.btn_third);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
        btn = (Button)findViewById(R.id.btn_fourth);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        });
        btn = (Button)findViewById(R.id.btn_scrollactivity);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScrollingActivity.class);
                startActivity(intent);
            }
        });
        btn = (Button)findViewById(R.id.btn_fifth);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FifthActivity.class);
                startActivity(intent);
            }
        });
    }

}
