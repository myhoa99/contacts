package com.example.contact.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.contact.R;

public class LoginActivity extends AppCompatActivity {
private EditText editPhone,editPassword;
private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        editPhone=findViewById(R.id.et_phone);
        editPassword=findViewById(R.id.et_password);
        btnLogin= findViewById(R.id.btn_login);

    }
}