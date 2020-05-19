package com.example.naviwithbott;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.naviwithbott.ui.maininviteuser.MainInviteUserFragment;

public class MainInviteUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_invite_user_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainInviteUserFragment.newInstance())
                    .commitNow();
        }
    }
}
