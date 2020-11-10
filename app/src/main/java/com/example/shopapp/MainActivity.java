package com.example.shopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    public void clickHandler(View view) {
        Log.e(TAG, "clickHandler");
        Intent hIntent = new Intent(MainActivity.this, HomeActitvity.class);
        switch (view.getId()) {
            case R.id.buttonlogin:
                startHome();
                break;
            case R.id.buttoncancel:
                Intent dialIntent =  new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1234567"));
                        //new Intent(Intent.ACTION_VIEW, Uri.parse("tel:12345678"));
                //"//http://www.google.com"));

                startActivity(dialIntent);
                break;
        }

    }

    private void startHome() {
        Intent hIntent = new Intent(MainActivity.this, HomeActitvity.class);
        hIntent.putExtra("mykey", "vihi");
        startActivity(hIntent);
    }
}