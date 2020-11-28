package com.example.counselor;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import junit.framework.TestCase;

/* Family 카테고리의 '두드림 심리센터'를 선택했을 때, '두드림 심리센터' 상담소 상세정보창이
 정상적으로 출력되는지 확인해 보았습니다.*/

@RunWith(AndroidJUnit4.class)
@LargeTest
public class DodreamTest extends TestCase {

    @Rule
    public ActivityTestRule<MainActivity> activityRule
            = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void initValidString() {
        activityRule.getActivity();
    }

    @Test
    public void ViewDodream() { //테스트
        activityRule.getActivity().setFrag(1); // 카테고리바의 setFrag(1)에 설정된 Family 탭 불러옴.
        onView(withId(R.id.menuof_dodream)).perform(click()); // Family 탭의 상담소 목록중 '두드림 상담센터'를 선택.
        onView(withId(R.id.dodream)).check(matches(isDisplayed())); // '두드림 상담센터'의 상담소 상세정보창이 출력되었는지 확인.
    }
}