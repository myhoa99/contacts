package com.example.contact.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.contact.R;

public class RegisterActivity extends AppCompatActivity {
    Button btnsignup;
    EditText edtname,edtphone, edtaddress, edtpassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnsignup= findViewById(R.id.btn_register);
        edtname= findViewById(R.id.et_name);
        edtphone= findViewById(R.id.et_reg_phone);
        edtaddress= findViewById(R.id.et_reg_address);
        edtpassword= findViewById(R.id.et_password);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
