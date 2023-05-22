package com.example.foodninja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Ningasplashapp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView( R.layout.activity_sign_up );
        //Splash scrren in App
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            new Handler().postDelayed( new Runnable() {
                @Override
                public void run() {
                    Intent i =new Intent( Ningasplashapp.this,OnborderActivety.class);
                    startActivity( i );
//                    overridePendingTransition(R.anim.slide_out,
//                            R.anim.slide_in);
                }
            },3000 );
        }
        //end splash screen in App
    }
}