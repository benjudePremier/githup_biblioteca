package com.example.githup_biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ProgressBar pro;
    private Button btne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pro = (ProgressBar)findViewById(R.id.prog);
        btne = (Button)findViewById(R.id.btn1);


        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new Task().execute(); // ejecuta mi tarea asíncrona.
            }
        });


        pro.setVisibility(View.INVISIBLE);
    }

    class Task extends AsyncTask<String, Void, String> {

        @Override  // Vamos a darle la configuración inicial a la tarea
        protected void onPreExecute() {

            pro.setVisibility(View.VISIBLE);
        }


        @Override // vamos a emplear el proceso o tarea pesada en segundo plano.
        protected String doInBackground(String... strings) {

            for(int i = 1; i < 10; i++)
            {
                try {
                    Thread.sleep(1000);

                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            return null;
        }


        @Override // finalizamos la tarea
        protected void onPostExecute(String s) {

            pro.setVisibility(View.INVISIBLE);
            ArrayList<String> listaLibro = new ArrayList<String>();
            listaLibro.add("Farenheith");
            listaLibro.add("Revival");
            listaLibro.add("ElAlquimista");
            listaLibro.add("Elpoder");
            listaLibro.add("Despertar");

            Intent i = new Intent(getBaseContext(), githup_act.class);
            i.putExtra("listaLibro",listaLibro);
            startActivity(i);
        }
    }

    public void Mostrar(View v)
    {
        ArrayList<String> listaLibro = new ArrayList<String>();
        listaLibro.add("Farenheith");
        listaLibro.add("Revival");
        listaLibro.add("ElAlquimista");
        listaLibro.add("Elpoder");
        listaLibro.add("Despertar");

        Intent i = new Intent(getBaseContext(), githup_act.class);
        i.putExtra("listaLibro",listaLibro);
        startActivity(i);
    }
}