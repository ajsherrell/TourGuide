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

public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // arraylist of attractions
        final ArrayList<Tour> tours = new ArrayList<Tour>();

        // add elements to array list
        tours.add(new Tour(R.drawable.the_alamo, R.string.alamo, R.string.alamo_description, R.string.alamo_location));
        tours.add(new Tour(R.drawable.tower, R.string.tower, R.string.tower_description, R.string.tower_location));
        tours.add(new Tour(R.drawable.river_walk, R.string.river_walk, R.string.river_walk_description, R.string.river_walk_location));
        tours.add(new Tour(R.drawable.seaworld, R.string.seaworld, R.string.seaworld_description, R.string.seaworld_location));
        tours.add(new Tour(R.drawable.sixflags, R.string.sixflags, R.string.sixflags_description, R.string.sixflags_lccation));
        tours.add(new Tour(R.drawable.caves, R.string.caves, R.string.caves_description, R.string.caves_location));
        tours.add(new Tour(R.drawable.zoo, R.string.zoo, R.string.zoo_description, R.string.zoo_location));
        tours.add(new Tour(R.drawable.witt, R.string.museum, R.string.museum_description, R.string.museum_location));
        tours.add(new Tour(R.drawable.la_villita, R.string.shops, R.string.shops_description, R.string.shops_location));
        tours.add(new Tour(R.drawable.cathedral, R.string.church, R.string.church_description, R.string.church_location));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.category_attractions);

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
