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
        Toast.makeText(AIActivity.this,"OnRestart",Toast.LENGTH_SHORT).show();


    }
    public void onResume()
    {
        super.onResume();
        DisplayAIActivity(getString(R.string.onResume));
        Log.d(tag, "In the onResume() event");
        Toast.makeText(AIActivity.this,"OnResume",Toast.LENGTH_SHORT).show();


    }
    public void onPause()
    {
        super.onPause();
        DisplayAIActivity(getString(R.string.onPause));
        Log.d(tag, "In the onPause() event");
        Toast.makeText(AIActivity.this,"OnPause",Toast.LENGTH_SHORT).show();


    }
    public void onStop()
    {
        super.onStop();
        DisplayAIActivity(getString(R.string.onStop));
        Log.d(tag, "In the onStop() event");
        Toast.makeText(AIActivity.this,"OnStop",Toast.LENGTH_SHORT).show();


    }
    public void onDestroy()
    {
        super.onDestroy();
        DisplayAIActivity(getString(R.string.onDestroy));
        Log.d(tag, "In the onDestroy() event");
        Toast.makeText(AIActivity.this,"OnDestroy",Toast.LENGTH_SHORT).show();

    }





}