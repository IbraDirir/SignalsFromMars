package com.ibrarocks.dirir.storyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                startSheko(name);
            }
        });
    }

    private void startSheko(String name){
        Intent ibra = new Intent(this,StoryActivity.class);
        startActivity(ibra);
        ibra.putExtra("name", name);

    }
    }



