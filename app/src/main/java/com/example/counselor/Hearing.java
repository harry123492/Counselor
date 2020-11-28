package com.example.counselor;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
/*<h1>상담실 리스트의  클릭이벤트</h1>
*로딩 이후에 나오는 화면에서 사용한다.
*심리 카테고리에서 특정 상담실을 클릭했을 때, 해당 상담실의 상세정보창을 보여준다.
*
*<b>Note:</b>
* Fragment 를 상속받는다.
* 리스트에 보여진 상담실을 클릭하면 해당 상담실의 상세정보창으로 이동한다.
*
* 코딩표준 작성자: 김동현
* 2020-11-28
* */
public class Hearing extends Fragment {

    private View fView;
    private LinearLayout fDodream;
    private LinearLayout fSunflower;
    private LinearLayout fMiso;
    private LinearLayout fJinju;
    private LinearLayout fToktok;

    /*
    * 해당 메소드는 심리상담 탭을 클릭했을 때,
    * 리스트 형식으로 상담실을 보여준다.
    *
    * @param inflater: 해당 메소드를 실행했을 때, 어디에 화면을 띄울 것인지 알려준다.
    * @param container: 상담실 리스트를 가지고 있다.
    * @param savedInstanceState: 액티비티를 중단할 때 호출하여 임시적으로 데이터를 저장하는 변수
    * @return fView: 상담실 리스트를 보여주는 View 를 리턴한다.
    * */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fView = inflater.inflate(R.layout.hearing, container, false);

        fDodream = fView.findViewById(R.id.dodream);

        fDodream.setOnClickListener(new View.OnClickListener() {
            /*
            * 해당 메소드는 특정 심리상담센터를 클릭했을 때,
            * 해당 상담센터의 상세정보창으로 이동한다.
            *
            * @param v: 특정 상담센터이다.
            * */
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

        fSunflower = fView.findViewById(R.id.sunflower);

        fSunflower.setOnClickListener(new View.OnClickListener() {
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


        fMiso = fView.findViewById(R.id.miso);

        fMiso.setOnClickListener(new View.OnClickListener() {
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


        fJinju = fView.findViewById(R.id.jinju);

        fJinju.setOnClickListener(new View.OnClickListener() {
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


        fToktok = fView.findViewById(R.id.toktok);

        fToktok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("fromMenu", "메뉴");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                Toktok toktok = new Toktok();
                toktok.setArguments(bundle);
                transaction.replace(R.id.aaaaa, toktok);
                transaction.commit();

            }
        });

        return fView;
    }
}