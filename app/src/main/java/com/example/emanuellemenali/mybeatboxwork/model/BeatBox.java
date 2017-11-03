package com.example.emanuellemenali.mybeatboxwork.model;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.IOException;

public class BeatBox {

    private static final String TAG = "BeatBox";
    private static final String SOUNDS_FOLDER = "sample_sounds";

    private AssetManager mAssets;

    public BeatBox(Context context) {
        mAssets = context.getAssets();
        loadSounds();
    }

    private void loadSounds() {
        String[] soundNames;
        try {
            soundNames = mAssets.list(SOUNDS_FOLDER);


        } catch (IOException e) {
            return;
        }
    }


}
