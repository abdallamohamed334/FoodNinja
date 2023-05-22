package com.example.foodninja;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;
public  class Intropageadapter extends RecyclerView.Adapter<Intropageadapter.viewholder>{
    ArrayList<Screenitem>screenitems;

    public Intropageadapter(ArrayList<Screenitem> screenitems) {
        this.screenitems = screenitems;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from( parent.getContext() ).inflate( R.layout.layoutscreen ,parent,false);
        return new viewholder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

       Screenitem screenitem=screenitems.get( position );
     holder.titel2.setText( screenitem.title );
     holder.discription.setText( screenitem.discription );
     holder.imageView.setImageResource( screenitem.imagescreeen );

    }

    @Override
    public int getItemCount() {
        return screenitems.size();
    }

    public  class viewholder extends RecyclerView.ViewHolder{

        TextView titel2,discription;
        ImageView imageView;
        public viewholder(@NonNull View itemView) {
            super( itemView );

            titel2=itemView.findViewById( R.id.textView3 );
             discription=itemView.findViewById( R.id.textView4 );
             imageView=itemView.findViewById( R.id.imagescreen );
        }
    }
}
