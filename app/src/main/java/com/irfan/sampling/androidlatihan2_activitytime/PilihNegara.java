package com.irfan.sampling.androidlatihan2_activitytime;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;


/**
 * created by Irfan Assidiq on 2019-05-09
 * email : assidiq.irfan@gmail.com
 **/
public class PilihNegara extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listnegara);
        Switch switchs = findViewById(R.id.switchs);
        final Spinner spinner = findViewById(R.id.spinners);
        final TextView tv_negara = findViewById(R.id.tv_negara);

        switchs.setChecked(false);
        if (!switchs.isChecked()){
            spinner.setVisibility(View.GONE);
            tv_negara.setVisibility(View.GONE);
        }else{
            spinner.setVisibility(View.VISIBLE);
            tv_negara.setVisibility(View.VISIBLE);
        }

        switchs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    spinner.setVisibility(View.VISIBLE);
                    tv_negara.setVisibility(View.VISIBLE);
                }else{
                    spinner.setVisibility(View.GONE);
                    tv_negara.setVisibility(View.GONE);
                }
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String x = String.valueOf(spinner
                        .getSelectedItem());
                tv_negara.setText(x);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                tv_negara.setText("");
            }
        });
    }
}
