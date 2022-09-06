package com.cms.dw202app_all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnEx1).setOnClickListener(mClick);
        findViewById(R.id.btnEx2).setOnClickListener(mClick);
        findViewById(R.id.btnEx3).setOnClickListener(mClick);
        findViewById(R.id.btnEx4).setOnClickListener(mClick);
        findViewById(R.id.btnEx5).setOnClickListener(mClick);
        findViewById(R.id.btnEx6).setOnClickListener(mClick);
        findViewById(R.id.btnEx7).setOnClickListener(mClick);
        findViewById(R.id.btnEx8).setOnClickListener(mClick);
        findViewById(R.id.btnEx9).setOnClickListener(mClick);
        findViewById(R.id.btnEx10).setOnClickListener(mClick);
        findViewById(R.id.btnEx11).setOnClickListener(mClick);

    }

    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btnEx1:
                    Intent ex1 = new Intent(MainActivity.this, Ex1AnimationActivity.class);
                    startActivity(ex1);
                    break;
                case R.id.btnEx2:
                    Intent ex2 = new Intent(MainActivity.this, Ex2GifActivity.class);
                    startActivity(ex2);
                    break;
                case R.id.btnEx3:
                    Intent ex3 = new Intent(MainActivity.this, Ex3VideoActivity.class);
                    startActivity(ex3);
                    break;
                case R.id.btnEx4:
                    Intent ex4 = new Intent(MainActivity.this, Ex4MediaActivity.class);
                    startActivity(ex4);
                    break;
                case R.id.btnEx5:
                    Intent ex5 = new Intent(MainActivity.this, Ex5WebViewActivity.class);
                    startActivity(ex5);
                    break;
                case R.id.btnEx6:
                    Intent ex6 = new Intent(MainActivity.this, Ex6TelActivity.class);
                    startActivity(ex6);
                    break;
                case R.id.btnEx7:
                    Intent ex7 = new Intent(MainActivity.this, Ex7SmsActivity.class);
                    startActivity(ex7);
                    break;
                case R.id.btnEx8:
                    Intent ex8 = new Intent(MainActivity.this, Ex8GalleryViewEx.class);
                    startActivity(ex8);
                    break;
                case R.id.btnEx9:
                    Intent ex9 = new Intent(MainActivity.this, Ex9ImageViewEx.class);
                    startActivity(ex9);
                    break;
                case R.id.btnEx10:
                    Intent ex10 = new Intent(MainActivity.this, Ex10PhoneCreate1Ex.class);
                    startActivity(ex10);
                    break;
                case R.id.btnEx11:
                    Intent ex11 = new Intent(MainActivity.this, Ex11ListViewEx.class);
                    startActivity(ex11);
                    break;
            }

        }
    };
}