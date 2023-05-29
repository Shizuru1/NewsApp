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

public class MyHorizontalAdapter extends RecyclerView.Adapter<MyHorizontalAdapter.MyHorizontalViewHolder> {

    Context context;
    List<MyDataModel> list;

    public MyHorizontalAdapter(Context context, List<MyDataModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyHorizontalAdapter.MyHorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.horizontal_recycler_view_layout, parent, false);
        return new MyHorizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHorizontalAdapter.MyHorizontalViewHolder holder, int position) {
        holder.image.setImageResource(list.get(position).getImageID());
        holder.name.setText(list.get(position).getName());
        holder.preview.setText(list.get(position).getPreview());

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

    public static class MyHorizontalViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView name, preview;

        public MyHorizontalViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView4);
            name = itemView.findViewById(R.id.textView3);
            preview = itemView.findViewById(R.id.textView4);
        }
    }
}