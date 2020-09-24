package com.example.lab_1_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private BottomFragment fragment;
    String tag = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.fragment4);
        fragment.display(getString(R.string.onCreate));
        Toast.makeText(MainActivity.this,"OnCreate",Toast.LENGTH_SHORT).show();
    }
    public void onStart()
    {
        super.onStart();
        Toast.makeText(MainActivity.this,"OnStart",Toast.LENGTH_SHORT).show();
        Log.d(tag, "In the onStart() event");
        fragment.display(getString(R.string.onStart));

    }
    public void onRestart()
    {
        super.onRestart();
        Log.d(tag, "In the onRestart() event");
        fragment.display(getString(R.string.onRestart));
        Toast.makeText(MainActivity.this,"OnRestart",Toast.LENGTH_SHORT).show();
    }
    public void onResume()
    {
        super.onResume();
        Log.d(tag, "In the onResume() event");
        fragment.display(getString(R.string.onResume));
        Toast.makeText(MainActivity.this,"OnResume",Toast.LENGTH_SHORT).show();

    }
    public void onPause()
    {
        super.onPause();
        Log.d(tag, "In the onPause() event");
        fragment.display(getString(R.string.onPause));
        Toast.makeText(MainActivity.this,"OnPause",Toast.LENGTH_SHORT).show();
    }
    public void onStop()
    {
        super.onStop();
        Log.d(tag, "In the onStop() event");
        fragment.display(getString(R.string.onStop));
        Toast.makeText(MainActivity.this,"OnStop",Toast.LENGTH_SHORT).show();
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
        fragment.display(getString(R.string.onDestroy));
        Toast.makeText(MainActivity.this,"OnDestroy",Toast.LENGTH_SHORT).show();
    }
}