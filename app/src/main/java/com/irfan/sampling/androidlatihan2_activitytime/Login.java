package com.irfan.sampling.androidlatihan2_activitytime;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * created by Irfan Assidiq on 2019-05-09
 * email : assidiq.irfan@gmail.com
 **/
public class Login extends AppCompatActivity {

    EditText et_1, et_2;
    Button btnLogin;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        et_1 = findViewById(R.id.et_name);
        et_2 = findViewById(R.id.et_pass);

        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!et_1.getText().toString().equals("") && !et_2.getText().toString().equals("password123")){
                    Toast.makeText(Login.this, "Password salah atau nama kosong", Toast.LENGTH_SHORT).show();
                }else{
                    Bundle b = new Bundle();
                    b.putString("nama", et_1.getText().toString());
                    Intent x = new Intent(Login.this, AfterLogin.class);
                    x.putExtras(b);
                    startActivity(x);
//                    finish();
                }
            }
        });

    }
}
