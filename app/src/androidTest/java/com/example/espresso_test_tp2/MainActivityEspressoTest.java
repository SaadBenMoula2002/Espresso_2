package com.example.espresso_test_tp2;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import androidx.test.rule.ActivityTestRule;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;






@RunWith(AndroidJUnit4.class)
public class MainActivityEspressoTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void VerifierChangementText() {
        onView(withId(R.id.inputField)).perform(typeText("HELLO Dev"), closeSoftKeyboard());
        onView(withId(R.id.changeText)).perform(click());
        onView(withId(R.id.inputField)).check(matches(withText("Dev mobile")));
    }
    @Test
    public void changerTexteSecondActivity() {
        onView(withId(R.id.inputField)).perform(typeText("Nouveau Texte"), closeSoftKeyboard());
        onView(withId(R.id.switchActivity)).perform(click());
        onView(withId(R.id.resultView)).check(matches(withText("Nouveau Texte")));
    }


}
