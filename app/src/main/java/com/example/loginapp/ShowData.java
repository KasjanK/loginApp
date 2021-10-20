package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        Intent intent = getIntent();
        String strName = intent.getStringExtra(DataForm.EXTRA_NAME);
        float fLength = intent.getFloatExtra(DataForm.EXTRA_LENGTH, 0);
        int iAge = intent.getIntExtra(DataForm.EXTRA_AGE, 0);
        double dWage = intent.getDoubleExtra(DataForm.EXTRA_WAGE, 0);
        String strLetter = intent.getStringExtra(DataForm.EXTRA_LETTER);

        TextView name = (TextView) findViewById(R.id.name1);
        TextView length = (TextView) findViewById(R.id.length1);
        TextView age = (TextView) findViewById(R.id.age1);
        TextView wage = (TextView) findViewById(R.id.wage1);
        TextView letter = (TextView) findViewById(R.id.letter1);

        name.setText("Your name: " + strName);
        length.setText("Your length in meters: " + fLength);
        age.setText("Your age: " + iAge);
        wage.setText("Your wage: " + dWage + "k kr");
        letter.setText("Your favorite letter: " + strLetter);
    }
}