package com.example.foodninja;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.RecoverySystem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    ArrayList<Cat> cats;
    ArrayList<Cat> catr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );

        setContentView( R.layout.activity_home );
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView viewmore=findViewById( R.id.viewmore );
        viewmore.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent has=new Intent(Home.this,Exeplorproduct.class);
                startActivity( has );
            }
        } );

         RecyclerView recyclerView=findViewById( R.id.recycle );
          @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RecyclerView recyclerView1=(RecyclerView) findViewById( R.id.recycletwo );

         recyclerView.setLayoutManager( new LinearLayoutManager( this,LinearLayoutManager.HORIZONTAL,false ));

         cats = new ArrayList<>();

         Cat cat1=new Cat( R.drawable.resturant,"Vegan Resto","8km" );
         cats.add(  cat1);
        Cat cat2=new Cat( R.drawable.recturantt,"Healthy Food","15km" );
        cats.add(  cat2);
        Cat cat3=new Cat( R.drawable.restu,"Good Food","2km" );
        cats.add(  cat3);
        Cat cat4=new Cat( R.drawable.restu,"Good Food","2km" );
        cats.add( cat4 );
recyclerView.setAdapter( new Movis( cats ) );

recyclerView1.setAdapter( new Movis( cats ) );


    }




}