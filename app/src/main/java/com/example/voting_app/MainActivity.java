package com.example.voting_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.example.voting_app.R.*;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    Button btn;
    EditText name;
    EditText id;
    ToggleButton togbtn;
    TextView tp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        sp = findViewById(R.id.candidates);
        btn= findViewById(R.id.vote_btn);
        name = findViewById(R.id.c_name);
        id = findViewById(R.id.c_id);
        togbtn = findViewById(R.id.tog_btn);

        //storing name and ids of candidates into arrayLists.
        String[] Names = new String[]{};
        String[] Ids = new String[]{};

        List<String> Candidate_names = new ArrayList<>(Arrays.asList(Names));
        List<String> Candidate_ids = new ArrayList<>(Arrays.asList(Ids));

        // settig accept or decline condition.
        togbtn.setText("Accept");
        togbtn.setTextOff("Accept");
        togbtn.setTextOn("Decline");
    }
    public void choose(View view){
        String[] Names = new String[]{};
        String[] Ids = new String[]{};

        List<String> Candidate_names = new ArrayList<>(Arrays.asList(Names));
        List<String> Candidate_ids = new ArrayList<>(Arrays.asList(Ids));

        String selected_c = sp.getSelectedItem().toString();
        String entered_name = name.getText().toString().trim();
        String entered_id = id.getText().toString().trim();

        // verify whether candidate already existed or not.
        if (!Candidate_names.contains(entered_name) && (!Candidate_ids.contains(entered_id))){
            if(togbtn.isChecked()) {
                if (entered_name.length() > 0 && entered_id.length() > 0);
                {

                    Candidate_names.add(entered_name);
                    Candidate_ids.add(entered_id);
                    Toast.makeText(MainActivity.this, "Successfully voted", Toast.LENGTH_SHORT).show();
                }if (Candidate_names.contains(entered_name)){
                    Toast.makeText(MainActivity.this, "User has already voted", Toast.LENGTH_SHORT).show();
                }if (togbtn.isChecked() == false){
                    Toast.makeText(MainActivity.this, "please accept the terms", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Invalid data", Toast.LENGTH_SHORT).show();


                }
            }
        }
        tp = findViewById(R.id.spnr);
        tp.setText(sp.getSelectedItem().toString());

    }
    public void Result(View view) {

        // we are going to go to the next activity!
        Intent intent =new Intent(this,Activity2.class);
        intent.putExtra("result", tp.getText().toString());
        startActivity(intent);

    }
    protected void onDestroy(){

        super.onDestroy();
        Log.d("Main activity", "onDestroy: 1");

    }

    protected void onPause(){
        super.onPause();
        Log.d("Main activity", "onPause: 1");

    }

    protected void onStart(){
        super.onStart();
        Log.d("Main activity", "onStart: 1");

    }

    protected void onStop(){

        super.onStop();
        Log.d("Main Activity", "onStop: 1");
    }

    protected void onRestart(){
        super.onRestart();

        Log.d("Main Activity", "onRestart: 1");
    }

    protected void onResume(){
        super.onResume();

        Log.d("Main Activity", "onResume:1 ");
    }



}

