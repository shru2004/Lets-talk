package com.vidyalankar.letstalk.fragments;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.vidyalankar.letstalk.R;

import java.io.IOException;

public class BinauralCalmMelodiesFragment extends Fragment {
    View binaural1;
    ImageView play_audio;
    MediaPlayer mediaPlayer;


    public BinauralCalmMelodiesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_binaural_calm_melodies, container, false);

        binaural1= view.findViewById(R.id.binaural_option_one);
        play_audio= (ImageView) (View) view.findViewById(R.id.play);

        binaural1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainerView2, new BinauralCalmMelodiesFragment()).addToBackStack(null).commit();
//              play_song();
            }
        });

        play_audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainerView2, new BinauralCalmMelodiesFragment()).addToBackStack(null).commit();
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainerView2, new BinauralCalmMelodiesFragment()).addToBackStack(null).commit();
              play_song();
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    play_audio.setImageResource(R.drawable.play);
                }
                else {
                    mediaPlayer.start();
                    play_audio.setImageResource(R.drawable.pause);
                }
            }
        });

        return view;
    }

    private void play_song() {
        mediaPlayer= new MediaPlayer();
//        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/let-s-talk-51904.appspot.com/o/Melodies%2Fbinaural%20beats%2Flife%20goes%20on.mpeg?alt=media&token=c0047a8e-15f0-4fb8-b565-d97207dc92a4");
//            mediaPlayer.prepareAsync();
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });

            mediaPlayer.prepare();
        }catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}