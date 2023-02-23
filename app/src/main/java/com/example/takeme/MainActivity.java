package com.example.takeme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    Button capture, navigate;
    OnClickListener cap = new OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),
                    MapActivity.class);
            startActivity(intent);
        }

    };

    OnClickListener nav = new OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),
                    FindPosition.class);
            startActivity(intent);
        }

    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigate = (Button) findViewById(R.id.button);
        capture = (Button) findViewById(R.id.button2);
        navigate.setOnClickListener(nav);
        capture.setOnClickListener(cap);

    }
}