package com.example.newsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
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

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager layoutManager;
    MyAdapter mAdapter;
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

        mRecyclerView = findViewById(R.id.RecyclerView);
        mAdapter = new MyAdapter(this, list);
        layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(layoutManager);
    }
}