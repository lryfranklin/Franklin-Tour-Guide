package com.example.newstoday;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class TourSpotAdapter extends ArrayAdapter<TourSpot> {

    private final static String LOG_TAG = TourSpotAdapter.class.getSimpleName();
    private int mColor;

    public TourSpotAdapter(Activity context, ArrayList<TourSpot> tourSpots, int color) {
        super(context, 0, tourSpots);
        this.mColor = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        boolean reverseFlag = position % 2 != 0;
        if(convertView == null) {
            if (reverseFlag) {
                convertView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            } else {
                convertView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item_reverse, parent, false);
            }
        }

        TourSpot tourSpot = getItem(position);
        Log.i(LOG_TAG, tourSpot.getSpotName());
        Log.i(LOG_TAG, "" + position);

        // Switch positions of image and words for even items

        ImageView imageView = reverseFlag ? (ImageView) convertView.findViewById(R.id.tour_image)
                : (ImageView) convertView.findViewById(R.id.tour_image_reverse);
        // Check if an image is provided for this currentWord or not
        if (tourSpot.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(tourSpot.getSpotImage());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        LinearLayout tourSpotView = reverseFlag ? (LinearLayout) convertView.findViewById(R.id.tour_spot)
                : (LinearLayout) convertView.findViewById(R.id.tour_spot_reverse);
        tourSpotView.setBackgroundColor(ContextCompat.getColor(getContext(), this.mColor));

        TextView tourSpotNameView = reverseFlag ? (TextView) convertView.findViewById(R.id.spot_name)
                : (TextView) convertView.findViewById(R.id.spot_name_reverse);
        tourSpotNameView.setText(tourSpot.getSpotName());

        TextView tourSpotDescriptionView = reverseFlag ? (TextView) convertView.findViewById(R.id.spot_description)
                : (TextView) convertView.findViewById(R.id.spot_description_reverse);
        tourSpotDescriptionView.setText(tourSpot.getSpotDescription());

        return convertView;
    }
}
