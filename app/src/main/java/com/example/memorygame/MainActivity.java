package com.example.memorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView arr [] [];
    private R.drawable arr2 [] [];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         arr=new ImageView[4][4];
         arr[0][0]=findViewById(R.id.card00);
         arr[0][1]=findViewById(R.id.card01);
         arr[0][2]=findViewById(R.id.card02);
         arr[0][3]=findViewById(R.id.card03);
         arr[1][0]=findViewById(R.id.card10);
         arr[1][1]=findViewById(R.id.card11);
         arr[1][2]=findViewById(R.id.card12);
         arr[1][3]=findViewById(R.id.card13);
         arr[2][0]=findViewById(R.id.card20);
         arr[2][1]=findViewById(R.id.card21);
         arr[2][2]=findViewById(R.id.card22);
         arr[2][3]=findViewById(R.id.card23);
         arr[3][0]=findViewById(R.id.card30);
         arr[3][1]=findViewById(R.id.card31);
         arr[3][2]=findViewById(R.id.card32);
         arr[3][3]=findViewById(R.id.card33);

    }

    public void knock(View view) {
                ImageView eggImageView = findViewById(R.id.card00);
                eggImageView.setImageResource(R.drawable.cap1);
            }
    public void knock(View view) {
        ImageView eggImageView = findViewById(R.id.card01);
        eggImageView.setImageResource(R.drawable.cap2);
        }

}