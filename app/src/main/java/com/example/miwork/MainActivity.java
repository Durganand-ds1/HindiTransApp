package com.example.miwork;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers = (TextView)findViewById(R.id.numbers);
        TextView family = (TextView)findViewById(R.id.family);
        TextView colors = (TextView)findViewById(R.id.colors);
        TextView phrase = (TextView)findViewById(R.id.phrase);
        numbers.setOnClickListener(mCorkyListener);
        family.setOnClickListener(mCorkyListener);
        colors.setOnClickListener(mCorkyListener);
        phrase.setOnClickListener(mCorkyListener);

    }
    private View.OnClickListener mCorkyListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.numbers:
                    Toast.makeText(getApplicationContext(),"numbers clicked",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, Numbers.class);
                    startActivity(i);
                    break;
                case R.id.family:
                    Toast.makeText(getApplicationContext(),"family clicked",Toast.LENGTH_SHORT).show();
                    Intent j = new Intent(MainActivity.this, Family.class);
                    startActivity(j);
                    break;
                case R.id.colors:
                    Toast.makeText(getApplicationContext(),"colors clicked",Toast.LENGTH_SHORT).show();
                    Intent k = new Intent(MainActivity.this, Colors.class);
                    startActivity(k);
                    break;
                case R.id.phrase:
                    Toast.makeText(getApplicationContext(),"Phrase clicked",Toast.LENGTH_SHORT).show();
                    Intent l = new Intent(MainActivity.this, Phrase.class);
                    startActivity(l);
                    break;
                default:
                    break;
            }

        }
    };

}