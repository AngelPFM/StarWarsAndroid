package com.example.angelhpascual.starwarsandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{

    Button btnFilm;
    Button btnPeople;
    Button btnPlanet;
    Button btnSpecie;
    Button btnStarship;
    Button btnVehicle;

    ImageView imgHelp;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFilm = (Button) findViewById(R.id.btnFilm);
        btnPeople = (Button) findViewById(R.id.btnPeople);
        btnPlanet = (Button) findViewById(R.id.btnSpecie);



        imgHelp = (ImageView) findViewById(R.id.imgHelp);
    }

    public void btnPeople_onClick(View v)
    {
        Intent i = new Intent(MainActivity.this, BuscarPersonajes.class);
        startActivity(i);
    }

    public void btnPlanet_onClick(View v)
    {
        Intent i = new Intent(MainActivity.this, BuscarPlanetas.class);
        startActivity(i);
    }



    public void btnSpecie_onClick(View v)
    {
        Intent i = new Intent(MainActivity.this, BuscarEspecies.class);
        startActivity(i);
    }

    public void btnFilm_onClick(View v)
    {
        Intent i = new Intent(MainActivity.this, BuscarPeliculas.class);
        startActivity(i);
    }

    public void imgHelp_onClick(View v)
    {
        Intent i = new Intent(MainActivity.this, Help.class);
        startActivity(i);
    }


}
