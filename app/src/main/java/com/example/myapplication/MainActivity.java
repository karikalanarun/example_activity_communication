package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private MainActivity thisActivity = this;

    private final View.OnClickListener listner = (new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(thisActivity, DisplayDetails.class);
            intent.putExtra(DisplayDetails.USER_NAME_KEY,
                    ((EditText)findViewById(R.id.editText)).getText().toString());
            startActivity(intent);
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn= findViewById(R.id.okay_btn);
        btn.setOnClickListener(listner);
    }
}
