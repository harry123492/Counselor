package com.example.counselor;

import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class JinjuFamily extends Fragment  {
    private FragmentManager fragmentManager;
    private View view;
    private Button button;
    private String result;
    private androidx.fragment.app.FragmentManager fm;
    private FragmentTransaction ft;
    private BottomNavigationView infoBar;
    private BottomNavigationView infoBar2;
    ScrollView scrollView;
    private Button AddictionCallButton;
    Dialog mDialog;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.jinjufamily, container, false);
        button = view.findViewById(R.id.menu_return);
        infoBar = view.findViewById(R.id.info_bar);
        infoBar2 = view.findViewById(R.id.info_bar2);
        AddictionCallButton = view.findViewById(R.id.addictioncall_btn);
        scrollView = view.findViewById(R.id.info_view);
        mDialog = new Dialog(getActivity());
        if (getArguments() != null) {
            result = getArguments().getString("fromMenu");
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle(); // 무언가를 담을 준비를 할 수 있는 보따리
                bundle.putString("fromdodream", "중독관리");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                Hearing hearing = new Hearing();
                hearing.setArguments(bundle);
                transaction.replace(R.id.aaaaa, hearing);
                transaction.commit();
            }
        });
        infoBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_first:
                        scrollView.scrollTo(0, 0);
                        break;
                    case R.id.action_second:
                        scrollView.scrollTo(0, 1575);
                        break;
                    case R.id.action_third:
                        scrollView.scrollTo(0, 3150);
                        break;
                }
                return false;
            }
        });
        infoBar2.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_four:
                        scrollView.scrollTo(0, 4725);
                        break;
                    case R.id.action_five:
                        scrollView.scrollTo(0, 6300);
                        break;
                    case R.id.action_six:
                        ShowPopup();

                        break;
                }
                return false;
            }
        });
        return view;
    }
    public void ShowPopup(){
        TextView txtclose;
        Button call_btn;
        mDialog.setContentView(R.layout.jinjufamily_call);
        txtclose = (TextView) mDialog.findViewById(R.id.jinjufamilycancel_btn);
        call_btn = (Button) mDialog.findViewById(R.id.jinjufamilycall_btn);
        call_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CallTo = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:055-749-5445"));
                startActivity(CallTo);
            }
        });
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.dismiss();
            }
        });
        mDialog.show();
    }
}

