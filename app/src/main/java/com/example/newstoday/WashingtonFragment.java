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

public class WashingtonFragment extends Fragment {

    public WashingtonFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<TourSpot> tourSpots = new ArrayList<>();
        tourSpots.add(new TourSpot(getResources().getString(R.string.space_needle_name), getResources().getString(R.string.space_needle_desc), R.drawable.space_needle));
        tourSpots.add(new TourSpot(getResources().getString(R.string.leavenworth_name), getResources().getString(R.string.leavenworth_desc), R.drawable.leavenworth));
        tourSpots.add(new TourSpot(getResources().getString(R.string.poulsbo_name), getResources().getString(R.string.poulsbo_desc), R.drawable.poulsbo));
        tourSpots.add(new TourSpot(getResources().getString(R.string.mount_rainer_name), getResources().getString(R.string.mount_rainer_desc), R.drawable.mount_rainier));
        tourSpots.add(new TourSpot(getResources().getString(R.string.amazon_spheres_name), getResources().getString(R.string.amazon_spheres_desc), R.drawable.amazon_spheres));
        tourSpots.add(new TourSpot(getResources().getString(R.string.microsoft_name), getResources().getString(R.string.microsoft_desc), R.drawable.microsoft));
        tourSpots.add(new TourSpot(getResources().getString(R.string.uw_name), getResources().getString(R.string.uw_desc)));
        tourSpots.add(new TourSpot(getResources().getString(R.string.snoqualmie_falls_name), getResources().getString(R.string.snoqualmie_falls_desc), R.drawable.snoqualmie_falls));
        tourSpots.add(new TourSpot(getResources().getString(R.string.pullman_name), getResources().getString(R.string.pullman_desc), R.drawable.pullman));

        TourSpotAdapter tourSpotAdapter = new TourSpotAdapter(getActivity(), tourSpots, R.color.washington);
        ListView listView = (ListView) rootView.findViewById(R.id.tour_list);
        listView.setAdapter(tourSpotAdapter);

        return rootView;
    }
}
