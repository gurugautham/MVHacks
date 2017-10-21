package com.example.test1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    // Test commit
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void doStart(View v) {
        Button b = (Button)(Button)findViewById(R.id.button);
        b.setText("Let's Go!");
        Intent myIntent = new Intent(MainActivity.this, UserLogin.class);
        MainActivity.this.startActivity(myIntent);
    }
}
