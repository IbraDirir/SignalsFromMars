package com.ibrarocks.dirir.storyapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.ibrarocks.dirir.storyapp.R;
import com.ibrarocks.dirir.storyapp.model.Page;

public class StoryActivity extends AppCompatActivity {
    public static final String TAG = StoryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        Intent intent = getIntent();

         String name = intent.getStringExtra(getString(R.string.key_name));

        if (name == null){
            name = "Friend";
        }
        Log.d(TAG, name);
    }

}
