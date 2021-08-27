package com.android.kutmoblie;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainFragment extends Fragment {
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
        public void calender_selected();
        public void news_selected();
        public void events_selected();
        public void heiat_selected();
        public void phone_selected();
        public void walfare_selected();
        public void social_selected();
        public void samad_selected();
        public void golestan_selected();

    }

    private void configureImageButton(View view) {
        ImageButton cal_b = (ImageButton) view.findViewById(R.id.calender_main_btn);
        ImageButton news_b = (ImageButton) view.findViewById(R.id.news_main_btn);
        ImageButton notif_b = (ImageButton) view.findViewById(R.id.events_main_btn);
        ImageButton photo_b = (ImageButton) view.findViewById(R.id.heiat_main_btn);
        ImageButton phone_b = (ImageButton) view.findViewById(R.id.phone_main_btn);
        ImageButton walfare_b = (ImageButton) view.findViewById(R.id.walfares_main_btn);
        ImageButton social_b = (ImageButton) view.findViewById(R.id.social_main_btn);
        ImageButton samad_b = (ImageButton) view.findViewById(R.id.samad_main_btn);
        ImageButton golestan_b = (ImageButton) view.findViewById(R.id.golestan_main_btn);

        cal_b.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) { listener.calender_selected();
          }
        });
            news_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               listener.news_selected();
            }
        });
        notif_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.events_selected();
            }
        });
        photo_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.heiat_selected();
            }
        });
        phone_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.phone_selected();
            }
        });
        walfare_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { listener.walfare_selected();
            }
        });
        social_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.social_selected();
            }
        });
        samad_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.samad_selected();
            }
        });
        golestan_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.golestan_selected();
            }
        });
    }

}
