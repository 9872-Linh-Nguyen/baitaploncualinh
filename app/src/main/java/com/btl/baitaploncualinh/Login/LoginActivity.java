package com.btl.baitaploncualinh.Login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.btl.baitaploncualinh.Home.HomeActivity;
import com.btl.baitaploncualinh.R;

public class LoginActivity extends AppCompatActivity {
    private TextView labelUserName;
    private TextView labelPassword;
    private EditText editUserName;
    private EditText editPassword;
    private Button btnLogin;

    private void init() {
        labelUserName = findViewById(R.id.labelUserName);
        labelPassword = findViewById(R.id.labelPassword);
        editUserName = findViewById(R.id.editUserName);
        editPassword = findViewById(R.id.editPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(view -> {
            Toast.makeText(this, "UserName: " + editUserName.getText() +
                    "\nPassword: " + editPassword.getText(), Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, HomeActivity.class));
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }
}
