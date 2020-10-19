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

public class Youth extends Fragment {

    private View view;

    private LinearLayout dodream;
    private LinearLayout miso;
    private LinearLayout inmusic;
    private LinearLayout jinjufamily;
    private LinearLayout wee;
    private LinearLayout jinju;
    private LinearLayout toktok;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.youth, container, false);

        dodream = view.findViewById(R.id.dodream);

        dodream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("fromMenu", "메뉴");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                Dodream dodream = new Dodream();
                dodream.setArguments(bundle);
                transaction.replace(R.id.main_frame, dodream);
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
                transaction.replace(R.id.main_frame, miso);
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
                transaction.replace(R.id.main_frame, inMusic);
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
                transaction.replace(R.id.main_frame, jinjuFamily);
                transaction.commit();




            }
        });


        wee = view.findViewById(R.id.wee);

        wee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("fromMenu", "메뉴");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                Wee wee = new Wee();
                wee.setArguments(bundle);
                transaction.replace(R.id.main_frame, wee);
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
                transaction.replace(R.id.main_frame, jinju);
                transaction.commit();




            }
        });


        toktok = view.findViewById(R.id.toktok);

        toktok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("fromMenu", "메뉴");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                Toktok toktok = new Toktok();
                toktok.setArguments(bundle);
                transaction.replace(R.id.main_frame, toktok);
                transaction.commit();




            }
        });





        return view;
    }
}
