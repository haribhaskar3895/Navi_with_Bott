package com.example.naviwithbott;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.naviwithbott.ui.mainmore.MainMoreFragment;

public class MainMore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_more_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainMoreFragment.newInstance())
                    .commitNow();
        }
    }
}
