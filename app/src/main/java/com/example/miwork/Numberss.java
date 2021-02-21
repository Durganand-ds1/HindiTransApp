package com.example.miwork;

import android.view.View;
import android.widget.Toast;

public class Numberss implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"its working ",Toast.LENGTH_SHORT).show();

    }
}
