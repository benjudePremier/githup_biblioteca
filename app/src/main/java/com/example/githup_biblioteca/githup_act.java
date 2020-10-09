package com.example.githup_biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Clases.Libro;

public class githup_act extends AppCompatActivity {

    private Spinner spin;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_githup_act);

        spin = (Spinner)findViewById(R.id.spi1);
        txt = (TextView)findViewById(R.id.text1);

        ArrayList<String> listaLibro = (ArrayList<String>)getIntent().getSerializableExtra("listaLibro");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listaLibro);
        spin.setAdapter(adapter);

    }

    public void Aceptar(View v)
    {
        Libro lb = new Libro();
        String libros = spin.getSelectedItem().toString();

        if(libros.equals("Farenheith"))
        {
            txt.setText("El valor de Farenheith es :"+lb.getFarenheith());
        }
        if(libros.equals("Revival"))
        {
            txt.setText("El valor de Revival es : " + lb.getRevival());
        }
        if(libros.equals("ElAlquimista"))
        {
            txt.setText("El valor del Alquimista es : "+lb.getElAlquimista());
        }


    }
}