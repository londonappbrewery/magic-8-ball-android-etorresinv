package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgMagicBall;
    Button askButton;
    int[] ballArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgMagicBall = findViewById(R.id.image_eightBall);
        askButton = findViewById(R.id.askButton);

        ballArray = new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ask();
            }
        });
    }

    private void ask(){
        Random randomNumGenerator = new Random();
        int number = randomNumGenerator.nextInt(5);
        imgMagicBall.setImageResource(ballArray[number]);
    }
}
