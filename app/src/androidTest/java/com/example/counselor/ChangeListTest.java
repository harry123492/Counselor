package com.example.counselor;

import android.view.View;
import android.widget.LinearLayout;

import androidx.fragment.app.FragmentTransaction;
import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewAction;
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
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

/**
 * MainActivity 에서 BottomNavigationView 에 있는
 * MenuItem 중 하나를 클릭했을 때
 * setFrag 에 의해서 androidx.fragment.app.FragmentManager 에 FragmentManager 를 등록하고
 * FragmentTransaction 으로 해당 fragment(카테고리)에 맞게 Text(상담 분야) 를 변경한다.
 *
 * before: "심리상담"
 * after: "중독상담"
*/

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ChangeListTest {

    private String ConsultationField;

    @Rule
    public ActivityTestRule<MainActivity> activityRule
            = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void initValidString() {
        ConsultationField = "심리상담";
        activityRule.getActivity();
    }

    @Test
    public void changeText_sameActivity() {
        onView(allOf(withId(R.id.test_field), withText("심리상담")));
        onView(withId(R.id.bottommenu2)).perform(click());

        // 클릭시 카테고리 변경 확인
        onView(withId(R.id.test_field2)).check(matches(withText("중독상담")));

    }
}