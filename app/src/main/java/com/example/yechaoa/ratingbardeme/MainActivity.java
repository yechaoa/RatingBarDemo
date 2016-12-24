package com.example.yechaoa.ratingbardeme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RatingBar mRatingBar = (RatingBar) findViewById(R.id.ratingbar);

        mRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(MainActivity.this, "评分星级=" + rating, Toast.LENGTH_SHORT).show();
            }
        });


        float rating = mRatingBar.getRating();//获取星级

    }






}
