package com.jcg.itics.tesoem.edu.gridviewbase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvdatos;
    contenido contenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvdatos = findViewById(R.id.gvcontenedor);

        ArrayList<String> arreglo = new ArrayList<>();
        arreglo.add("Fernando");
        arreglo.add("Francisco");
        arreglo.add("Sangano");
        arreglo.add("Sabino");
        arreglo.add("Lagui");
        arreglo.add("Luis");
        arreglo.add("Joel");
        arreglo.add("Jessi");

        contenido = new contenido(this, arreglo);
        gvdatos.setAdapter(contenido);
    }
}
