package com.example.list;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomListAdapter extends ArrayAdapter<String> {

    private Activity context;
    private String[] fruits;
    private Integer[] images;


    public CustomListAdapter(@NonNull Activity context, String[] fruits, Integer[] images) {

        super(context, R.layout.mycustomlist, fruits);

        this.context = context;
        this.fruits = fruits;
        this.images = images;
    }

    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();

        View rowView = inflater.inflate(R.layout.mycustomlist, null, true);

        TextView fruitTv = rowView.findViewById(R.id.name);
        ImageView imageTv = rowView.findViewById(R.id.image);

        fruitTv.setText(fruits[position]);
        imageTv.setImageResource(images[position]);

        return rowView;
    }
}
