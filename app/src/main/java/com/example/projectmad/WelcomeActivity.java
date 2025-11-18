package com.example.projectmad;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Link XML layout to this activity
        setContentView(R.layout.activity_welcome);

        // Access UI elements if needed
        TextView titleText = findViewById(R.id.textTitle);
        Button startButton = findViewById(R.id.startNow);

        // Set data programmatically (optional)
        titleText.setText("Welcome To RUPP!");
        startButton.setOnClickListener(v -> {
            // Action when button is clicked
            android.widget.Toast.makeText(this, "Start clicked!", android.widget.Toast.LENGTH_SHORT).show();
        });
    }
}
