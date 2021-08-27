package com.android.kutmoblie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class CalenderFragment extends Fragment {
    RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calender,container,false);
        recyclerView= view.findViewById(R.id.calender_recyclerview);
        recyclerView.setHasFixedSize(true);
        new LinearLayoutManager(view.getContext());
        CalenderAdapter calenderAdapter = new CalenderAdapter();
        recyclerView.setAdapter(new CalenderAdapter());
        return view;
    }

}
