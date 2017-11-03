package com.example.emanuellemenali.mybeatboxwork.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.emanuellemenali.mybeatboxwork.model.BeatBox;
import com.example.emanuellemenali.mybeatboxwork.model.Sound;

/**
 * Created by emanu on 02/11/2017.
 */

public class SoundViewModel extends BaseObservable{

    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox mBeatBox) {
        this.mBeatBox = mBeatBox;
    }

    @Bindable
    public String getTitle(){
        return mSound.getName();
    }
    public Sound getmSound(){
        return mSound;
    }

    public void setmSound(Sound sound){
        mSound = sound;
        notifyChange();
    }

    public void onButtonClicked() {
        mBeatBox.play(mSound);
    }
}
