package com.example.mike.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Glide.*;
import com.bumptech.glide.request.target.DrawableImageViewTarget;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        DrawableImageViewTarget imageViewTarget1 = new DrawableImageViewTarget(imageView1);
        Glide.with(this).load(R.raw.sample_1).into(imageViewTarget1);

        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        DrawableImageViewTarget imageViewTarget2 = new DrawableImageViewTarget(imageView2);
        Glide.with(this).load(R.raw.sample_2).into(imageViewTarget2);

        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        DrawableImageViewTarget imageViewTarget3 = new DrawableImageViewTarget(imageView3);
        Glide.with(this).load(R.raw.sample_3).into(imageViewTarget3);

        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        DrawableImageViewTarget imageViewTarget4 = new DrawableImageViewTarget(imageView4);
        Glide.with(this).load(R.raw.sample_4).into(imageViewTarget4);

        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        DrawableImageViewTarget imageViewTarget5 = new DrawableImageViewTarget(imageView5);
        Glide.with(this).load(R.raw.sample_5).into(imageViewTarget5);

//        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
//        DrawableImageViewTarget imageViewTarget6 = new DrawableImageViewTarget(imageView6);
//        Glide.with(this).load(R.raw.sample_6).into(imageViewTarget6);
//
//        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
//        DrawableImageViewTarget imageViewTarget7 = new DrawableImageViewTarget(imageView7);
//        Glide.with(this).load(R.raw.sample_7).into(imageViewTarget7);
//
//        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
//        DrawableImageViewTarget imageViewTarget8 = new DrawableImageViewTarget(imageView8);
//        Glide.with(this).load(R.raw.sample_8).into(imageViewTarget8);
//
//        ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);
//        DrawableImageViewTarget imageViewTarget9 = new DrawableImageViewTarget(imageView9);
//        Glide.with(this).load(R.raw.sample_9).into(imageViewTarget9);
//
//        ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
//        DrawableImageViewTarget imageViewTarget10 = new DrawableImageViewTarget(imageView10);
//        Glide.with(this).load(R.raw.sample_10).into(imageViewTarget10);
//
//        ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);
//        DrawableImageViewTarget imageViewTarget11 = new DrawableImageViewTarget(imageView11);
//        Glide.with(this).load(R.raw.sample_11).into(imageViewTarget11);
//
//        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
//        DrawableImageViewTarget imageViewTarget12 = new DrawableImageViewTarget(imageView12);
//        Glide.with(this).load(R.raw.sample_12).into(imageViewTarget12);
//
//        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
//        DrawableImageViewTarget imageViewTarget13 = new DrawableImageViewTarget(imageView13);
//        Glide.with(this).load(R.raw.sample_13).into(imageViewTarget13);
//
//        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
//        DrawableImageViewTarget imageViewTarget14 = new DrawableImageViewTarget(imageView14);
//        Glide.with(this).load(R.raw.sample_14).into(imageViewTarget14);
//
//        ImageView imageView15 = (ImageView) findViewById(R.id.imageView15);
//        DrawableImageViewTarget imageViewTarget15 = new DrawableImageViewTarget(imageView15);
//        Glide.with(this).load(R.raw.sample_15).into(imageViewTarget15);
//
//        ImageView imageView16 = (ImageView) findViewById(R.id.imageView16);
//        DrawableImageViewTarget imageViewTarget16 = new DrawableImageViewTarget(imageView16);
//        Glide.with(this).load(R.raw.sample_16).into(imageViewTarget16);
//
//        ImageView imageView17 = (ImageView) findViewById(R.id.imageView17);
//        DrawableImageViewTarget imageViewTarget17 = new DrawableImageViewTarget(imageView17);
//        Glide.with(this).load(R.raw.sample_17).into(imageViewTarget17);
//
//        ImageView imageView18 = (ImageView) findViewById(R.id.imageView18);
//        DrawableImageViewTarget imageViewTarget18 = new DrawableImageViewTarget(imageView18);
//        Glide.with(this).load(R.raw.sample_18).into(imageViewTarget18);
//
//        ImageView imageView19 = (ImageView) findViewById(R.id.imageView19);
//        DrawableImageViewTarget imageViewTarget19 = new DrawableImageViewTarget(imageView19);
//        Glide.with(this).load(R.raw.sample_19).into(imageViewTarget19);
//
//        ImageView imageView20 = (ImageView) findViewById(R.id.imageView20);
//        DrawableImageViewTarget imageViewTarget20 = new DrawableImageViewTarget(imageView20);
//        Glide.with(this).load(R.raw.sample_20).into(imageViewTarget20);

    }
}
