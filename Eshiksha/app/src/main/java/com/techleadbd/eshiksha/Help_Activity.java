package com.techleadbd.eshiksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Help_Activity extends AppCompatActivity {

    TextView btn_back_secondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        btn_back_secondActivity = findViewById(R.id.btn_back_secondActivity);

        btn_back_secondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goSecond_Activity = new Intent(Help_Activity.this, Second_Activity.class);
                startActivity(goSecond_Activity);
            }
        });
    }
}