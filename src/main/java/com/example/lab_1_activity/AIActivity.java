package com.example.lab_1_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class AIActivity extends AppCompatActivity {

    String tag = "Lifecycle";


    public void DisplayAIActivity(String msg){

        if(msg.equalsIgnoreCase(getString(R.string.onPause)) || msg.equalsIgnoreCase(getString(R.string.onRestart))){
            ((TextView)findViewById(R.id.textView3)).setText("AIActivity:");

        }
        ((TextView)findViewById(R.id.textView3)).append("\n " + msg);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_act);

        DisplayAIActivity(getString(R.string.onCreate));
    }
    public void onStart()
    {
        super.onStart();
        DisplayAIActivity(getString(R.string.onStart));
        Toast.makeText(AIActivity.this,"OnStart",Toast.LENGTH_SHORT).show();
        Log.d(tag, "In the onStart() event");


    }
    public void onRestart()
    {
        super.onRestart();
        DisplayAIActivity(getString(R.string.onRestart));
        Log.d(tag, "In the onRestart() event");


    }
    public void onResume()
    {
        super.onResume();
        DisplayAIActivity(getString(R.string.onResume));
        Log.d(tag, "In the onResume() event");


    }
    public void onPause()
    {
        super.onPause();
        DisplayAIActivity(getString(R.string.onPause));
        Log.d(tag, "In the onPause() event");


    }
    public void onStop()
    {
        super.onStop();
        DisplayAIActivity(getString(R.string.onStop));
        Log.d(tag, "In the onStop() event");


    }
    public void onDestroy()
    {
        super.onDestroy();
        DisplayAIActivity(getString(R.string.onDestroy));
        Log.d(tag, "In the onDestroy() event");

    }





}