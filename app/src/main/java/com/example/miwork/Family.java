package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.family);
        ArrayList<FamilyValue> fame = new ArrayList<>();
        fame.add(new FamilyValue("father","pitajee",R.drawable.family_father));
        fame.add(new FamilyValue("Mother","Mami",R.drawable.family_mother));
        fame.add(new FamilyValue("Sister","behan",R.drawable.family_younger_sister));
        fame.add(new FamilyValue("Brother","bhaee",R.drawable.family_older_brother));
        ListView fname = (ListView) findViewById(R.id.fname);
        FamilyAdapter itemsAdapter = new FamilyAdapter(this,fame,R.color.purple_200);
        fname.setAdapter(itemsAdapter);

    }

}