package com.example.bibliotecadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Clases.Libros;

public class GitHub_act extends AppCompatActivity {
    private Spinner spin;
    private TextView texto;
    Libros libro = new Libros();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git_hub_act);

        spin = (Spinner) findViewById(R.id.SpLibros);
        texto = (TextView) findViewById(R.id.TvMostrar);

        ArrayList<String> listaLibros = (ArrayList<String>) getIntent().getSerializableExtra("listaLibros");
        listaLibros.add(libro.getFarenheit());
        listaLibros.add(libro.getRevival());
        listaLibros.add(libro.getAlquimista());
        listaLibros.add(libro.getPoder());
        listaLibros.add(libro.getDespertar());

        ArrayAdapter<String> adaptLibros = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaLibros);

        spin.setAdapter(adaptLibros);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (spin.getSelectedItem().equals(libro.getFarenheit())) {
                    texto.setText("El valor de Farenheit es: " + libro.getPreFarenheit());
                }

                if (spin.getSelectedItem().equals(libro.getRevival())) {
                    texto.setText("El valor de Revival es: " + libro.getPreRevival());
                }

                if (spin.getSelectedItem().equals(libro.getAlquimista())) {
                    texto.setText("El valor de El Alquimista es: " + libro.getPreElAlquimista());
                }

                if (spin.getSelectedItem().equals(libro.getPoder())) {
                    texto.setText("El valor de El Poder es: " + libro.getPrePoder());
                }
                if (spin.getSelectedItem().equals(libro.getDespertar())) {
                    texto.setText("El valor de Despertar es: " + libro.getPreDespertar());
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}