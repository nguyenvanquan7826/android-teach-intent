package com.nguyenvanquan7826.learnintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editOldLover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editOldLover = findViewById(R.id.editOldLover);

        findViewById(R.id.btnSend).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });
    }

    private void sendData(){
        String lover = editOldLover.getText().toString();

        Intent i = new Intent(this, InfoActivity.class);

        i.putExtra("KEY_LOVER", lover);
        i.putExtra("KEY_TEST", "Test");

        startActivity(i);
    }
}
