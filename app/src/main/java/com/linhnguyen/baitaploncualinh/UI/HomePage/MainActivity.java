package com.linhnguyen.baitaploncualinh.UI.HomePage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.linhnguyen.baitaploncualinh.R;
import com.linhnguyen.baitaploncualinh.UI.Profile.Profile;

public class MainActivity extends AppCompatActivity {
    private ImageButton img_profile;

    private void init(){
        img_profile = findViewById(R.id.img_profile);
        img_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Profile.class));
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
}
