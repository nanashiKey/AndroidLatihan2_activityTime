package com.irfan.sampling.androidlatihan2_activitytime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class NextPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);
        TextView test = findViewById(R.id.test);

        Bundle b = getIntent().getExtras();
        if(b != null){
            String x = b.getString("est");
            test.setText(x);
        }else{
            Toast.makeText(NextPage.this,
                            "Data Kosong",
                            Toast.LENGTH_SHORT).show();
            Log.e("ERRR", "null data");
        }
    }
}
