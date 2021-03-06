package com.alle.san.musicplayer;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.alle.san.musicplayer.adapters.AlbumRvAdapter;
import com.alle.san.musicplayer.models.MusicFile;
import com.alle.san.musicplayer.util.StorageUtil;

import java.util.ArrayList;
import java.util.HashSet;

import static com.alle.san.musicplayer.MainActivity.allAlbums;
import static com.alle.san.musicplayer.util.Globals.albumBitmap;


public class AlbumsFragment extends Fragment {
    RecyclerView rvAlbumList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_albums, container, false);
        rvAlbumList = view.findViewById(R.id.rv_album_fragment);
        initRecyclerView();

        return view;
    }

    private void initRecyclerView() {
        AlbumRvAdapter albumRvAdapter = new AlbumRvAdapter(getContext());
        rvAlbumList.setLayoutManager(new GridLayoutManager(getContext(), 3));
        rvAlbumList.setAdapter(albumRvAdapter);
        albumRvAdapter.setAlbums(allAlbums);
    }



}