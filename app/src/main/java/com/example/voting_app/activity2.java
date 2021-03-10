package com.example.voting_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView c1 = findViewById(R.id.candidate1);
        TextView c2 = findViewById(R.id.candidate2);
        TextView c3 = findViewById(R.id.candidate3);

        Intent intent = getIntent(); // I recieve the intent I created on previous page
        String Result = intent.getExtras().getString("result");
        if (Result.equals("Candidate 1")) {
            String c1_text = c1.getText().toString().trim();
            int x = Integer.parseInt(c1_text);
            x++;
            c1.setText(String.valueOf("Candidate1: "+x));
        }
        if (Result.equals("Candidate 2")) {
            String c2_text = c2.getText().toString().trim();
            int y = Integer.parseInt(c2_text);
            y++;
            c2.setText(String.valueOf("Candidate2: " +y));
        }
        if (Result.equals("Candidate 3")) {
            String c2_text = c2.getText().toString().trim();
            int z = Integer.parseInt(c2_text);
            z++;
            c1.setText(String.valueOf("Candidate3: "+z));
        }

    }
}