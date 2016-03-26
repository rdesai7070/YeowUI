package com.example.riteshdesai.yeowui.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.riteshdesai.yeowui.R;

public class TwoFragment extends Fragment {

    private static String DOMAIN_NAME;
    private EditText mDomainEditText;
    private String mDomainName;

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mDomainEditText = (EditText) getActivity().findViewById(R.id.input_website_test);

        if(savedInstanceState==null) {
            mDomainName  = mDomainEditText.getText().toString();
        }
        else{
            mDomainName= savedInstanceState.getString(DOMAIN_NAME);
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString(DOMAIN_NAME, mDomainName);


        super.onSaveInstanceState(outState);
    }
}
