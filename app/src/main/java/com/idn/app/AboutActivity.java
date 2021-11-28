package com.idn.app;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class AboutActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        if(getSupportActionBar() != null)
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    getSupportActionBar().setTitle(getResources().getString(R.string.about_us_about));
}

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onPause() {

        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    /** Called before the activity is destroyed */
    @Override
    public void onDestroy() {

        super.onDestroy();
    }

}