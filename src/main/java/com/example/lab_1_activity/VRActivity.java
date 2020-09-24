package com.example.lab_1_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;


public class VRActivity extends AppCompatActivity {

    String tag = "Lifecycle";


    public void DisplayVRActivity(String msg){

        if(msg.equalsIgnoreCase(getString(R.string.onPause)) || msg.equalsIgnoreCase(getString(R.string.onRestart))){
            ((TextView)findViewById(R.id.textViewVR)).setText("AIActivity:");

        }
        ((TextView)findViewById(R.id.textViewVR)).append("\n " + msg);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vr_activity);
        DisplayVRActivity(getString(R.string.onCreate));
        Toast.makeText(VRActivity.this,"OnRestart",Toast.LENGTH_SHORT).show();
    }

    public void onStart()
    {
        super.onStart();
        DisplayVRActivity(getString(R.string.onStart));
        Toast.makeText(VRActivity.this,"OnStart",Toast.LENGTH_SHORT).show();
        Log.d(tag, "In the onStart() event");


    }
    public void onRestart()
    {
        super.onRestart();
        DisplayVRActivity(getString(R.string.onRestart));
        Log.d(tag, "In the onRestart() event");
        Toast.makeText(VRActivity.this,"OnRestart",Toast.LENGTH_SHORT).show();


    }
    public void onResume()
    {
        super.onResume();
        DisplayVRActivity(getString(R.string.onResume));
        Log.d(tag, "In the onResume() event");
        Toast.makeText(VRActivity.this,"OnResume",Toast.LENGTH_SHORT).show();


    }
    public void onPause()
    {
        super.onPause();
        DisplayVRActivity(getString(R.string.onPause));
        Log.d(tag, "In the onPause() event");
        Toast.makeText(VRActivity.this,"OnPause",Toast.LENGTH_SHORT).show();


    }
    public void onStop()
    {
        super.onStop();
        DisplayVRActivity(getString(R.string.onStop));
        Log.d(tag, "In the onStop() event");
        Toast.makeText(VRActivity.this,"OnStop",Toast.LENGTH_SHORT).show();


    }
    public void onDestroy()
    {
        super.onDestroy();
        DisplayVRActivity(getString(R.string.onDestroy));
        Log.d(tag, "In the onDestroy() event");
        Toast.makeText(VRActivity.this,"OnDestroy",Toast.LENGTH_SHORT).show();

    }
}