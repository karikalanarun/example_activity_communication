package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class DisplayDetails extends AppCompatActivity {
    public static final String USER_NAME_KEY ="user_name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String name = getIntent().getStringExtra(USER_NAME_KEY);
        setContentView(R.layout.activity_display_details);
//        Log.i("DisplyDetails", name);
        TextView t = findViewById(R.id.name_place);
        t.setText(name);
    }
}
