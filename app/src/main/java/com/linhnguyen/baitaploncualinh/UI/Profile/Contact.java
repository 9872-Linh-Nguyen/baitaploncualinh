package com.linhnguyen.baitaploncualinh.UI.Profile;

import android.app.Activity;

import com.linhnguyen.baitaploncualinh.Model.ProfileModel;

import java.util.List;

public interface Contact {
    interface View{
        void GridView(List<ProfileModel> listImage);
        void Status(String post, String follower, String friend, String bio, String name);
        void Avatar(int avatar);
    }

    abstract class Presenter{
        abstract void readData();
        abstract void Permission(Activity activity);
        abstract void showGridView();
        abstract void showStatus();
        abstract void showAvatar();
    }
}
