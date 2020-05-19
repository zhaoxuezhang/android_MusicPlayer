package com.example.musicplayer.fragment;

import android.content.ContentResolver;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.musicplayer.GetMusicUtil;
import com.example.musicplayer.R;
import com.example.musicplayer.bean.Song;

import java.util.ArrayList;

public class LocalMusicFragment extends Fragment {
    ArrayList<Song> songList;
    GetMusicUtil util;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.localmusic_fragment, container, false);
        setData();
        return view;
    }

    private void setData(){
        ContentResolver resolver = getActivity().getContentResolver();
        util = new GetMusicUtil();
        songList= util.getMusic(resolver);

    }
}