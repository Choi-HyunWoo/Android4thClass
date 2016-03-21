package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FifthActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        editText = (EditText) findViewById(R.id.edit_input);
        textView = (TextView) findViewById(R.id.textView);

        btn = (Button) findViewById(R.id.btn_send);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FifthActivity.this, "전송완료", Toast.LENGTH_SHORT).show();
                textView.setText(editText.getText().toString());
                editText.setText("");
            }
        });

        btn = (Button) findViewById(R.id.btn_finish);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
