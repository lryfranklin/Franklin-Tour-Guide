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

public class NevadaFragment extends Fragment {

    public NevadaFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<TourSpot> tourSpots = new ArrayList<>();
        tourSpots.add(new TourSpot(getResources().getString(R.string.vegas_name), getResources().getString(R.string.vegas_desc), R.drawable.las_vegas));
        tourSpots.add(new TourSpot(getResources().getString(R.string.lake_tahoe_name), getResources().getString(R.string.lake_tahoe_desc), R.drawable.lake_tahoe));
        tourSpots.add(new TourSpot(getResources().getString(R.string.red_rock_canyon_name), getResources().getString(R.string.red_rock_canyon_desc), R.drawable.red_rock_canyon));
        tourSpots.add(new TourSpot(getResources().getString(R.string.lake_mead_name), getResources().getString(R.string.lake_mead_desc), R.drawable.lake_mead));
        tourSpots.add(new TourSpot(getResources().getString(R.string.valley_of_fire_name), getResources().getString(R.string.valley_of_fire_desc), R.drawable.valley_of_fire));
        tourSpots.add(new TourSpot(getResources().getString(R.string.great_basin_name), getResources().getString(R.string.great_basin_desc), R.drawable.great_basin));

        TourSpotAdapter tourSpotAdapter = new TourSpotAdapter(getActivity(), tourSpots, R.color.nevada);
        ListView listView = (ListView) rootView.findViewById(R.id.tour_list);
        listView.setAdapter(tourSpotAdapter);

        return rootView;
    }
}
