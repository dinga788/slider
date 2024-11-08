package com.example.slider1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int[] images = {R.drawable.karelia1, R.drawable.karelia2, R.drawable.karelia3};

    private ImageView imageView;
    private ImageButton buttonPrevious, buttonNext;
    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image_view);
        buttonPrevious = findViewById(R.id.button_previous);
        buttonNext = findViewById(R.id.button_next);

        updateImage();

        buttonPrevious.setOnClickListener(v -> previousImage());
        buttonNext.setOnClickListener(view -> nextImage());
    }

    private void updateImage() {
        imageView.setImageResource(images[currentIndex]);
    }

    private void previousImage() {
        if (currentIndex > 0) {
            currentIndex--;
            updateImage();
        }
    }

    private void nextImage() {
        if (currentIndex < images.length - 1) {
            currentIndex++;
            updateImage();
        }
    }
}

