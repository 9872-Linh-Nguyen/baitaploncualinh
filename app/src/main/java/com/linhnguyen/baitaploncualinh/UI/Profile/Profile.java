package com.linhnguyen.baitaploncualinh.UI.Profile;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.linhnguyen.baitaploncualinh.Model.ProfileModel;
import com.linhnguyen.baitaploncualinh.R;
import com.linhnguyen.baitaploncualinh.UI.HomePage.MainActivity;
import com.linhnguyen.baitaploncualinh.Utils.Constant;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Profile extends AppCompatActivity implements Contact.View {
    //widget
    private CircleImageView profile_image;
    private GridView gridView;
    private TextView postValue;
    private TextView followerValue;
    private TextView friendValue;
    private TextView nameProfile;
    private TextView bioProfile;
    private ImageButton top_button;
    private ImageButton edit_button;
    //Adapter
    private ProfileAdapter adapter;
    //Intent
    private Intent intent;
    //Presenter
    private Contact.Presenter presenter = new Presenter(this);

    private void init() {
        presenter.showGridView();
        presenter.showStatus();
        presenter.showStatus();
        presenter.Permission(this);
        presenter.showAvatar();

        top_button = findViewById(R.id.top_button);
        top_button.setOnClickListener(view ->{
            onBackPressed();
        });

        edit_button = findViewById(R.id.edit_button);
        edit_button.setOnClickListener(view -> {

        });
    }

    @Override
    public void Avatar(int avatar) {
        profile_image = findViewById(R.id.profile_image);
        profile_image.setImageResource(avatar);
        profile_image.setOnClickListener(view -> {
            Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(takePictureIntent, Constant.REQUEST_CAMERA_DATA);
            }
        });
    }

    @Override
    public void Status(String post, String follower, String friend, String bio, String name) {
        //name
        nameProfile = findViewById(R.id.profile_Name);
        nameProfile.setText(name);
        //bio
        bioProfile = findViewById(R.id.profile_bio);
        bioProfile.setText(bio);
        //post
        postValue = findViewById(R.id.postValue);
        postValue.setText(post);
        //follower
        followerValue = findViewById(R.id.followerValue);
        followerValue.setText(follower);
        //friend
        friendValue = findViewById(R.id.friendValue);
        friendValue.setText(friend);
    }

    @Override
    public void GridView(List<ProfileModel> listImage) {
        adapter = new ProfileAdapter(this, R.layout.item_image_profile, listImage);
        gridView = findViewById(R.id.gridView);
        gridView.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        init();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 2:
                if (resultCode == RESULT_OK) {
                    Bundle extras = data.getExtras();
                    Bitmap imageBitmap = (Bitmap) extras.get("data");
                    profile_image.setImageBitmap(imageBitmap);
                }
                break;
        }
    }
}
