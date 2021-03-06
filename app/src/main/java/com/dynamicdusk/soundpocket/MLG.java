package com.dynamicdusk.soundpocket;

import android.content.Context;

import java.util.Calendar;

public class MLG extends AccelerometerListener {

    private float xAccThreshold = 20;
    private float yAccThreshold = 20;
    private float zAccThreshold = 20;
    SoundPlayer soundPlayer;
    private long timeStamp = 0;

    public MLG(){
        super.xAccThreshold = xAccThreshold;
        super.yAccThreshold = yAccThreshold;
        super.zAccThreshold = zAccThreshold;
        timeStamp = Calendar.getInstance().getTimeInMillis();
    }
    public void setSoundPlayer(SoundPlayer soundPlayer){
        this.soundPlayer = soundPlayer;
    }

    public void onAccX(float force) {
        if(soundPlayer.isSoundOn()&& (Calendar.getInstance().getTimeInMillis() - timeStamp) > 200) {
            soundPlayer.playSound(SoundPlayer.SOUND_AIR_HORN );
            timeStamp = Calendar.getInstance().getTimeInMillis();
        }
        //jsHandler.alert("Force: " + force);
    }

    public void onAccY(float force) {
        if(soundPlayer.isSoundOn()&& (Calendar.getInstance().getTimeInMillis() - timeStamp) > 200) {
            soundPlayer.playSound(SoundPlayer.SOUND_AIR_HORN);
            timeStamp = Calendar.getInstance().getTimeInMillis();
        }
        //jsHandler.alert("Force: " + force);
    }

    public void onAccZ(float force) {
        if(soundPlayer.isSoundOn()&& (Calendar.getInstance().getTimeInMillis() - timeStamp) > 200) {
            soundPlayer.playSound(SoundPlayer.SOUND_AIR_HORN);
            timeStamp = Calendar.getInstance().getTimeInMillis();
        }
        //jsHandler.alert("Force: " + force);
    }
    public void onGyroX(float force) {
    }

    public void onGyroY(float force) {
    }

    public void onGyroZ(float force) {
    }
}
