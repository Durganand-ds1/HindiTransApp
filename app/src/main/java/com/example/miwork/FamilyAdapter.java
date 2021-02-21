package com.example.miwork;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class FamilyAdapter extends ArrayAdapter<FamilyValue> {
    //adding color
    int gcolor ;
    public FamilyAdapter(Activity context, ArrayList<FamilyValue> fame, int c) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, fame);
        gcolor=c;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        FamilyValue family = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.version_name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(family.Englis());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.version_number);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView

        // for colors
        View textContainer = listItemView.findViewById(R.id.container);
        int color = ContextCompat.getColor(getContext(),gcolor);
        textContainer.setBackgroundColor(color);
        ///
        ///

        numberTextView.setText(family.Hindi());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        imageView.setImageResource(family.ImageId());
        return listItemView;
    }
}

