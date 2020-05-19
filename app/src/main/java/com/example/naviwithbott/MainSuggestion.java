package com.example.naviwithbott;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.naviwithbott.ui.mainsuggestion.MainSuggestionFragment;

public class MainSuggestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_suggestion_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainSuggestionFragment.newInstance())
                    .commitNow();
        }
    }
}
