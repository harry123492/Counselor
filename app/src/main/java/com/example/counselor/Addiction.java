package com.example.counselor;

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
/**<h1>진주 중독관리 통합지원센터의 상세정보창</h1>
 * 진주 중독관리 통합지원센터의 상세 정보를 담는 화면을 구성한다.
 * 카테고리바와 동일하게, 구역을 설정한다.
 *
 *<b>Note:</b>
 * Fragment 를 상속받는다.
 * 카테고리바에서 선택하면 해당 내용이 위치하는 곳으로 스크롤한다.
 * 예약하기 선택시 예약 다이얼로그를 호출한다.
 * 예약 다이얼로그는 각 상담소 상세정보창 클래스별로 별도로 존재한다.
 *
 * 코딩표준 작성자: 박승규
 * 2020-11-21
 * */
public class Addiction extends Fragment  {
    private FragmentManager fFragmentManager;
    private View fView;
    private Button fButton;
    private String fResult;
    private androidx.fragment.app.FragmentManager fFm;
    private FragmentTransaction fFt;
    private BottomNavigationView fInfoBar;
    private BottomNavigationView fInfoBar2;
    ScrollView scrollView;
    Dialog mDialog;
    @Nullable
    @Override
    /**
     * 이 메소드는 fragment에 사용할 view를 만드는 과정이다.
     * 이전 fView에서 상담소를 클릭했을때, 상세정보 내용을 보여준다.
     * fView : addiction.xml을 적용시키기 위한 View형 변수
     * fButton : menu_return을 적용시킬 Button형 변수
     * fInfoBar : info_bar을 적용시키기 위한 BottomNavigationView형 변수
     * fInfoBar2 : info_bar2을 적용시키기 위한 BottomNavigationView형 변수
     * @param inflater: 해당 메소드를 실행했을 때, 어디에 화면을 띄울 것인지 알려준다.
     * @param container: 상담실 리스트를 가지고 있다.
     * @param savedInstanceState: 액티비티를 중단할 때 호출하여 임시적으로 데이터를 저장하는 변수
     * @return fView: 상담실 리스트를 보여주는 View 를 리턴한다.
     */
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fView = inflater.inflate(R.layout.addiction, container, false);
        fButton = fView.findViewById(R.id.menu_return);
        fInfoBar = fView.findViewById(R.id.info_bar);
        fInfoBar2 = fView.findViewById(R.id.info_bar2);
        scrollView = fView.findViewById(R.id.info_view);
        mDialog = new Dialog(getActivity());
        if (getArguments() != null) {
            fResult = getArguments().getString("fromMenu");
        }
        fButton.setOnClickListener(new View.OnClickListener() {
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
        fInfoBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_first:
                        scrollView.scrollTo(0, 0);
                        break;
                    case R.id.action_second:
                        scrollView.scrollTo(0, 1200);
                        break;
                    case R.id.action_third:
                        scrollView.scrollTo(0, 2400);
                        break;
                }
                return false;
            }
        });
        fInfoBar2.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_four:
                        scrollView.scrollTo(0, 3600);
                        break;
                    case R.id.action_five:
                        scrollView.scrollTo(0, 4800);
                        break;
                    case R.id.action_six:
                        ShowPopup();

                        break;
                }
                return false;
            }
        });
        return fView;
    }
    /**
     * 이 메소드는 예약하기 팝업을 보여주는 과정이다.
     * txtclose : 팝업을 닫는 명령을 담는 변수
     * fAddictioncall_btn : 전화 연결 명령을 담는 변수
     */
    public void ShowPopup(){
        TextView txtclose;
        Button fAddictioncall_btn;
        mDialog.setContentView(R.layout.addiction_call);
        txtclose = (TextView) mDialog.findViewById(R.id.addictioncancel_btn);
        fAddictioncall_btn = (Button) mDialog.findViewById(R.id.addictioncall_btn);
        fAddictioncall_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CallToAddiction = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:055-758-7801"));
                startActivity(CallToAddiction);
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
