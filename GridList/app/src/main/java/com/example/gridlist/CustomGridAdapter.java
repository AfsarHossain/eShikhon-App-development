package com.example.gridlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomGridAdapter extends BaseAdapter {

    Context context;
    List<Cricketer> cricketerList = new ArrayList<>();

    public CustomGridAdapter(Context context, List<Cricketer> cricketerList) {
        this.context = context;
        this.cricketerList = cricketerList;
    }

    @Override
    public int getCount() {
        return cricketerList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View custemView = inflater.inflate(R.layout.item_layout,null);

        ImageView imageView = custemView.findViewById(R.id.imageView);
        TextView textView = custemView.findViewById(R.id.textView);

        imageView.setImageResource(cricketerList.get(position).getImage());
        textView.setText(cricketerList.get(position).getName());

        return custemView;
    }
}
