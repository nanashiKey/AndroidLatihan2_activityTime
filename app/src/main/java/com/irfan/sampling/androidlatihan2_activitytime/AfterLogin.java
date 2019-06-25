package com.irfan.sampling.androidlatihan2_activitytime;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;


/**
 * created by Irfan Assidiq on 2019-05-09
 * email : assidiq.irfan@gmail.com
 **/
public class AfterLogin extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afterlogin);
        TextView tampildata = findViewById(R.id.tampildata);

        Bundle b = getIntent().getExtras();
        if(b!= null){
            String nama = b.getString("nama");
            tampildata.setText(nama);
        }else{
            Toast.makeText(this, "data kosong", Toast.LENGTH_SHORT).show();
        }

    }
}
