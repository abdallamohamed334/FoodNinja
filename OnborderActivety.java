package com.example.foodninja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class OnborderActivety extends AppCompatActivity {
ViewPager2 viewPager2;
ArrayList<Screenitem>screenitemArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView( R.layout.activity_onborder_activety );
        Button button=findViewById( R.id.button );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sign=new Intent(OnborderActivety.this,LoginActivity.class);
                startActivity( sign );
            }
        } );
viewPager2=findViewById( R.id.viewPager2 );
int iamge[]={R.drawable.logono,R.drawable.grade};
String title[]={"Find your  Comfort Food here","Food Ninja is Where Your Comfort Food Lives"};
String dis[]={"Here You Can find a chef or dish for every taste and color. Enjoy!","Enjoy a fast and smooth food delivery at your doorstep"};
        screenitemArrayList=new ArrayList<>();
for (int i=0;i< iamge.length;i++){

Screenitem screenitem=new Screenitem( title[i],dis[i],iamge[i] );

screenitemArrayList.add( screenitem );


}
Intropageadapter intropageadapter=new Intropageadapter( screenitemArrayList );
viewPager2.setAdapter( intropageadapter );
viewPager2.setClipChildren( false );
viewPager2.setClipToPadding( false );
viewPager2.setOffscreenPageLimit( 2 );
viewPager2.getChildAt( 0 ).setOverScrollMode( View.OVER_SCROLL_NEVER );


    }
}