package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.Word;

import java.util.ArrayList;

/**
 * Created by R.SAI DHIRAJ on 07-09-2017.
 */

public class Wordadapter extends ArrayAdapter<Word> {


    public Wordadapter(Activity context, ArrayList<Word> numbersw) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0, numbersw);

    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        final Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name


        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView engTextView = (TextView) listItemView.findViewById(R.id.eng);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        engTextView.setText(currentWord.geteng());
         ImageView engImageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        engImageView.setImageResource(currentWord.getres_id());
        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

