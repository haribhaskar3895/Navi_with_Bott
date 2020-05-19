package com.example.naviwithbott;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.naviwithbott.ui.mainsubscribtion.MainSubscribtionFragment;

public class MainSubscribtion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_subscribtion_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainSubscribtionFragment.newInstance())
                    .commitNow();
        }
    }
}
