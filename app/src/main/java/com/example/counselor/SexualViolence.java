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

public class SexualViolence extends Fragment {

    private View view;
    private LinearLayout sunflower;
    private LinearLayout miso;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.sexualviolence, container, false);


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


        return view;
    }
}