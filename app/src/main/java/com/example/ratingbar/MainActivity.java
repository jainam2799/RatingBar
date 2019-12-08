package com.example.ratingbar;

//Author: Jainam Shah
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Add in Oncreate() function*/

        // Initiate a Rating Bar
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        // Set Total Number of Stars(Maximum)
        ratingBar.setNumStars(5);

        // Set Default Star Rating when the App Launches
        ratingBar.setRating((float) 2.5);

        // Initiate Button
        button = (Button) findViewById(R.id.button);

        /* Perform Click Event on Button */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* Get Values and Display them in Toast */

                // This gets Total No. of Stars
                String totalNoOfStars = "Total Stars: " +ratingBar.getNumStars();

                // This gets the value of the stars you rated
                String rating = "Your Rating: " +ratingBar.getRating();

                // Displays values in Toast
                Toast.makeText(MainActivity.this, totalNoOfStars + "\n" + rating, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
