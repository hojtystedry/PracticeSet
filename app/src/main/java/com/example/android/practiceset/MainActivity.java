package com.example.android.practiceset;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create image view and set it
        ImageView profilePicture = (ImageView) findViewById(R.id.profile_picture);
        profilePicture.setImageResource(R.drawable.jara_cimrman);

        // Create three textviews and set them
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(R.string.name);
        name.setTextSize(1, 52);
        name.setTextColor(0xAA000000);

        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText(R.string.birthday);
        birthday.setTextSize(1, 28);
        birthday.setTextColor(0xAA000000);

        TextView country = (TextView) findViewById(R.id.country);
        country.setText(R.string.country);
        country.setTextSize(1, 20);






    }
}
