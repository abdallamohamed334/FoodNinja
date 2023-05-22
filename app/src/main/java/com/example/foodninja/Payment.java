package com.example.foodninja;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Payment extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );

        setContentView( R.layout.activity_payment );
         Button nextphoto=findViewById( R.id.nextphoto );
        nextphoto.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextt=new Intent(Payment.this,Uploadphoto.class);
                startActivity( nextt );
            }
        } );
    }
}