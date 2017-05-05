package com.amtrak.sagarsrao.amtrak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {


    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView=(ImageView)findViewById(R.id.imageView);


        try {
    //code for getting the midnight value
            Long time = new Date().getTime();
            Date date = new Date(time - time % (24 * 60 * 60 * 1000));

            if(date!=null){
                mImageView.setImageResource(R.mipmap.amtrak);
            }

        }catch(Exception e){

        }

    }
}
