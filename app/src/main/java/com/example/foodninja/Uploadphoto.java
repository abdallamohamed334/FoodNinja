package com.example.foodninja;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class Uploadphoto extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")

    private  final int  GLARRY_CODE=1000;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView( R.layout.activity_uploadphoto );
        Button nextbraview=findViewById( R.id.nextpreview );
        ImageView glary=findViewById( R.id.glarry );
        glary.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent glarry =new Intent(Intent.ACTION_PICK);
                    glarry.setData( MediaStore.Images.Media.EXTERNAL_CONTENT_URI );
                    startActivityForResult( glarry,GLARRY_CODE );
            }
        } );


        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.activity_uoloadpreviyew, null);
        imageView =view.findViewById( R.id.newphoto );

        nextbraview.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Uploadphoto.this,Uoloadpreviyew.class);
                startActivity( i );
            }
        } );

    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1)
          imageView.setImageURI( data.getData() );
            }


    }
