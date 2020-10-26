package com.techleadbd.eshiksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Gallery_Activity extends AppCompatActivity {
    TextView btn_back_gallery1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_);

        btn_back_gallery1 = findViewById(R.id.btn_back_gallery1);

        btn_back_gallery1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_Gallery = new Intent(Gallery_Activity.this, Second_Activity.class);
                startActivity(go_Gallery);
            }
        });


    }
}