package com.example.emanuellemenali.mybeatboxwork.view.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.emanuellemenali.mybeatboxwork.R;
import com.example.emanuellemenali.mybeatboxwork.databinding.FragmentBeatBoxBinding;
import com.example.emanuellemenali.mybeatboxwork.model.BeatBox;
import com.example.emanuellemenali.mybeatboxwork.view.adapter.SoundAdapter;

public class BeatBoxFragment extends Fragment {

    private BeatBox mBeatBox;

    public static BeatBoxFragment newInstance(){
        return new BeatBoxFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBeatBox = new BeatBox(getActivity());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        FragmentBeatBoxBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_beat_box, container, false);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        binding.recyclerView.setAdapter(new SoundAdapter());
        //vamos dar uma pausa e criar nossa classe de modelo do beatbox

        return binding.getRoot();
    }
}
