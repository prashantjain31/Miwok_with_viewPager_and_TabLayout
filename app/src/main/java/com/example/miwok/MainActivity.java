package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the views that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //set a clicklistener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(i);
            }
        });

        TextView family = (TextView) findViewById(R.id.family);

        //set a clicklistener on that view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(i);
            }
        });

        TextView colors = (TextView) findViewById(R.id.colors);

        //set a clicklistener on that view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(i);
            }
        });

        TextView phrases = (TextView) findViewById(R.id.phrases);

        //set a clicklistener on that view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(i);
            }
        });
    }

}