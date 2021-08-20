package com.android.kutmoblie;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class mainfrag extends Fragment {
private onFragmentBtnSelected listener;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        configureImageButton(view);

        return view;
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof onFragmentBtnSelected)
            listener = (onFragmentBtnSelected) context;
    }
    public interface onFragmentBtnSelected{
        public void calselected();
        public void newsselected();
        public void notifselected();
        public void photoselected();
        public void phoneselected();
        public void mapselected();
        public void socialselected();
        public void samadselected();
        public void golestanselected();

    }

    private void configureImageButton(View view) {
        ImageButton cal_b = (ImageButton) view.findViewById(R.id.cal_btn);
        ImageButton news_b = (ImageButton) view.findViewById(R.id.news_btn);
        ImageButton notif_b = (ImageButton) view.findViewById(R.id.notif_btn);
        ImageButton photo_b = (ImageButton) view.findViewById(R.id.photo_btn);
        ImageButton phone_b = (ImageButton) view.findViewById(R.id.phone_btn);
        ImageButton map_b = (ImageButton) view.findViewById(R.id.map_btn);
        ImageButton social_b = (ImageButton) view.findViewById(R.id.social_btn);
        ImageButton samad_b = (ImageButton) view.findViewById(R.id.samad_btn);
        ImageButton golestan_b = (ImageButton) view.findViewById(R.id.golestan_btn);

        cal_b.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
         listener.calselected();
          }
        });
            news_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               listener.newsselected();
            }
        });
        notif_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.notifselected();
            }
        });
        photo_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.photoselected();
            }
        });
        phone_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.phoneselected();
            }
        });
        map_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.mapselected();
            }
        });
        social_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.socialselected();
            }
        });
        samad_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.samadselected();
            }
        });
        golestan_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.golestanselected();
            }
        });
    }

}
