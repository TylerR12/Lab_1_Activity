package com.example.lab_1_activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


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

        return view;
    }

}