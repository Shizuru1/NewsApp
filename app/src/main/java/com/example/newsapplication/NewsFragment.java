package com.example.newsapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NewsFragment extends Fragment {

    RecyclerView fRecyclerView;
    RecyclerView.LayoutManager fLayoutManager;
    MyHorizontalAdapter fAdapter;
    List<MyDataModel> list;
    ImageView image;
    TextView title;

    public NewsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        list = new ArrayList<>();
        list.add(new MyDataModel(R.drawable.ic_launcher_background, "Placeholder", "Lorem ipsum dolor sit amet"));
        list.add(new MyDataModel(R.drawable.ic_launcher_background, "Placeholder", "Lorem ipsum dolor sit amet"));
        list.add(new MyDataModel(R.drawable.ic_launcher_background, "Placeholder", "Lorem ipsum dolor sit amet"));
        image = view.findViewById(R.id.imageView2);
        title = view.findViewById(R.id.textView5);
        image.setImageResource(R.drawable.ic_launcher_background);
        title.setText("PLACEHOLDER TITLE");
        fRecyclerView = view.findViewById(R.id.RecyclerView2);
        fAdapter = new MyHorizontalAdapter(view.getContext(), list);
        fLayoutManager = new LinearLayoutManager(view.getContext());
        fRecyclerView.setAdapter(fAdapter);
        fRecyclerView.setLayoutManager(fLayoutManager);
    }
}