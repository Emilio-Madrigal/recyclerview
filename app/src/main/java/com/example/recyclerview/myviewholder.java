package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView NombreE,Puntos,JuegosJ,JuegosG,JuegosE,NocontactoE;
    public myviewholder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.imagen);
        NombreE=itemView.findViewById(R.id.NE);
        Puntos=itemView.findViewById(R.id.PE);
        JuegosJ=itemView.findViewById(R.id.JJE);
        JuegosG=itemView.findViewById(R.id.JGE);
        JuegosE=itemView.findViewById(R.id.JEE);
        NocontactoE=itemView.findViewById(R.id.NCE);
    }

}
