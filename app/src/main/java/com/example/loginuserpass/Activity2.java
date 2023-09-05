package com.example.loginuserpass;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.loginuserpass.R;

public class Activity2 extends AppCompatActivity {
    TextView textViewUsername;
    TextView textViewPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        textViewUsername = findViewById(R.id.textViewUsername);
        textViewPassword = findViewById(R.id.textViewPassword);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String username = extras.getString("Nama");
            String password = extras.getString("NIM");

            textViewUsername.setText("Username: " + username);
            textViewPassword.setText("Password: " + password);
        }
    }
}
