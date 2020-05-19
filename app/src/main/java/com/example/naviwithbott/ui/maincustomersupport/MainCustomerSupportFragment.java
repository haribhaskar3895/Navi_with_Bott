package com.example.naviwithbott.ui.maincustomersupport;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.naviwithbott.R;

public class MainCustomerSupportFragment extends Fragment {

    private MainCustomerSupportViewModel mViewModel;

    public static MainCustomerSupportFragment newInstance() {
        return new MainCustomerSupportFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_customer_support_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainCustomerSupportViewModel.class);
        // TODO: Use the ViewModel
    }

}
