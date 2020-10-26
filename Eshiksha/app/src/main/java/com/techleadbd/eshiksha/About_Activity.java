package com.techleadbd.eshiksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class About_Activity extends AppCompatActivity {

    TextView btn_back_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        btn_back_home = findViewById(R.id.btn_back_home);

        btn_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBack = new Intent(About_Activity.this, Second_Activity.class);
                startActivity(goBack);
            }
        });
    }
}