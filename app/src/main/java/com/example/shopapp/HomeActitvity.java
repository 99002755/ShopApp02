package com.example.shopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HomeActitvity extends AppCompatActivity {

    private static final String TAG = HomeActitvity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.w(TAG,"onCreate");
        //get the intent which started this activity
        Intent intent = getIntent();
        //from the intent  get extras
        Bundle extras = intent.getExtras();
        //from extras get the string with the key = mykey
        String data = extras.getString("mykey");
        //put the string extracted intp a textview
      TextView resultTextView = findViewById(R.id.textViewResult);
//        TextView resultTextView = findViewById(R.id.buttonlogin);
        resultTextView.setText(data);
    }
}