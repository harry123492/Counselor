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

public class SmokeFree extends Fragment {

    private View view;
    private LinearLayout smoke;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.smokefree, container, false);


        smoke = view.findViewById(R.id.smoke);

        smoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("fromMenu", "메뉴");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                Smoke smoke = new Smoke();
                smoke.setArguments(bundle);
                transaction.replace(R.id.aaaaa, smoke);
                transaction.commit();




            }
        });

        return view;
    }
}
