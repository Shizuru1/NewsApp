package com.example.newsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView, tRecyclerView;
    RecyclerView.LayoutManager layoutManager, tLayoutManager;
    MyAdapter mAdapter;
    MyTopAdapter tAdapter;
    List<MyDataModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();
        list.add(new MyDataModel(R.drawable.ic_launcher_background, "Placeholder", "Lorem ipsum dolor sit amet"));
        list.add(new MyDataModel(R.drawable.ic_launcher_background, "Placeholder", "Lorem ipsum dolor sit amet"));
        list.add(new MyDataModel(R.drawable.ic_launcher_background, "Placeholder", "Lorem ipsum dolor sit amet"));
        list.add(new MyDataModel(R.drawable.ic_launcher_background, "Placeholder", "Lorem ipsum dolor sit amet"));
        list.add(new MyDataModel(R.drawable.ic_launcher_background, "Placeholder", "Lorem ipsum dolor sit amet"));
        list.add(new MyDataModel(R.drawable.ic_launcher_background, "Placeholder", "Lorem ipsum dolor sit amet"));
        list.add(new MyDataModel(R.drawable.ic_launcher_background, "Placeholder", "Lorem ipsum dolor sit amet"));
        list.add(new MyDataModel(R.drawable.ic_launcher_background, "Placeholder", "Lorem ipsum dolor sit amet"));
        list.add(new MyDataModel(R.drawable.ic_launcher_background, "Placeholder", "Lorem ipsum dolor sit amet"));
        list.add(new MyDataModel(R.drawable.ic_launcher_background, "Placeholder", "Lorem ipsum dolor sit amet"));

        mRecyclerView = findViewById(R.id.RecyclerView);
        tRecyclerView = findViewById(R.id.RecyclerView3);
        mAdapter = new MyAdapter(this, list.subList(3,list.size()));
        mRecyclerView.setAdapter(mAdapter);
        tAdapter = new MyTopAdapter(this, list.subList(0,3));
        tRecyclerView.setAdapter(tAdapter);
//      layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        layoutManager = new GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false);
        tLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
        tRecyclerView.setLayoutManager(tLayoutManager);
    }
}