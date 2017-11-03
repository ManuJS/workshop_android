package com.example.emanuellemenali.mybeatboxwork.model;

public class Sound {
    private String mAssetPath;
    private String name;

    public Sound(String mAssetPath) {
        this.mAssetPath = mAssetPath;
        String[] components = mAssetPath.split("/");
        String fileName = components[components.length-1];
        this.name = fileName;
    }

    public String getmAssetPath() {
        return mAssetPath;
    }

    public void setmAssetPath(String mAssetPath) {
        this.mAssetPath = mAssetPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
