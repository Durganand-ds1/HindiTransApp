package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ListAdapter;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numbers);
        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("ek","one",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("do","two",R.drawable.number_two,R.raw.number_one));
        words.add(new Word("teen","three",R.drawable.number_three,R.raw.number_one));
        words.add(new Word("chaar","four",R.drawable.number_four,R.raw.number_one));
        words.add(new Word("paanch","five",R.drawable.number_five,R.raw.number_one));
        words.add(new Word("cheah","six",R.drawable.number_six,R.raw.number_one));
        words.add(new Word("saat","seven",R.drawable.number_seven,R.raw.number_one));
        words.add(new Word("aath","eight",R.drawable.number_eight,R.raw.number_one));
        words.add(new Word("nah","nine",R.drawable.number_nine,R.raw.number_one));
        words.add(new Word("das","ten",R.drawable.number_ten,R.raw.number_one));

        // Find the root view so we can add child views to it
         ListView    rootView = (ListView) findViewById(R.id.rootView);
        WordAdappter itemsAdapter = new WordAdappter(this, words,R.color.material_on_primary_emphasis_high_type);
        //adding media player into the app
        rootView.setAdapter(itemsAdapter);
        rootView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent , View view ,int Position , long id) {
                Word word = words.get(Position);
                 mMediaPlayer = MediaPlayer.create(Numbers.this, word.getAudioResourceId());
                 mMediaPlayer.start();

            }
        });
        // Create a variable to keep track of the current index position

        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)




    }
}