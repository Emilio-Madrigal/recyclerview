package com.example.recyclerview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myadapter extends RecyclerView.Adapter<myviewholder> {
    Context contex;
    List<item> item;

    public myadapter(Context contex, List<com.example.recyclerview.item> item) {
        this.contex = contex;
        this.item = item;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myviewholder(LayoutInflater.from(contex).inflate(R.layout.itemview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.NombreE.setText(item.get(position).getNombre());
        holder.Puntos.setText(item.get(position).getPuntos());
        holder.JuegosJ.setText(item.get(position).getJuegosJugados());
        holder.JuegosG.setText(item.get(position).getJuegosGanados());
        holder.JuegosE.setText(item.get(position).getJuegosEmpatados());
        holder.NocontactoE.setText(item.get(position).getContactoE());


    }

    @Override
    public int getItemCount() {
        return item.size();
    }
}
