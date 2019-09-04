package com.linhnguyen.baitaploncualinh.UI.HomePage;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.linhnguyen.baitaploncualinh.R;
import com.linhnguyen.baitaploncualinh.UI.Profile.Profile;

public class MainActivity extends AppCompatActivity {
    //Widget
    private ImageButton img_profile;
    //Intent
    private Intent intent;

    private void init() {
        img_profile = findViewById(R.id.img_profile);
        img_profile.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), Profile.class));
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public void onBackPressed() {
    }
}
