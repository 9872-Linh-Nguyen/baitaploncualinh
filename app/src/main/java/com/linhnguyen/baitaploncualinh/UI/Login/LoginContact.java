package com.linhnguyen.baitaploncualinh.UI.Login;

public interface LoginContact {
    interface View{

    }
    abstract class Presenter{
        abstract Boolean checkUI(String username, String password);
        abstract void login();
    }
}
