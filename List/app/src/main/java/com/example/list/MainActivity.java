package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] fruits = {"Apple", "Banana", "Grape", "Pineapple", "Mango"};
    Integer[] images = {R.drawable.apel, R.drawable.banana, R.drawable.grape, R.drawable.pineapple, R.drawable.mango};

    CustomListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        //ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, fruits);

        adapter = new CustomListAdapter(this, fruits, images);

        listView.setAdapter(adapter);
    }
}