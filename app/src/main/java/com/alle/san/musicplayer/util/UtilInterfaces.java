package com.alle.san.musicplayer.util;

import com.alle.san.musicplayer.models.MusicFile;

import java.util.ArrayList;

public interface UtilInterfaces {


    interface ViewChanger{
        void changeFragment(String tag, ArrayList<MusicFile> songs, int position);
        void onBackPressed();
    }
    interface Filter{
        void filter(String s);
    }
    interface Buttons{
        void songPlayPause();
        void playNextSong();
        void playPreviousSong();
        void playSong(MusicFile musicFile);
    }
}