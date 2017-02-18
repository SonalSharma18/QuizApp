package com.example.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        RadioButton rb1 = (RadioButton) findViewById(R.id.q3_ans1);
        //RadioButton rb2 = (RadioButton) findViewById(R.id.q3_ans2);
        CheckBox cb1 = (CheckBox) findViewById(R.id.q5_ans1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.q5_ans2);
        CheckBox cb3 = (CheckBox) findViewById(R.id.q5_ans3);
        CheckBox cb4 = (CheckBox) findViewById(R.id.q5_ans4);
        CheckBox cb5 = (CheckBox) findViewById(R.id.q2_ans1);
        CheckBox cb6 = (CheckBox) findViewById(R.id.q2_ans2);
        CheckBox cb7 = (CheckBox) findViewById(R.id.q2_ans3);
        CheckBox cb8 = (CheckBox) findViewById(R.id.q2_ans4);

        int score = 0;

        if (rb1.isChecked()) {
            score++;
        }

        if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && !cb4.isChecked()) {
            score++;
        }
        if (cb5.isChecked() && !cb6.isChecked() && cb7.isChecked() && cb8.isChecked()) {
            score++;
        }
        EditText edit_ans = (EditText) findViewById(R.id.q1_ans);
        String ans3 = edit_ans.getText().toString().trim();
        if (ans3.equals("4")) {
            score++;
        } else if (ans3.equals("Four")) {
            score++;
        } else {
            score += 0;
        }
        EditText ed = (EditText) findViewById(R.id.q4_ans);
        String ans1 = ed.getText().toString().trim();
        if (ans1.equals("25")) {
            score++;
        } else if (ans1.equals("Twenty-Five")) {
            score++;
        }
        Toast.makeText(this, "Test score for User is:" + score + "/5", Toast.LENGTH_LONG).show();
    }
}









