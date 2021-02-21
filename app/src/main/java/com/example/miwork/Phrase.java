package com.example.miwork;

import android.app.AppComponentFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Phrase extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phrase);
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("helo", "ee",R.raw.number_one));
        ListView phrase = (ListView) findViewById(R.id.phrase);
        WordAdappter items = new WordAdappter(this, words,R.color.design_default_color_secondary);
        phrase.setAdapter(items);
        phrase.setAdapter(items);
        phrase.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent , View view , int Position , long id) {
                Word word = words.get(Position);
                mMediaPlayer = MediaPlayer.create(Phrase.this, word.getAudioResourceId());
                mMediaPlayer.start();

            }
        });

    }
}
