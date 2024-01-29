package com.test.ager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ageET;
        Button checkBtn;
        ImageView imageIv;
        TextView resultTv;

        ageET = findViewById(R.id.AgeET);
        checkBtn = findViewById(R.id.CheckBtn);
        imageIv = findViewById(R.id.ImageIV);
        resultTv = findViewById(R.id.ResultTV);

        checkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    int age = Integer.parseInt(ageET.getText().toString());
                    if (age == 0) {
                        Toast.makeText(MainActivity.this, "Enter Correct Age", Toast.LENGTH_SHORT).show();
                    } else if (age > 0 && age <= 2) {
                        imageIv.setImageResource(R.drawable.baby);
                        resultTv.setText("Baby");

                    } else if (age >= 3 && age <= 16) {
                        imageIv.setImageResource(R.drawable.children);
                        resultTv.setText("Child");

                    } else if (age >= 17 && age <= 30) {
                        imageIv.setImageResource(R.drawable.youngadult);
                        resultTv.setText("Young");

                    } else if (age >= 31 && age <= 45) {
                        imageIv.setImageResource(R.drawable.middleageadult);
                        resultTv.setText("Adult");


                    } else {
                        imageIv.setImageResource(R.drawable.oldadult);
                        resultTv.setText("Old");
                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Please enter age", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
