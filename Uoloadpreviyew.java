package com.example.foodninja;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Uoloadpreviyew extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView( R.layout.activity_uoloadpreviyew );
         Button nextsign=findViewById( R.id.nextsignup );
        nextsign.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n =new Intent(Uoloadpreviyew.this,Signupsucsses.class);
                startActivity( n );
            }
        } );
    }
}