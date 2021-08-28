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
import java.util.Date;
import java.util.Random;


public class AnnouncementAdapter extends RecyclerView.Adapter<AnnouncementAdapter.AnnouncementViewHolder> {
 private Context mcontext;
 private ArrayList<Announcement> mAnnouncement;

  public AnnouncementAdapter(Context context, ArrayList<Announcement> announcements){
      mcontext = context;
      mAnnouncement = announcements;
  }

    @NonNull
    @Override
    public AnnouncementViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mcontext).inflate(R.layout.calender_cardview ,parent,false);
        return new AnnouncementViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AnnouncementViewHolder holder, int position) {
     Announcement currentitem = mAnnouncement.get(position);
     String title = currentitem.getTitle();
     String article = currentitem.getArticle();
     Date article_date = currentitem.getArticle_date();
     String article_link = currentitem.getArticle_link();
     String cover_link = currentitem.getCover_link();

     holder.title.setText(title);
     holder.article.setText(article);
     holder.article_link.setText(article_link);
     holder.cover_link.setText(cover_link);
     holder.article_date.setText((CharSequence) article_date);

    }

    @Override
    public int getItemCount() {
        return mAnnouncement.size();
    }
    public class AnnouncementViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public TextView article;
        public TextView article_date;
        public TextView cover_link;
        public TextView article_link;

        public AnnouncementViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.calender_title);
            article = itemView.findViewById(R.id.calender_article);
            article_date = itemView.findViewById(R.id.calender_articledate);
            article_link = itemView.findViewById(R.id.calender_articlelink);
            cover_link = itemView.findViewById(R.id.calender_coverlink);


        }
    }
}