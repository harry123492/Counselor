package com.example.counselor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
/*<h1>어플 로딩화면</h1>
* Loading 프로그램은 어플을 실행하면 제일 첫번째로 나타나는 화면을 구현한다.
* <b>참고:</b> 밑의 코드에서 postDelayed에서 3000은 3초를 의미하고 더 큰수를 넣으면 화면이 더 오래 보여진다.
* 코딩표준 작성자: 이중길
* @since 2020-11-21*/

public class Loading extends AppCompatActivity {
    Handler handler;
    Runnable runnable;

/**이 메소드는 화면이 실행되는 동안에 화면에 나타나는 화면이 실행될때 acivity_main2.xml을 제어한다.
 * @param savedInstanceState 액티비티를 중단할 때 호출하여 임시적으로 데이터를 저장하는 변수*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        handler = new Handler();
        runnable = new Runnable() {
            /** 이 메소드는 입력시간동안 설정한 로딩화면을 보여주고 입력한 시간이 지나면
             * MainActivity로 넘어가게 해준다.*/
            @Override
            public void run() {
                startActivity(new Intent(Loading.this, MainActivity.class));
                finish();
            }
        };
        //3sec
        handler.postDelayed(runnable, 3000);

    }
/** 이 메소드는 입력한 시간이 지나면 로딩화면을 postDelayed에 등록된 콜백 객체는 액티비티가 종료되더라도
 * 호출이 되기 때문에 만약 액티비티가 종료된 이후에는 수행하지 말아야 할 코드가 있다면
 * 아래와 같이 액티비티 종료시 콜백을 삭제해 주는 역할을 한다.*/
    @Override
    protected void onDestroy() {
        handler.removeCallbacks(runnable);
        super.onDestroy();
    }
}