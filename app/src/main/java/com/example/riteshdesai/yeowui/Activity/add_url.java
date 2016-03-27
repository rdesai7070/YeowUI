package com.example.riteshdesai.yeowui.Activity;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.EditText;

import com.example.riteshdesai.yeowui.R;

public class add_url extends AppCompatActivity {

    private static final String TAG = null;
    private static String PROVIDER;
    private static String WEBSITE;
    private EditText mWebsiteName_EditText;
    private EditText mProviderName_EditText;
    private String mWebsiteName;
    private String mProviderName;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        NavUtils.navigateUpFromSameTask(this);

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_url);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Add new domain");





        mWebsiteName_EditText = (EditText) findViewById(R.id.input_website);
        mProviderName_EditText = (EditText) findViewById(R.id.input_provider);
        if(savedInstanceState!=null){



            mWebsiteName = savedInstanceState.getString(WEBSITE);
            mProviderName = savedInstanceState.getString(PROVIDER);
//            Log.i(TAG,mWebsiteName + "," + mProviderName);
        }
        else{

            mWebsiteName = mWebsiteName_EditText.getText().toString();
            mProviderName = mProviderName_EditText.getText().toString();

        }




    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {


        savedInstanceState.putString(WEBSITE, mWebsiteName);
        savedInstanceState.putString(PROVIDER,mProviderName);

        super.onSaveInstanceState(savedInstanceState);
    }

}
