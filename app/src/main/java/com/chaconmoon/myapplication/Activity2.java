package com.chaconmoon.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    TextView nombre;
    TextView apellidos;
    TextView curso;
    String textNombre;
    String textApellidos;
    String textCurso;
    private final String NAME_KEY = "Nombre";
    private final String SURNAME_KEY = "Apellidos";
    private final String GRADE_KEY = "Curso";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        nombre = findViewById(R.id.TextNombre);
        textNombre = getIntent().getStringExtra(NAME_KEY);
        nombre.setText(textNombre);

        apellidos = findViewById(R.id.Textapellidos);
        textApellidos = getIntent().getStringExtra(SURNAME_KEY);
        apellidos.setText(textApellidos);

        curso = findViewById(R.id.Textcurso);
        textCurso = getIntent().getStringExtra(GRADE_KEY);
        curso.setText(textCurso);
    }
}
