package com.example.life;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class outputactivity extends AppCompatActivity {
    TextView t1,t2;
    Button b1;
    float[] key = new float[100];
    float[] key1 = new float[100];
    float[] key2 = new float[100];
    float[] key3 = new float[100];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outputactivity);

        final flag flag = (flag)getApplication();


        t1 = (TextView) findViewById(R.id.textView8);
        t2 = (TextView) findViewById(R.id.textView9);
        b1 = (Button) findViewById(R.id.button2);
        float aaa=0;
        float bbb=0;
        float ccc=0;
        int k=0;
        for(k =0;k<=flag.a-1;k++){
            aaa += flag.k1[k];
            bbb += flag.k2[k];
            ccc += flag.k3[k];
        }
        for(k =0;k<=flag.a-1;k++){
            key1[k] = flag.k1[k]/aaa*100;
            key2[k] = flag.k2[k]/bbb*100;
            key3[k] = flag.k3[k]/ccc*100;
            key[k] = key1[k] + key2[k] + key3[k];
        }
        float dnwja=0;
        int kk=0;
        for(k =0;k<=flag.a-1;k++) {
            if(dnwja <= key[k]) {
                dnwja = key[k];
                kk = k;
            }
        }
        for(k =0;k<=flag.a-1;k++) {
            t1.append("개체군 : " + flag.name[k] + "   중요도 : " + (int)key[k] + "   상대밀도 : " + (int)key1[k]
                    + "   상대빈도 : " + (int)key2[k] + "   상대피도 : " + (int)key3[k] + "\n\n" );
        }
        t1.append("우점종 : " + flag.name[kk]);
        b1.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(outputactivity.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}