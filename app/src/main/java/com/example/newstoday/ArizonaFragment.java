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

public class ArizonaFragment extends Fragment {

    public ArizonaFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<TourSpot> tourSpots = new ArrayList<>();
        tourSpots.add(new TourSpot(getResources().getString(R.string.antelope_canyon_name), getResources().getString(R.string.antelope_canyon_desc), R.drawable.antelope_canyon));
        tourSpots.add(new TourSpot(getResources().getString(R.string.grand_canyon_name), getResources().getString(R.string.grand_canyon_desc), R.drawable.grand_canyon));
        tourSpots.add(new TourSpot(getResources().getString(R.string.horseshoe_bend_name), getResources().getString(R.string.horseshoe_bend_desc), R.drawable.horseshow_bend));
        tourSpots.add(new TourSpot(getResources().getString(R.string.hoover_dam_name), getResources().getString(R.string.hoover_dam_desc)));
        tourSpots.add(new TourSpot(getResources().getString(R.string.asu_name), getResources().getString(R.string.asu_desc), R.drawable.arizona_state_university));
        tourSpots.add(new TourSpot(getResources().getString(R.string.u_of_a_name), getResources().getString(R.string.u_of_a_desc), R.drawable.university_of_arizona));
        tourSpots.add(new TourSpot(getResources().getString(R.string.prescott_name), getResources().getString(R.string.prescott_desc), R.drawable.prescott));
        tourSpots.add(new TourSpot(getResources().getString(R.string.talking_stick_arena_name), getResources().getString(R.string.talking_stick_arena_desc), R.drawable.talking_stick_arena));

        TourSpotAdapter tourSpotAdapter = new TourSpotAdapter(getActivity(), tourSpots, R.color.arizona);
        ListView listView = (ListView) rootView.findViewById(R.id.tour_list);
        listView.setAdapter(tourSpotAdapter);

        return rootView;
    }
}
