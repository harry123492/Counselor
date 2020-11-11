package com.example.counselor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Family extends Fragment {

    private View view;
    private LinearLayout dodream;
    private LinearLayout sunflower;
    private LinearLayout miso;
    private LinearLayout seed;
    private LinearLayout inmusic;
    private LinearLayout jinjufamily;
    private LinearLayout jinju;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.famaily, container, false);

        dodream = view.findViewById(R.id.dodream);

        dodream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("fromMenu", "메뉴");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                Dodream dodream = new Dodream();
                dodream.setArguments(bundle);
                transaction.replace(R.id.aaaaa, dodream);
                transaction.commit();


            }
        });


        sunflower = view.findViewById(R.id.sunflower);

        sunflower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("fromMenu", "메뉴");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                Sunflower sunflower = new Sunflower();
                sunflower.setArguments(bundle);
                transaction.replace(R.id.aaaaa, sunflower);
                transaction.commit();




            }
        });


        miso = view.findViewById(R.id.miso);

        miso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("fromMenu", "메뉴");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                Miso miso = new Miso();
                miso.setArguments(bundle);
                transaction.replace(R.id.aaaaa, miso);
                transaction.commit();




            }
        });


        seed = view.findViewById(R.id.seed);

        seed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("fromMenu", "메뉴");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                Seed seed = new Seed();
                seed.setArguments(bundle);
                transaction.replace(R.id.aaaaa, seed);
                transaction.commit();




            }
        });


        inmusic = view.findViewById(R.id.inmusic);

        inmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("fromMenu", "메뉴");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                InMusic inMusic = new InMusic();
                inMusic.setArguments(bundle);
                transaction.replace(R.id.aaaaa, inMusic);
                transaction.commit();




            }
        });


        jinjufamily = view.findViewById(R.id.jinjufamily);

        jinjufamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("fromMenu", "메뉴");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                JinjuFamily jinjuFamily = new JinjuFamily();
                jinjuFamily.setArguments(bundle);
                transaction.replace(R.id.aaaaa, jinjuFamily);
                transaction.commit();




            }
        });



        jinju = view.findViewById(R.id.jinju);

        jinju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("fromMenu", "메뉴");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                Jinju jinju = new Jinju();
                jinju.setArguments(bundle);
                transaction.replace(R.id.aaaaa, jinju);
                transaction.commit();




            }
        });



        return view;
    }
}