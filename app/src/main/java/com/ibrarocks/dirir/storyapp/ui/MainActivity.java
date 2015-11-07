package com.ibrarocks.dirir.storyapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ibrarocks.dirir.storyapp.R;

public class MainActivity extends AppCompatActivity {
    private EditText mNameField;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameField = (EditText) findViewById(R.id.NameEditText);
        mStartButton = (Button) findViewById(R.id.StartButton);
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameField.getText().toString();
                startStory(name);
            }
        });
    }

    private void startStory(String name){
        Intent intent = new Intent(this,StoryActivity.class);
        startActivity(intent);
        intent.putExtra(getString(R.string.key_name), name);

    }
    }



