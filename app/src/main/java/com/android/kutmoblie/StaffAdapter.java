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


public class StaffAdapter extends RecyclerView.Adapter<StaffAdapter.StaffViewHolder> {
    private Context mcontext;
    private ArrayList<Staff> mStaff;

    public StaffAdapter(Context context, ArrayList<Staff> staffs){
        mcontext = context;
        mStaff = staffs;
    }

    @NonNull
    @Override
    public StaffViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mcontext).inflate(R.layout.staff_cardview ,parent,false);
        return new StaffViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull StaffViewHolder holder, int position) {
        Staff currentitem = mStaff.get(position);
        String first_name = currentitem.getFirst_name();
        String last_name = currentitem.getLast_name();
        String profile_name = currentitem.getProfile_name();
        int group = currentitem.getGroup();
        int institute = currentitem.getInstitute();
        String responsibility = currentitem.getResponsibility();
        String email = currentitem.getEmail();
        String education = currentitem.getEducation();
        String resume_link = currentitem.getResume_link();
        Date date_joined = currentitem.getDate_joined();

        holder.first_name.setText(first_name);
        holder.last_name.setText((CharSequence)last_name);
        holder.profile_name.setText((CharSequence) profile_name);
        holder.group.setText(group);
        holder.institute.setText(institute);
        holder.responsibility.setText(responsibility);
        holder.email.setText(email);
        holder.education.setText(education);
        holder.resume_link.setText(resume_link);
        holder.date_joined.setText((CharSequence) date_joined);

    }

    @Override
    public int getItemCount() {
        return mStaff.size();
    }
    public class StaffViewHolder extends RecyclerView.ViewHolder {
        public TextView first_name;
        public TextView last_name;
        public TextView profile_name;
        public TextView group;
        public TextView institute;
        public TextView responsibility;
        public TextView internal_phone_line;
        public TextView email;
        public TextView education;
        public TextView resume_link;
        public TextView date_joined;

        public StaffViewHolder(@NonNull View itemView) {
            super(itemView);
            first_name = itemView.findViewById(R.id.staff_firstname);
            last_name = itemView.findViewById(R.id.staff_lastname);
            profile_name = itemView.findViewById(R.id.staff_profilename);
            group = itemView.findViewById(R.id.staff_group);
            institute = itemView.findViewById(R.id.staff_institute);
            education = itemView.findViewById(R.id.staff_education);
            responsibility = itemView.findViewById(R.id.staff_responsibility);
            email = itemView.findViewById(R.id.staff_email);
            resume_link = itemView.findViewById(R.id.staff_resume);
            date_joined = itemView.findViewById(R.id.staff_datejoined);


        }
    }
}