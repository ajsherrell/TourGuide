package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // arraylist of attractions
        final ArrayList<Tour> tours = new ArrayList<Tour>();

        // add elements to array list
        tours.add(new Tour(getString(R.string.wyndham), getString(R.string.wyndham_description), getString(R.string.wyndham_location)));
        tours.add(new Tour(getString(R.string.marriott), getString(R.string.marriott_description), getString(R.string.marriott_location)));
        tours.add(new Tour(getString(R.string.westin), getString(R.string.westin_description), getString(R.string.westin_location)));
        tours.add(new Tour(getString(R.string.hyatt), getString(R.string.hyatt_description), getString(R.string.hyatt_location)));
        tours.add(new Tour(getString(R.string.drury), getString(R.string.drury_description), getString(R.string.drury_location)));
        tours.add(new Tour(getString(R.string.indigo), getString(R.string.indigo_description), getString(R.string.indigo_location)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.category_hotels);

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
