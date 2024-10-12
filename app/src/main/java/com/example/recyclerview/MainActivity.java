package com.example.recyclerview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    EditText NombreE,Puntos,JuegosJ,JuegosG,JuegosE,NocontactoE;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

            NombreE=findViewById(R.id.NEM);
            Puntos=findViewById(R.id.PEM);
            JuegosJ=findViewById(R.id.JJEM);
            JuegosG=findViewById(R.id.JGEM);
            JuegosE=findViewById(R.id.JEEM);
            NocontactoE=findViewById(R.id.NCEM);

    }
    public void limpieza(View view) {
        NombreE.setText("");
        Puntos.setText("");
        JuegosJ.setText("");
        JuegosG.setText("");
        JuegosE.setText("");
        NocontactoE.setText("");
    }

    public void guardardor(View view) {

        String puntos = Puntos.getText().toString();
        String juegosJ = JuegosJ.getText().toString();
        String juegosE = JuegosE.getText().toString();
        String juegosG = JuegosG.getText().toString();
        String contactoE = NocontactoE.getText().toString();
        String nombreE = NombreE.getText().toString();

        recyclerView=findViewById(R.id.recyclerview);
        List<item> items=new ArrayList<item>();
        items.add(new item(puntos,nombreE,juegosJ,juegosG,juegosE,contactoE));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new myadapter(getApplicationContext(),items));

    }

    public void ver(View view) {
        private void onClickSumar(){
            Intent cambio = new Intent(this, recyclerview.class);
            cambio.putExtra("dato", editNumero.getText().toString());
            startActivity(cambio);
        }

        @Override
        public void onOptionsMenuClosed(Menu menu) {
            getMenuInflater().inflate(R.menu.menu, menu);
            super.onOptionsMenuClosed(menu);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu, menu);
            return super.onCreateOptionsMenu(menu);
        }
    }
}