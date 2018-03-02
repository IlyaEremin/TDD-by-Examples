package com.flatstack.tddbyexample;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class MainScreenTest {

    @Rule public ActivityTestRule<MainScreen> mActivityRule = new ActivityTestRule<>(MainScreen.class, false, false);

    @Test
    public void activityLaunched() throws Exception {

        // Act
        mActivityRule.launchActivity(new Intent());

        // Assert
        onView(withId(R.id.text)).check(matches(isDisplayed()));
    }
}
