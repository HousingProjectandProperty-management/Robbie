package com.apex.apex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_login);

        TextView tvSignUpSecond = findViewById(R.id.tvSignUpSecond);
        tvSignUpSecond.setOnClickListener(onClickSignUp());
    }
    private View.OnClickListener onClickSignUp(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                LoginActivity.this.startActivity(intent);
            }
        };
    }
}