package com.flatstack.tddbyexample;

import android.arch.lifecycle.ViewModelProvider;

import junit.framework.Assert;

import org.junit.Test;
import org.mockito.Mockito;

public class ViewModelProviderTest {

    @Test
    public void typeOf() throws Exception {
        // Arrange
        Api mockApi = Mockito.mock(Api.class);

        // Act
        MainViewModelFactory mainViewModelFactory = new MainViewModelFactory(mockApi);

        // Assert
        Assert.assertTrue(mainViewModelFactory instanceof ViewModelProvider.Factory);
    }

    @Test
    public void create() throws Exception {
        // Arrange
        Api mockApi = Mockito.mock(Api.class);
        MainViewModelFactory viewModelFactory = new MainViewModelFactory(mockApi);

        // Act
        MainViewModel mainViewModel = viewModelFactory.create(MainViewModel.class);

        // Assert
        Assert.assertNotNull(mainViewModel);
    }
}
