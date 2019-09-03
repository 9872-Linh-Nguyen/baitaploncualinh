package com.linhnguyen.baitaploncualinh.UI.Profile;

import android.Manifest;
import android.app.Activity;

import androidx.core.app.ActivityCompat;

import com.linhnguyen.baitaploncualinh.Model.ProfileModel;
import com.linhnguyen.baitaploncualinh.R;

import java.util.ArrayList;
import java.util.List;

public class Presenter extends Contact.Presenter {
    //  View
    private Contact.View view;
    Presenter(Contact.View view) {
        this.view = view;
    }
    //  Data
    private List<ProfileModel> listImage;

    @Override
    void readData() {

    }

    @Override
    void showAvatar() {
        view.Avatar(R.drawable.linhnguyen);
    }

    @Override
    void showStatus() {
        view.Status("0","10","20", "Profile of Linh Nguyễn", "Linh");
    }

    @Override
    void showGridView() {
        listImage = new ArrayList<>();
        //Demo data
        ProfileModel profileModel = new ProfileModel();
        profileModel.setImage(R.drawable.linhnguyen);
        listImage.add(profileModel);
        view.GridView(listImage);
    }

    @Override
    public void Permission(Activity activity) {
        String[] listPermission = new String[]{
                Manifest.permission.CAMERA
                , Manifest.permission.WRITE_EXTERNAL_STORAGE
                , Manifest.permission.READ_EXTERNAL_STORAGE
        };
        ActivityCompat.requestPermissions(activity, listPermission, 1);
    }
}
