package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * a simple {@link Fragment} subclass.
 */

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // arraylist of attractions
        final ArrayList<Tour> tours = new ArrayList<Tour>();

        // add elements to array list
        tours.add(new Tour(getString(R.string.rosarios), getString(R.string.rosarios_description), getString(R.string.rosarios_location)));
        tours.add(new Tour(getString(R.string.palm), getString(R.string.palm_description), getString(R.string.palm_location)));
        tours.add(new Tour(getString(R.string.bella), getString(R.string.bella_description), getString(R.string.bella_location)));
        tours.add(new Tour(getString(R.string.chart), getString(R.string.chart_description), getString(R.string.chart_location)));
        tours.add(new Tour(getString(R.string.silo), getString(R.string.silo_description), getString(R.string.silo_location)));
        tours.add(new Tour(getString(R.string.tycoon), getString(R.string.tycoon_description), getString(R.string.tycoon_location)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.category_restaurants);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }

}
