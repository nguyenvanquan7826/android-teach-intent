package com.nguyenvanquan7826.learnintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        String lover = getIntent().getStringExtra("KEY_LOVER");
        String test = getIntent().getStringExtra("KEY_TEST");

        TextView tvLover = findViewById(R.id.tvOldLover);
        tvLover.setText(lover);
    }
}
