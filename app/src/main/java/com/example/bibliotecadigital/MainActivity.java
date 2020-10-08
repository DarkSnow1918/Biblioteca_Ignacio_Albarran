package com.example.bibliotecadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText usuario, contra;
    private Button bLogin;
    private ProgressBar pb;
    private ImageButton git;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = (EditText)findViewById(R.id.EtUsuario);
        contra = (EditText)findViewById(R.id.EtContra);
        bLogin = (Button)findViewById(R.id.BtnLogin);
        pb = (ProgressBar)findViewById(R.id.PbAsync);
        git = (ImageButton)findViewById(R.id.IbGit);
        pb.setVisibility(View.INVISIBLE);
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task().execute();
            }
        });



    }

    //Tarea asíncrona
    class Task extends AsyncTask<String, Void, String>
    {
        //Configura el proceso inicial de mi tarea
        @Override
        protected void onPreExecute() {
            pb.setVisibility(View.VISIBLE);
        }

        //Emplea la tarea
        @Override
        protected String doInBackground(String... strings) {
            for (int i = 1; i<=10;i++)
            {
                try {
                    Thread.sleep(1000);

                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }


            return null;
        }

        //Finaliza mi tarea asíncrona
        @Override
        protected void onPostExecute(String s) {
            pb.setVisibility(View.INVISIBLE);
            Intent i = new Intent(getBaseContext(), Home_act.class);
            startActivity(i);


        }
    }

    public void GitHub(View view)
    {
        ArrayList<String> libros = new ArrayList<String>();
        Intent i = new Intent(this, GitHub_act.class);
        i.putExtra("listaLibros", libros);
        startActivity(i);
    }
}