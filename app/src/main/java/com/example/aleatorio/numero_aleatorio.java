package com.example.aleatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;
public class numero_aleatorio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_aleatorio);
    }
    public void aleatorio(View View){
        TextView texto=findViewById(R.id.TextResultado);
        int x=new Random(). nextInt(100);
        texto.setText("NUMERO: " + x);
    }
}