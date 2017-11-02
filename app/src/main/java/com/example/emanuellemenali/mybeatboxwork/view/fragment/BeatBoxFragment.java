package com.example.emanuellemenali.mybeatboxwork.view.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.emanuellemenali.mybeatboxwork.R;
import com.example.emanuellemenali.mybeatboxwork.databinding.FragmentBeatBoxBinding;

public class BeatBoxFragment extends Fragment {

    public static BeatBoxFragment newInstance(){
        return new BeatBoxFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        FragmentBeatBoxBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_beat_box, container, false);
        return binding.getRoot();
    }
}
