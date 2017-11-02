package com.example.emanuellemenali.mybeatboxwork.view.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.emanuellemenali.mybeatboxwork.R;
import com.example.emanuellemenali.mybeatboxwork.databinding.ListItemSoundBinding;
import com.example.emanuellemenali.mybeatboxwork.model.BeatBox;
import com.example.emanuellemenali.mybeatboxwork.model.Sound;

import java.util.List;

/**
 * Created by emanu on 02/11/2017.
 */

public class SoundAdapter extends RecyclerView.Adapter<SoundHolder> {

    private List<Sound> mSounds;

    private Context mContext;

    private BeatBox mBeatBox;

    public SoundAdapter(List<Sound> mSounds, Context mContext, BeatBox mBeatBox) {
        this.mSounds = mSounds;
        this.mContext = mContext;
        this.mBeatBox = mBeatBox;
    }

    @Override
    public SoundHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ListItemSoundBinding binding = DataBindingUtil.inflate(inflater, R.layout.list_item_sound, parent, false);
        return new SoundHolder(binding);
    }

    @Override
    public void onBindViewHolder(SoundHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
