package com.example.phanindharreddyv.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private static final String TAG="main";

    ImageView iv_bird;
    TextView tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_bird= (ImageView) findViewById(R.id.iv_bird);
        tv_name= (TextView) findViewById(R.id.tv_name);


        iv_bird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              //  iv_bird.setImageResource(R.drawable.birdtouched);

              //  tv_name.setText("Text changed");

                Intent intent=new Intent(MainActivity.this,
                        MainActivity2.class);

                startActivity(intent);

                Toast.makeText(MainActivity.this, "Imageview clicked", Toast.LENGTH_SHORT).show();
            }
        });


        Log.e(TAG,"oncreate");


        //1
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"onstart");

        //2
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"onResume");

        //3
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"onpause");
        //4


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"onstop");

        //5
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"ondestroy");
    }
}
