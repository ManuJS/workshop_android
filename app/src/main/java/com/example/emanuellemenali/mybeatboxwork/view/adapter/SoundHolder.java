package com.example.emanuellemenali.mybeatboxwork.view.adapter;

import android.support.v7.widget.RecyclerView;

import com.example.emanuellemenali.mybeatboxwork.databinding.ListItemSoundBinding;
import com.example.emanuellemenali.mybeatboxwork.model.BeatBox;
import com.example.emanuellemenali.mybeatboxwork.model.Sound;
import com.example.emanuellemenali.mybeatboxwork.viewmodel.SoundViewModel;

public class SoundHolder extends RecyclerView.ViewHolder {

    private ListItemSoundBinding mBinding;
    private BeatBox mBeatBox;

    public SoundHolder(ListItemSoundBinding binding, BeatBox beatBox) {
        super(binding.getRoot());
        mBinding = binding;
        mBeatBox = beatBox;
        mBinding.setViewModel(new SoundViewModel(mBeatBox));
    }

    public void bind(Sound sound){
        mBinding.getViewModel().setmSound(sound);
        mBinding.executePendingBindings();
    }

}
