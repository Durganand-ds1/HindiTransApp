package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colors);
        ArrayList<ColorsValue> family = new ArrayList<>();
        family.add(new ColorsValue("yellow","pila"));
        family.add(new ColorsValue("yellow","pila"));
        family.add(new ColorsValue("yellow","pila"));
        family.add(new ColorsValue("yellow","pila"));

        ListView colors = (ListView) findViewById(R.id.colors);
        ColorsAdapter itemsAdapter = new ColorsAdapter(this, family);
        colors.setAdapter(itemsAdapter);


    }
}