package com.example.counselor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Wee extends Fragment {

    private View view;
    private Button button;
    private String result;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.wee, container, false);

        button = view.findViewById(R.id.menu_return);

        if(getArguments() != null){
            result = getArguments().getString("fromMenu");

        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle(); // 무언가를 담을 준비를 할 수 있는 보따리
                bundle.putString("fromdodream", "위센터");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                Hearing hearing = new Hearing();
                hearing.setArguments(bundle);
                transaction.replace(R.id.main_frame, hearing);
                transaction.commit();


            }
        });

        return view;
    }


}
