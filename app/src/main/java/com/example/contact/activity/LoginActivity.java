package com.example.contact.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.contact.R;

public class LoginActivity extends AppCompatActivity {
private EditText edtPhone,edtPassword;
private Button btnLogin;
private TextView tvresetpassword, tvsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtPhone=findViewById(R.id.et_phone);
        edtPassword=findViewById(R.id.et_password);
        btnLogin= findViewById(R.id.btn_login);
        tvresetpassword= findViewById(R.id.tv_reset_password);
        tvsignup= findViewById(R.id.tv_signup);
        tvresetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        tvsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {



            }
        });
    }

}
