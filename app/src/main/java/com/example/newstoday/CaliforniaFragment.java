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

public class CaliforniaFragment extends Fragment {

    public CaliforniaFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<TourSpot> tourSpots = new ArrayList<>();
        tourSpots.add(new TourSpot(getResources().getString(R.string.napa_county_name), getResources().getString(R.string.napa_valley_desc), R.drawable.napa_valley));
        tourSpots.add(new TourSpot(getResources().getString(R.string.point_reyes_name), getResources().getString(R.string.point_reyes_desc), R.drawable.point_reyes));
        tourSpots.add(new TourSpot(getResources().getString(R.string.joshua_tree_name), getResources().getString(R.string.joshua_tree_desc), R.drawable.joshua_tree));
        tourSpots.add(new TourSpot(getResources().getString(R.string.channel_islands_name), getResources().getString(R.string.channel_islands_desc), R.drawable.channel_islands));
        tourSpots.add(new TourSpot(getResources().getString(R.string.death_valley_name), getResources().getString(R.string.death_valley_desc), R.drawable.death_valley));
        tourSpots.add(new TourSpot(getResources().getString(R.string.yosemite_name), getResources().getString(R.string.yosemite_desc), R.drawable.yosemite));
        tourSpots.add(new TourSpot(getResources().getString(R.string.hollywood_name), getResources().getString(R.string.hollywood_desc), R.drawable.hollywood));
        tourSpots.add(new TourSpot(getResources().getString(R.string.half_moon_bay_name), getResources().getString(R.string.half_moon_bay_desc), R.drawable.half_moon_bay));
        tourSpots.add(new TourSpot(getResources().getString(R.string.mystery_spot_name), getResources().getString(R.string.mystery_spot_desc), R.drawable.mystery_spot));

        TourSpotAdapter tourSpotAdapter = new TourSpotAdapter(getActivity(), tourSpots, R.color.california);
        ListView listView = (ListView) rootView.findViewById(R.id.tour_list);
        listView.setAdapter(tourSpotAdapter);

        return rootView;
    }
}
