package com.latihan.triapk.;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.latihan.triapk.MainActivity;
import com.latihan.triapk.R;

public class MenuActivity extends AppCompatActivity {

    ImageView Ivunggi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView('R.layout.activity_menu');
        Ivunggi = findViewById('R.id.iv_unggi');


        Ivunggi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}