package com.example.android.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {

    // resource id for background color of attraction list
    private int mColorResourceId;

    // create constructor (matches class name)
    public TourAdapter(Activity context, ArrayList<Tour> tours, int colorResourceId) {
        super(context, 0, tours);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // the {@link Tour} object at this position in the list
        Tour currentTour = getItem(position);

        // set attraction text view
        TextView attractionTextView = (TextView) listItemView.findViewById(R.id.attractionTextView);
        attractionTextView.setText(currentTour.getAttractionName());

        // set description text view
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.descriptionTextView);
        descriptionTextView.setText(currentTour.getDescription());

        // set location text view
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.locationTextView);
        locationTextView.setText(currentTour.getLocation());

        // set image view. Find imageview from list_item.xml
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        // check if an image is provided for this word or not
        if (currentTour.hasImage()) {
            // if image available, display image from resource id
            image.setImageResource(currentTour.getImageResourceId());
            // make view visible
            image.setVisibility(View.VISIBLE);
        } else {
            // or else make view completely gone
            image.setVisibility(View.GONE);
        }

        // set theme color for list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        // find the color that the resource id maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        // set background color of the text container view
        textContainer.setBackgroundColor(color);

        return listItemView;

    }

}

