package com.example.androidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        String joke = "";
        if (getIntent() != null && getIntent().hasExtra("joke"))
            joke = getIntent().getExtras().getString("joke");
        TextView jokeTextView = findViewById(R.id.display_joke_text_view);
        jokeTextView.setText(joke);
    }
}
