package com.android.kutmoblie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;


public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder> {
    private Context mcontext;
    private ArrayList<Event> mEvent;

    public EventAdapter(Context context, ArrayList<Event> events){
        mcontext = context;
        mEvent = events;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mcontext).inflate(R.layout.news_cardview ,parent,false);
        return new EventViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        Event currentitem = mEvent.get(position);
        String subject = currentitem.getSubject();
        Date start_date = currentitem.getStart_date();
        Date end_date = currentitem.getEnd_date();
        Time start_time = currentitem.getStart_time();
        Time end_time = currentitem.getEnd_time();

        holder.subject.setText(subject);
        holder.start_time.setText((CharSequence) start_time);
        holder.start_date.setText((CharSequence) start_date);
        holder.end_time.setText((CharSequence) end_time);
        holder.end_date.setText((CharSequence) end_date);

    }

    @Override
    public int getItemCount() {
        return mEvent.size();
    }
    public class EventViewHolder extends RecyclerView.ViewHolder {
        public TextView subject;
        public TextView start_time;
        public TextView start_date;
        public TextView end_time;
        public TextView end_date;

        public EventViewHolder(@NonNull View itemView) {
            super(itemView);
            subject = itemView.findViewById(R.id.event_subject);
            start_time = itemView.findViewById(R.id.event_starttime);
            start_date = itemView.findViewById(R.id.event_startdate);
            end_date = itemView.findViewById(R.id.event_enddate);
            end_time = itemView.findViewById(R.id.event_endtime);


        }
    }
}