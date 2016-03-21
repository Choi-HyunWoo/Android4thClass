package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FourthActivity extends AppCompatActivity {

    ImageView imageview1, imageview2;
    Button btn;

    boolean selected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        imageview1 = (ImageView)findViewById(R.id.image_irin);
        imageview2 = (ImageView)findViewById(R.id.image_irin2);

        btn = (Button)findViewById(R.id.btn_swap);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selected) {
                    imageview1.setVisibility(View.VISIBLE);
                    imageview2.setVisibility(View.INVISIBLE);
                    selected = false;
                } else {
                    imageview1.setVisibility(View.INVISIBLE);
                    imageview2.setVisibility(View.VISIBLE);
                    selected = true;
                }
            }
        });

        btn = (Button)findViewById(R.id.btn_finish);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
