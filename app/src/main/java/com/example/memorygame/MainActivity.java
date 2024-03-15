package com.example.memorygame;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

 //   private final ActivityResultLauncher<Intent> activityResultLauncher =
        //      registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {


    private ImageView arr[];
    private int arr2[];
    private int countP1 = 0;
    private int countP2 = 0;
 //   private WindowDecorActionBar.TabImpl scoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onNewGame();


    }

    public void onNewGame() {
        arr = new ImageView[16];
        arr[0] = findViewById(R.id.card1);
        arr[1] = findViewById(R.id.card2);
        arr[2] = findViewById(R.id.card3);
        arr[3] = findViewById(R.id.card4);
        arr[4] = findViewById(R.id.card5);
        arr[5] = findViewById(R.id.card6);
        arr[6] = findViewById(R.id.card7);
        arr[7] = findViewById(R.id.card8);
        arr[8] = findViewById(R.id.card9);
        arr[9] = findViewById(R.id.card10);
        arr[10] = findViewById(R.id.card11);
        arr[11] = findViewById(R.id.card12);
        arr[12] = findViewById(R.id.card13);
        arr[13] = findViewById(R.id.card14);
        arr[14] = findViewById(R.id.card15);
        arr[15] = findViewById(R.id.card16);

        arr2 = new int[16];
        arr2[0] = R.drawable.cap1;
        arr2[1] = R.drawable.cap2;
        arr2[2] = R.drawable.cap3;
        arr2[3] = R.drawable.cap4;
        arr2[4] = R.drawable.cap5;
        arr2[5] = R.drawable.cap6;
        arr2[6] = R.drawable.cap7;
        arr2[7] = R.drawable.cap8;
        arr2[8] = R.drawable.cap1;
        arr2[9] = R.drawable.cap2;
        arr2[10] = R.drawable.cap3;
        arr2[11] = R.drawable.cap4;
        arr2[12] = R.drawable.cap5;
        arr2[13] = R.drawable.cap6;
        arr2[14] = R.drawable.cap7;
        arr2[15] = R.drawable.cap8;
    }

    public void onClick(View view) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == view) {
                arr[i].setImageResource(arr2[i]);
            }
        }

    }

    public void knock (View view){
        //  count++;
        //  for (int i = 0; i < viewId.length; i++) {
        //      if (viewId[i].arr[i].setImageResource(arr2[i]))
        //  }
    }
}
