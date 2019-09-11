package com.linhnguyen.baitaploncualinh.UI.Login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.linhnguyen.baitaploncualinh.R;
import com.linhnguyen.baitaploncualinh.UI.HomePage.MainActivity;

public class LoginActivity extends AppCompatActivity implements LoginContact.View {
    //Intent
    private Intent intent;
    //Presenter
    private LoginPresenter presenter = new LoginPresenter(this);
    //Widget
    private TextView labelUserName;
    private EditText editUserName;
    private TextView labelPassword;
    private EditText editPassword;
    private Button btnLogin;
    private Button btnGoogle;
    private Button btnTwitter;

    private void init() {
        labelUserName = findViewById(R.id.labelUserName);
        editUserName = findViewById(R.id.editUserName);
        labelPassword = findViewById(R.id.labelPassword);
        editPassword = findViewById(R.id.editPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(view -> {
            startActivity(new Intent(this, MainActivity.class));
        });
        btnGoogle = findViewById(R.id.btnGoogle);
        btnGoogle.setOnClickListener(view -> {
            startActivity(new Intent());
        });
        btnTwitter = findViewById(R.id.btnTwitter);
        btnTwitter.setOnClickListener(view -> {
            startActivity(new Intent());
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
    }
}
