package com.example.naviwithbott.ui.mainsuggestion;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.naviwithbott.R;

public class MainSuggestionFragment extends Fragment {

    private MainSuggestionViewModel mViewModel;

    public static MainSuggestionFragment newInstance() {
        return new MainSuggestionFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_suggestion_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainSuggestionViewModel.class);
        // TODO: Use the ViewModel
    }

}
