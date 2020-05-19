package com.example.naviwithbott.ui.mainsubscribtion;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.naviwithbott.R;

public class MainSubscribtionFragment extends Fragment {

    private MainSubscribtionViewModel mViewModel;

    public static MainSubscribtionFragment newInstance() {
        return new MainSubscribtionFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_subscribtion_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainSubscribtionViewModel.class);
        // TODO: Use the ViewModel
    }

}
