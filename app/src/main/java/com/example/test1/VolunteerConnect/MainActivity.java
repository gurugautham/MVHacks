package com.example.test1.VolunteerConnect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    // Test commit
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("VolunteerConnect");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void logIn(View v) {
        Intent myIntent = new Intent(MainActivity.this, UserLogin.class);
        MainActivity.this.startActivity(myIntent);
    }


    protected void signUp(View v) {
        Intent myIntent = new Intent(MainActivity.this, UserSignUp.class);
        MainActivity.this.startActivity(myIntent);
    }
}
