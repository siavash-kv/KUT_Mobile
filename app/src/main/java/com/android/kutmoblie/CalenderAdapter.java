package com.android.kutmoblie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Random;


public class CalenderAdapter extends RecyclerView.Adapter<CalenderAdapter.CalenderViewHolder> {


    @NonNull
    @Override
    public CalenderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CalenderViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class CalenderViewHolder extends RecyclerView.ViewHolder {

        public CalenderViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}