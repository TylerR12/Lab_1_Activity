package com.example.lab_1_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class AIActivity extends AppCompatActivity {

    String tag = "Lifecycle";


    public void DisplayAIActivity(String msg){


        //((TextView)findViewById(R.id.textView3)).setText("\n " + msg);


        if(msg.equalsIgnoreCase(getString(R.string.onPause)) || msg.equalsIgnoreCase(getString(R.string.onRestart))){
            ((TextView)findViewById(R.id.textView3)).setText("AI Activity:");

        }
        ((TextView)findViewById(R.id.textView3)).setText("\n " + msg);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_act);

        DisplayAIActivity("OnCreate active");
    }
    public void onStart()
    {
        super.onStart();
        DisplayAIActivity("OnStart active");
        Toast.makeText(AIActivity.this,"OnStart",Toast.LENGTH_SHORT).show();
        Log.d(tag, "In the onStart() event");


    }
    public void onRestart()
    {
        super.onRestart();
        DisplayAIActivity("OnRestart active");
        Log.d(tag, "In the onRestart() event");
        Toast.makeText(AIActivity.this,"OnRestart",Toast.LENGTH_SHORT).show();


    }
    public void onResume()
    {
        super.onResume();
        DisplayAIActivity("OnResume active");
        Log.d(tag, "In the onResume() event");
        Toast.makeText(AIActivity.this,"OnResume",Toast.LENGTH_SHORT).show();


    }
    public void onPause()
    {
        super.onPause();
        DisplayAIActivity("OnPause active");
        Log.d(tag, "In the onPause() event");
        Toast.makeText(AIActivity.this,"OnPause",Toast.LENGTH_SHORT).show();


    }
    public void onStop()
    {
        super.onStop();
        DisplayAIActivity("OnStop active");
        Log.d(tag, "In the onStop() event");
        Toast.makeText(AIActivity.this,"OnStop",Toast.LENGTH_SHORT).show();


    }
    public void onDestroy()
    {
        super.onDestroy();
        DisplayAIActivity("OnStop active");
        Log.d(tag, "In the onDestroy() event");
        Toast.makeText(AIActivity.this,"OnDestroy",Toast.LENGTH_SHORT).show();

    }





}