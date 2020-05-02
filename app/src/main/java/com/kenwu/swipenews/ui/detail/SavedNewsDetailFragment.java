package com.kenwu.swipenews.ui.detail;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kenwu.swipenews.R;
import com.kenwu.swipenews.databinding.FragmentSavedNewsDetailBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class SavedNewsDetailFragment extends Fragment {
    private FragmentSavedNewsDetailBinding binding;

    public SavedNewsDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSavedNewsDetailBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
