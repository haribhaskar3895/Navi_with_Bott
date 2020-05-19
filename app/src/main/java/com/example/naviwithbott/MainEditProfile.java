package com.example.naviwithbott;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.naviwithbott.ui.maineditprofile.MainEditProfileFragment;

public class MainEditProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_edit_profile_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainEditProfileFragment.newInstance())
                    .commitNow();
        }
    }
}
