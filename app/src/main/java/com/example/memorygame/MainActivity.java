package com.example.memorygame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] viewId = {
            R.id.card1, R.id.card2, R.id.card3, R.id.card4,
            R.id.card5, R.id.card6, R.id.card7, R.id.card8,
            R.id.card9, R.id.card10, R.id.card11, R.id.card12,
            R.id.card13, R.id.card14, R.id.card15, R.id.card16
    };

    private ImageView[] arr;
    private int[] arr2;

    int countP1 = 0;
    int countP2 = 0;
    int lastOpenedCard1 = -1;
    int lastOpenedCard2 = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onNewGame();
    }

    public void onNewGame() {
        arr = new ImageView[16];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = findViewById(viewId[i]);
        }

        arr2 = new int[16];
        for (int i = 0; i < 8; i++) {
            arr2[i] = getResources().getIdentifier("cap" + (i + 1), "drawable", getPackageName());
            arr2[i + 8] = arr2[i]; // Pairs of images
        }

        shuffleCards();
    }

    private void shuffleCards() {
        Random rnd = new Random();
        for (int i = arr2.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int temp = arr2[index];
            arr2[index] = arr2[i];
            arr2[i] = temp;
        }
    }

    public void Reset(View view) {
        shuffleCards();
        countP1 = 0;
        // TextView counterTextView = findViewById(R.id.count1); // Remove this line
        // counterTextView.setText("P1-" + countP1); // Remove this line
        countP2 = 0;
        // TextView counterTextView2 = findViewById(R.id.count2); // Remove this line
        // counterTextView2.setText("P2-" + countP2); // Remove this line

        for (int i = 0; i < arr.length; i++) {
            arr[i].setImageResource(R.drawable.card);
        }
        lastOpenedCard1 = -1;
        lastOpenedCard2 = -1;
    }

    public void flipCard() {
        if (lastOpenedCard1 != -1) {
            arr[lastOpenedCard1].setImageResource(R.drawable.card);
            lastOpenedCard1 = -1;
        }
        if (lastOpenedCard2 != -1) {
            arr[lastOpenedCard2].setImageResource(R.drawable.card);
            lastOpenedCard2 = -1;
        }
    }

    public void onClick(View view) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == view) {
                arr[i].setImageResource(arr2[i]);
                // Add logic to check if it's a match or not
                // For example: checkMatch(i);
            }
        }
    }

    public void knock(View view) {
        // Placeholder method for future functionality
    }
}
