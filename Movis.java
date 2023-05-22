package com.example.foodninja;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Movis extends RecyclerView.Adapter<Movis.MovisviewHolder> {

    private ArrayList<Cat> Movuislist;

    public Movis(ArrayList<Cat> movuislist) {
        Movuislist = movuislist;
    }

    @NonNull
    @Override
    public MovisviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MovisviewHolder( LayoutInflater.from( parent.getContext()).inflate( R.layout.recyckle,parent, false ) );
    }

    @Override
    public void onBindViewHolder(@NonNull MovisviewHolder holder, int position) {
        holder.tltle.setText( Movuislist.get( position ).getTitle() );
        holder.dis.setText( Movuislist.get( position ).getDis() );
        holder.imagers.setImageResource( Movuislist.get( position ).getImage() );

    }

    @Override
    public int getItemCount() {
        return Movuislist.size();
    }

    class MovisviewHolder extends RecyclerView.ViewHolder {
        TextView tltle;
        TextView dis;
       ImageView imagers;
        public MovisviewHolder(@NonNull View itemView) {
            super(itemView);
            tltle=itemView.findViewById( R.id.texttitle );
           dis=itemView.findViewById( R.id.discription );
           imagers=itemView.findViewById( R.id.product );
        }
    }

}
