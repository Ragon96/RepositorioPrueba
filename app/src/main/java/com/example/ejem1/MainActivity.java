package com.example.ejem1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String TAG = "PRINCIPAL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast tDef = Toast.makeText(getApplicationContext(),"Estoy en onCreate",Toast.LENGTH_SHORT);
        tDef.show();
        Log.i(TAG, "Estoy en onCreate");
        try {
            int j = 1 / 0;
        } catch (ArithmeticException e) {
            Log.e(TAG, e.toString());
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Estoy onStart", Toast.LENGTH_LONG).show();
        Log.i(TAG, "Estoy en onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Estoy onStop", Toast.LENGTH_LONG).show();
        Log.i(TAG, "Estoy en onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Estoy onDestroy", Toast.LENGTH_LONG).show();
        Log.i(TAG, "Estoy en onDestroy");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(this, "Estoy onPostResume", Toast.LENGTH_LONG).show();
        Log.i(TAG, "Estoy en onPostResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Estoy en onPause", Toast.LENGTH_LONG).show();
        Log.i(TAG, "Estoy en onPause");
    }
}
