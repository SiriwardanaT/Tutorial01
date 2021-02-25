package com.example.tutorial01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class receiveMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        TextView set_message = findViewById(R.id.receive);
        Intent intent = getIntent();

        String message = intent.getStringExtra("Message");
        set_message.setText(message);

    }
}