package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // arraylist of attractions
        final ArrayList<Tour> tours = new ArrayList<Tour>();

        // add elements to array list
        tours.add(new Tour(getString(R.string.brackenridge), getString(R.string.brackenridge_description), getString(R.string.brackenridge_location)));
        tours.add(new Tour(getString(R.string.schnabel), getString(R.string.schnabel_description), getString(R.string.schnabel_location)));
        tours.add(new Tour(getString(R.string.denman), getString(R.string.denman_description), getString(R.string.denman_location)));
        tours.add(new Tour(getString(R.string.mission), getString(R.string.mission_description), getString(R.string.mission_location)));
        tours.add(new Tour(getString(R.string.lions), getString(R.string.lions_description), getString(R.string.lions_location)));
        tours.add(new Tour(getString(R.string.lady), getString(R.string.lady_description), getString(R.string.lady_location)));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.category_parks);

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
