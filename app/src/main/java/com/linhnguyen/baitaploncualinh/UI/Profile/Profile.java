package com.linhnguyen.baitaploncualinh.UI.Profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.linhnguyen.baitaploncualinh.R;
import com.linhnguyen.baitaploncualinh.UI.HomePage.MainActivity;

public class Profile extends AppCompatActivity {
    private Intent intent;
    private void init(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
