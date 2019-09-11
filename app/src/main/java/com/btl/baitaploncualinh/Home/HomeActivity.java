package com.btl.baitaploncualinh.Home;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.btl.baitaploncualinh.R;

public class HomeActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        showActionBar();
    }

    private void showActionBar() {
        TextView labelTitle = findViewById(R.id.labelTitle);
        labelTitle.setText(getString(R.string.app_name));
        TextPaint textPaint = labelTitle.getPaint();
        float width = textPaint.measureText(getString(R.string.app_name));
        labelTitle.getPaint()
                .setShader(new LinearGradient(0,
                        0,
                        width,
                        labelTitle.getTextSize(),
                        ContextCompat.getColor(this, R.color.colorPrimary),
                        ContextCompat.getColor(this, R.color.colorAccent),
                        Shader.TileMode.CLAMP));
    }
}
