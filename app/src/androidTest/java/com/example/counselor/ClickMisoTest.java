package com.example.counselor;

import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.CheckResult;
import androidx.fragment.app.FragmentTransaction;
import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CompletableFuture;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParentIndex;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.core.AllOf.allOf;

/**
 * MainActivity 에서 BottomNavigationView 에 있는
 * MenuItem 중 하나를 클릭했을 때
 * setFrag 에 의해서 androidx.fragment.app.FragmentManager 에 FragmentManager 를 등록하고
 * FragmentTransaction 으로 해당 fragment(카테고리)에 맞게 상담실 리스트를 불러온다.
 * 이후 미소인 상담실을 클릭해서 미소인 상담실 상세정보창을 띄우는지 확인!
 *
*/

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ClickMisoTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule
            = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void initValidString() {
        activityRule.getActivity();
    }

    @Test
    public void changeText_sameActivity() {
        activityRule.getActivity().setFrag(0);
        onView(withId(R.id.miso_list)).perform(click());

        // 클릭시 미소인 상담실 상세정보창 확인
        onView(withId(R.id.miso_info)).check(matches(isDisplayed()));
    }
}