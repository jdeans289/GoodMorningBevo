package com.example.jacqueline.goodmorningbevo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    Button alarmButton, taskButton, otherButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        alarmButton = (Button)findViewById(R.id.button4);
        taskButton = (Button)findViewById(R.id.button6);
        otherButton = (Button)findViewById(R.id.button7);

        alarmButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, AlarmEditor.class));
            }
        });

        taskButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, TaskEditor.class));
            }
        });
    }
}
