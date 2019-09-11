package com.linhnguyen.baitaploncualinh.UI.Login;

import com.firebase.ui.auth.AuthUI;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

class LoginPresenter extends LoginContact.Presenter {
    private LoginContact.View view;

    LoginPresenter(LoginContact.View view) {
        this.view = view;
    }

    @Override
    void login() {
        // Choose authentication providers
        List<AuthUI.IdpConfig> providers = Arrays.asList(
                new AuthUI.IdpConfig.EmailBuilder().build(),
                new AuthUI.IdpConfig.PhoneBuilder().build(),
                new AuthUI.IdpConfig.GoogleBuilder().build(),
                new AuthUI.IdpConfig.FacebookBuilder().build(),
                new AuthUI.IdpConfig.TwitterBuilder().build());
    }

    @Override
    Boolean checkUI(String username, String password) {
        if (username.equals("") || password.equals("")) {
            return false;
        } else {
            return checkEmail(username) && checkPassword(password);
        }
    }

    private Boolean checkEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    private Boolean checkPassword(String password) {
        return password.length() >= 8;
    }
}
