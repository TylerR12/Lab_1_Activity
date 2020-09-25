package com.example.lab_1_activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class TopFragment extends Fragment {

    String[] act = new String[]
            {
                    "AIActivity",
                    "VRActivity"};
    ListView listView;


    public TopFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_top, container, false);

        ListView listView = view.findViewById(R.id.listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, act);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selected_item = String.valueOf(adapterView.getItemAtPosition(i));
                 if (i == 0){
                   Intent intent = new Intent(view.getContext(), AIActivity.class);
                 startActivity(intent);
                 }
                if (i == 1){
                    Intent intent2 = new Intent(view.getContext(), VRActivity.class);
                    startActivity(intent2);
                }

            }
        });

        return view;
    }


}