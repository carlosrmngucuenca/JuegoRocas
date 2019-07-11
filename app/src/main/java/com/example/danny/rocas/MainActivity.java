package com.example.danny.rocas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Toolbar Bherramientas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bherramientas=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(Bherramientas);

    }

    public void ejecutar(View vista){
        Intent i = new Intent(this,infoclase.class);
        startActivity(i);


    }

    public void salir_app(View vista){
        finish();
    }

    @Override public boolean onCreateOptionsMenu(Menu mimenu){
     getMenuInflater().inflate(R.menu.menu,mimenu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuopcion){
        int id=menuopcion.getItemId();
        if(id==R.id.configuracion){
            return true;
        }
        if(id==R.id.infor){
            ejecutar(null);
            return true;
        }
        return super.onOptionsItemSelected(menuopcion);

    }

}
