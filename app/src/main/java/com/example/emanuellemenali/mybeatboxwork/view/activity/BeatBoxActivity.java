package com.example.emanuellemenali.mybeatboxwork.view.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.example.emanuellemenali.mybeatboxwork.R;
import com.example.emanuellemenali.mybeatboxwork.view.fragment.BeatBoxFragment;

public class BeatBoxActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
