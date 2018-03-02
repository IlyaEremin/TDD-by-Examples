package com.flatstack.tddbyexample;

import org.junit.Test;
import org.mockito.Mockito;

public class MainViewModelTest {

    @Test
    public void onViewBecomeVisible() throws Exception {
        // Arrange
        Api mockApi = Mockito.mock(Api.class);
        MainViewModel viewModel = new MainViewModel(mockApi);

        // Act
        viewModel.onViewBecomeVisible();

        // Assert
        Mockito.verify(mockApi).retrieveAnswer();
    }
}
