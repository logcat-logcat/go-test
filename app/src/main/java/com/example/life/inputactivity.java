package com.example.life;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
// change 1
public class inputactivity extends AppCompatActivity {
    Button b1;
    EditText e1,e2,e3,e4;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputactivity);

        final flag flag = (flag)getApplication();

        b1 = (Button) findViewById(R.id.button1);
        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);
        e4 = (EditText) findViewById(R.id.editText4);
        t1 = (TextView) findViewById(R.id.textView3);

        t1.setText(flag.num+1 + "번째 종");

        b1.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                String st = e1.getText().toString();
                int at = Integer.parseInt(e2.getText().toString());
                int bt = Integer.parseInt(e3.getText().toString());
                int ct = Integer.parseInt(e4.getText().toString());

                flag.input(flag.num, st, at, bt, ct);
                flag.plus();

                if(flag.num < flag.a) {


                    Intent intent = new Intent(getApplicationContext(), inputactivity.class); //엑티비티 다시시작 방법
                    finish();       //엑티비티 다시시작 방법
                    startActivity(intent);
                }else {
                    Intent intent = new Intent(inputactivity.this, outputactivity.class);
                    finish();
                    startActivity(intent);

                }
            }
        });
    }
}