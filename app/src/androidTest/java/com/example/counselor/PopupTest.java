package com.example.counselor;

import android.view.View;
import android.widget.LinearLayout;

import androidx.fragment.app.FragmentTransaction;
import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CompletableFuture;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParentIndex;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class PopupTest {

    private Hearing hearing;
    private ViewInteraction result,test;
    @Rule
    public ActivityTestRule<MainActivity> activityRule
            = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void initValidString() {
        activityRule.getActivity();
        hearing = new Hearing();
    }

    @Test
    public void changeText_sameActivity() {
        activityRule.getActivity().setFrag(1);
        onView(withId(R.id.miso)).perform(click());
        // 클릭시 미소인 상담실 상세정보창 확인
        onView(withId(R.id.action_six)).perform(click());
        // 클릭시 미소인 상담실 예약팝업 확인
        onView(withId(R.id.miso_call)).check(matches(isDisplayed()));
        // 미소인의 상담소의 예약팝업창이 출력되었는지 확인.
    }
}