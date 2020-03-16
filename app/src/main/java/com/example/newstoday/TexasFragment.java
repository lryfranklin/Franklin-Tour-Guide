package com.example.newstoday;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class TexasFragment extends Fragment {

    public TexasFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<TourSpot> tourSpots = new ArrayList<>();
        tourSpots.add(new TourSpot(getResources().getString(R.string.nasa_name), getResources().getString(R.string.nasa_desc), R.drawable.nasa));
        tourSpots.add(new TourSpot(getResources().getString(R.string.big_bend_name), getResources().getString(R.string.big_bend_desc), R.drawable.big_bend));
        tourSpots.add(new TourSpot(getResources().getString(R.string.the_alamo_name), getResources().getString(R.string.the_alamo_desc), R.drawable.the_alamo));
        tourSpots.add(new TourSpot(getResources().getString(R.string.guadalupe_mountains_name), getResources().getString(R.string.guadalupe_mountains_desc), R.drawable.gudalupe_mountains));
        tourSpots.add(new TourSpot(getResources().getString(R.string.padre_island_name), getResources().getString(R.string.padre_island_desc), R.drawable.padre_island));
        tourSpots.add(new TourSpot(getResources().getString(R.string.dallas_name), getResources().getString(R.string.dallas_desc), R.drawable.dallas));
        tourSpots.add(new TourSpot(getResources().getString(R.string.austin_name), getResources().getString(R.string.austin_desc), R.drawable.austin));
        tourSpots.add(new TourSpot(getResources().getString(R.string.toyota_center_name), getResources().getString(R.string.toyota_center_desc)));

        TourSpotAdapter tourSpotAdapter = new TourSpotAdapter(getActivity(), tourSpots, R.color.texas);
        ListView listView = (ListView) rootView.findViewById(R.id.tour_list);
        listView.setAdapter(tourSpotAdapter);

        return rootView;
    }
}
