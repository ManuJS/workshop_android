package com.example.emanuellemenali.mybeatboxwork.viewmodel;

import com.example.emanuellemenali.mybeatboxwork.model.BeatBox;
import com.example.emanuellemenali.mybeatboxwork.model.Sound;

/**
 * Created by emanu on 02/11/2017.
 */

public class SoundViewModel {

    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox mBeatBox) {
        this.mBeatBox = mBeatBox;
    }

    public Sound getmSound(){
        return mSound;
    }

    public void setmSound(Sound sound){
        mSound = sound;
    }

    public String getTitle(){
        return mSound.getName();
    }
}
