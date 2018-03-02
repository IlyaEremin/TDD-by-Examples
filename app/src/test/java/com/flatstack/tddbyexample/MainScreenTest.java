package com.flatstack.tddbyexample;

import android.os.Bundle;
import android.widget.TextView;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.android.controller.ActivityController;

@RunWith(RobolectricTestRunner.class)
public class MainScreenTest {

    @Test
    public void activitySubscribeOnMVFields() throws Exception {
        // Arrange
        ActivityController<MainScreen> screenBuilder = Robolectric.buildActivity(MainScreen.class);
        Bundle expectedSavedInstanceState = null;

        // Act
        MainScreen mainScreen = screenBuilder.create(expectedSavedInstanceState).get();

        // Assert
        Assert.assertTrue(mainScreen.viewModel.answer.hasObservers());
    }

    @Test
    public void activityReactOnViewModel() throws Exception {
        // Arrange
        String expectedAnswer = "42";
        MainScreen mainScreen = Robolectric.setupActivity(MainScreen.class);
        TextView mockTextView = Mockito.mock(TextView.class);
        mainScreen.uiTextView = mockTextView;

        // Act
        mainScreen.viewModel.answer.setValue(expectedAnswer);

        // Assert
        Mockito.verify(mockTextView).setText(expectedAnswer);
    }
}
