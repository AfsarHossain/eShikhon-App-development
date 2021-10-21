package com.example.gridlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView cricketerGridView;
    CustomGridAdapter adapter;
    List<Cricketer> cricketerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cricketerGridView = findViewById(R.id.gridview);
        cricketerList = new ArrayList<>();

        setCricketerData();

        adapter = new CustomGridAdapter(this, cricketerList);
        cricketerGridView.setAdapter(adapter);
    }

    private void setCricketerData() {

        Cricketer mash = new Cricketer(R.drawable.mash, "Mashrafi");
        Cricketer tamim = new Cricketer(R.drawable.tamim, "Tamim");
        Cricketer shakib = new Cricketer(R.drawable.shakib, "Shakib");
        Cricketer mushi = new Cricketer(R.drawable.mushi, "Mushifiqur");
        Cricketer musta = new Cricketer(R.drawable.musta, "Mustafiz");

        cricketerList.add(mash);
        cricketerList.add(tamim);
        cricketerList.add(shakib);
        cricketerList.add(mushi);
        cricketerList.add(musta);

        cricketerList.add(mash);
        cricketerList.add(tamim);
        cricketerList.add(shakib);
        cricketerList.add(mushi);
        cricketerList.add(musta);
    }
}