package com.chaconmoon.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {

    private String mNombre;
    private String mApellidos;
    private String mCurso;
    private String toastNombre;
    private String toastApellidos;
    private String toastCurso;
    private Button nVisualizarButton;
    private Intent mIntent;
    private final String NAME_KEY = "Nombre";
    private final String SURNAME_KEY = "Apellidos";
    private final String GRADE_KEY = "Curso";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nVisualizarButton = findViewById(R.id.visualizar);
        nVisualizarButton.setOnClickListener(view -> {
           mNombre=verNombre();
           toastNombre = "El Nombre es: "+ mNombre;
           mApellidos=verApellidos();
           toastApellidos = "Los Apellidos son: "+ mApellidos;
           mCurso=verCurso();
           toastCurso = "El curso es: "+mCurso;
            //Toast.makeText(this,toastNombre,Toast.LENGTH_SHORT).show();
            //Toast.makeText(this,toastApellidos,Toast.LENGTH_SHORT).show();
            //Toast.makeText(this,toastCurso,Toast.LENGTH_SHORT).show();
            mIntent = new Intent(Activity1.this,Activity2.class);
            mIntent.putExtra(NAME_KEY,mNombre);
            mIntent.putExtra(SURNAME_KEY,mApellidos);
            mIntent.putExtra(GRADE_KEY, mCurso);
            startActivity(mIntent);
        });

    }
    private String verNombre(){
        EditText nombre = (EditText) findViewById(R.id.Nombre);
        return nombre.getText().toString();
    }
    private String verApellidos(){
        EditText apellidos = (EditText) findViewById(R.id.apellidos);
        return apellidos.getText().toString();
    }
    private String verCurso(){
        EditText curso = (EditText) findViewById(R.id.curso);
        return curso.getText().toString();
    }
}