package com.example.foodninja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class Exeplorproduct extends AppCompatActivity {
    ArrayList<Cat> catss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_exeplorproduct );
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );



        RecyclerView recyclerViewtwo=findViewById( R.id.recycleactivity2 );


        GridLayoutManager gridLayoutManager=new GridLayoutManager( this,2 ,GridLayoutManager.VERTICAL,false);
        recyclerViewtwo.setLayoutManager( gridLayoutManager );


        catss = new ArrayList<>();
//
        Cat cat1=new Cat( R.drawable.resturant,"Vegan Resto","8km" );
        catss.add(  cat1);
        Cat cat2=new Cat( R.drawable.recturantt,"Healthy Food","15km" );
        catss.add(  cat2);
        Cat cat3=new Cat( R.drawable.restu,"Good Food","2km" );
        catss.add(  cat3);
        Cat cat4=new Cat( R.drawable.restu,"Good Food","2km" );
        catss.add( cat4 );
        Cat cat5=new Cat( R.drawable.restu,"Good Food","2km" );
        catss.add(  cat5);
        Cat cat6=new Cat( R.drawable.restu,"Good Food","2km" );
        catss.add( cat6 );
        Cat cat7=new Cat( R.drawable.restu,"Good Food","2km" );
        catss.add(  cat7);
        Cat cat8=new Cat( R.drawable.restu,"Good Food","2km" );
        catss.add( cat8 );

        recyclerViewtwo.setAdapter( new Movis( catss ) );
    }
}