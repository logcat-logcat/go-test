package com.example.life;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final flag flag = (flag)getApplication();
        flag.Init();

        b1 = (Button) findViewById(R.id.button);
        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);

        b1.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                int at = Integer.parseInt(e1.getText().toString());
                int bt = Integer.parseInt(e2.getText().toString());
                int ct = Integer.parseInt(e3.getText().toString());

                flag.seta(at);
                flag.setb(bt);
                flag.setc(ct);

                Intent intent = new Intent(MainActivity.this, inputactivity.class);
                finish();
                startActivity(intent);

            }
        });
    }
}