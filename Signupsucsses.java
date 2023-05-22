package com.example.foodninja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Signupsucsses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView( R.layout.activity_signupsucsses );
        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent next=new Intent(Signupsucsses.this,Home.class);
                startActivity( next );
            }
        },2000 );
    }
}