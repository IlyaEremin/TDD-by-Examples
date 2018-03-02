package com.flatstack.tddbyexample;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {

    MainViewModel viewModel;

    private MainViewModelFactory viewModelFactory = new MainViewModelFactory(new Api() {
        @Override public void retrieveAnswer() {
        }
    });

    public TextView uiTextView;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_main);
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel.class);
        viewModel.answer.observe(this, new Observer<String>() {
            @Override public void onChanged(@Nullable String s) {
                uiTextView.setText(s);
            }
        });
    }
}
