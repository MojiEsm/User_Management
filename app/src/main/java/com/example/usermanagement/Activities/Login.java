package com.example.usermanagement.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.usermanagement.MainActivity;
import com.example.usermanagement.R;

public class Login extends AppCompatActivity {
    private TextView btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViews();
        setListener();
    }

    private void setListener() {
        btn_login.setOnClickListener(v->{
            startActivity(new Intent(Login.this, MainActivity.class));
            finish();
        });
    }

    private void findViews() {
        btn_login = findViewById(R.id.btn_Login_Login);
    }
}