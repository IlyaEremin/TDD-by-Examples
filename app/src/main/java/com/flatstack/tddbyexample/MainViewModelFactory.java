package com.flatstack.tddbyexample;

import android.arch.lifecycle.ViewModelProvider;

class MainViewModelFactory implements ViewModelProvider.Factory{

    private final Api api;

    public MainViewModelFactory(Api api) {
        this.api = api;
    }

    public MainViewModel create(Class clazz) {
        return new MainViewModel(api);
    }
}
