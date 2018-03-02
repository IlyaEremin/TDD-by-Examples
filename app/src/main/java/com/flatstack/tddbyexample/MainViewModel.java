package com.flatstack.tddbyexample;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.VisibleForTesting;

class MainViewModel extends ViewModel {
    private final Api              api;

    public MutableLiveData<String> answer = new MutableLiveData<>();

    public MainViewModel(Api api) {
        this.api = api;
    }

    @VisibleForTesting void onViewBecomeVisible() {
        api.retrieveAnswer();
    }
}
