package com.example.TylerRuffolo_CENG319_Lab1_Ex1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class BottomFragment extends Fragment {

    String tag = "Lifecycle";


    public BottomFragment() {
        // Required empty public constructor
    }


    public static BottomFragment newInstance(String param1, String param2) {
        BottomFragment fragment = new BottomFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getActivity(),"OnCreateView",Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_bottom, container, false);

    }

    public void onStart(){
        super.onStart();
        Toast.makeText(getActivity(),"OnStart",Toast.LENGTH_SHORT).show();

    }

    public void display(String msg){
        TextView textView = (TextView)getActivity().findViewById(R.id.textViewC);
        if(msg.equalsIgnoreCase(getString(R.string.onPause))){
            textView.setText("Main Activity:");
        }
        if(msg.equalsIgnoreCase(getString(R.string.onCreate))){
            textView.setText("Main Activity:");
        }
        if(msg.equalsIgnoreCase(getString(R.string.onRestart))){
            textView.setText("Main Activity:");
        }
        textView.setText(textView.getText().toString()+ "\n" + msg);

    }
}