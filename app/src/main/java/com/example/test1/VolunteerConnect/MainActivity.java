package com.example.test1.VolunteerConnect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {
    // Test commit

    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("VolunteerConnect");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initializing firebase auth object
        firebaseAuth = FirebaseAuth.getInstance();

    }

    protected void logIn(View v) {
        Intent myIntent = new Intent(MainActivity.this, UserLogin.class);
        MainActivity.this.startActivity(myIntent);
    }


    protected void signUp(View v) {
        Intent myIntent = new Intent(MainActivity.this, UserSignUp.class);
        MainActivity.this.startActivity(myIntent);
    }

    protected void map(View v){
        if(firebaseAuth.getCurrentUser()==null){
            Toast.makeText(this, "Please login in above first!", Toast.LENGTH_SHORT).show();
        }
        else{
            finish();
            startActivity(new Intent(getApplicationContext(), EventMap.class));
        }
    }

    protected void list(View v){
        if(firebaseAuth.getCurrentUser()==null){
            Toast.makeText(this, "Please login in above first!", Toast.LENGTH_SHORT).show();
        }
        else{
            startActivity(new Intent(getApplicationContext(), EventMap.class));
        }
    }
}
