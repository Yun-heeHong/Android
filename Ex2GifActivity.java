package com.cms.dw202app_all;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Ex2GifActivity extends AppCompatActivity {

    ImageView ivTest,ivTest2,ivTest3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2_gif);
        ivTest = (ImageView)findViewById(R.id.imageView);
        ivTest2 = (ImageView)findViewById(R.id.imageView2);
        ivTest3 = (ImageView)findViewById(R.id.imageView3);
        Glide.with(Ex2GifActivity.this).load(R.drawable.img11).into(ivTest);
        Glide.with(Ex2GifActivity.this).load(R.drawable.img22).into(ivTest2);
        Glide.with(Ex2GifActivity.this).load(R.drawable.img33).into(ivTest3);
    }
}