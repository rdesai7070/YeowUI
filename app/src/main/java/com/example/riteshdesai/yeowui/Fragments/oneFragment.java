package com.example.riteshdesai.yeowui.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.riteshdesai.yeowui.Activity.add_url;
import com.example.riteshdesai.yeowui.R;



public class oneFragment extends Fragment implements View.OnClickListener {

    private FloatingActionButton add;

    public oneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        add = (FloatingActionButton) getActivity().findViewById(R.id.add_fab);
        add.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(),add_url.class);
        startActivity(intent);
    }
}
