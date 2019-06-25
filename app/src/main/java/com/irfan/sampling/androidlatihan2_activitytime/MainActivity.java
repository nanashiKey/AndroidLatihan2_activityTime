package com.irfan.sampling.androidlatihan2_activitytime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    //pembuatan variabel atau view dengan nama tv1
    TextView tv1;
    //Button btn1;
    Button btn3, btn4, btn5, btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisialisasi tv1
        tv1 = findViewById(R.id.tv_1);
        tv1.setText("Assalamu'alaykum");
        tv1.setAllCaps(true);
        tv1.setTextSize(20.0f);

        //pembuatan variabel sekaligus inisialisasi
        TextView tv2 = findViewById(R.id.tv_2);
        tv2.setText("Hai Nama Saya Irfan");

        //inisialisasi button
        //btn1 = findViewById(R.id.btn1);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);

        //variable onclick / anonymous inner class
        View.OnClickListener pushed =
                new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.btn3:{
                        Toast.makeText(MainActivity.this,
                                "Tombol 3 terklik",
                                Toast.LENGTH_SHORT).show();
                    }break;
                    case R.id.btn4 :{
                        Toast.makeText(MainActivity.this,
                                "Tombol 4 terklik",
                                Toast.LENGTH_SHORT).show();
                    }break;
                    default:
                        //
                }
            }
        };

        btn3.setOnClickListener(pushed);
        btn4.setOnClickListener(pushed);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);

        Button btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Bundle b = new Bundle();
            b.putString("est", "Hai Saya Irfan");
            Intent i = new Intent(MainActivity.this,
                                NextPage.class);
            i.putExtras(b);
            startActivity(i);
            finish();
            }
        });
    }

    //membuat method pencet
    public void pencet(View v){
        switch (v.getId()){
            case R.id.btn1 :{
                Toast.makeText(MainActivity.this,
                        "tombol 1 terklik",
                        Toast.LENGTH_SHORT).show();
            }break;
            case R.id.btn2 :{
                Toast.makeText(MainActivity.this,
                        "tombol 2 terklik",
                        Toast.LENGTH_SHORT).show();
            }break;
            default:
                //
        }
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this,
                        "Tombol Terklik",
                            Toast.LENGTH_SHORT).show();
    }
}
