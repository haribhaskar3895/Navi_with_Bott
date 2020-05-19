package com.example.naviwithbott;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.naviwithbott.ui.maincustomersupport.MainCustomerSupportFragment;

public class MainCustomerSupport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_customer_support_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainCustomerSupportFragment.newInstance())
                    .commitNow();
        }
    }
}
