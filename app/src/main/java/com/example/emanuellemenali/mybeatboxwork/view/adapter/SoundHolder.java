package com.example.emanuellemenali.mybeatboxwork.view.adapter;

import android.support.v7.widget.RecyclerView;

import com.example.emanuellemenali.mybeatboxwork.databinding.ListItemSoundBinding;

public class SoundHolder extends RecyclerView.ViewHolder {

    private ListItemSoundBinding mBinding;

    public SoundHolder(ListItemSoundBinding binding) {
        super(binding.getRoot());
        mBinding = binding;
    }
}
