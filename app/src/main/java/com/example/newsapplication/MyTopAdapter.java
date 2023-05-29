package com.example.newsapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyTopAdapter extends RecyclerView.Adapter<MyTopAdapter.MyTopViewHolder> {

    Context context;
    List<MyDataModel> list;

    public MyTopAdapter(Context context, List<MyDataModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyTopAdapter.MyTopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.top_recycler_view_layout, parent, false);
        return new MyTopViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyTopAdapter.MyTopViewHolder holder, int position) {
        holder.image.setImageResource(list.get(position).getImageID());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                FragmentManager fragmentManager = activity.getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, NewsFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyTopViewHolder extends RecyclerView.ViewHolder {

        ImageView image;

        public MyTopViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView3);
        }
    }
}