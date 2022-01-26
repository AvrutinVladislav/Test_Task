package com.example.testtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.testtask.ui.reviews.ReviewsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ReviewsFragment.newInstance())
                    .commitNow();
        }
    }
}