package com.example.lojamateriaisdeconstrucao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ferramentas;
    private ImageView materiais;
    private ImageView tinturas;
    private ImageView opt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ferramentas = findViewById(R.id.imgToolsID);
       materiais = findViewById(R.id.imgMatID);
       tinturas = findViewById(R.id.imgPaintID);
       opt = findViewById(R.id.imgOptionsID);

       ferramentas.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intencao = new Intent(MainActivity.this, Ferramentas.class);
                    startActivity(intencao);
           }
       });

       materiais.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intencao1 = new Intent(MainActivity.this, Materiais.class);
                    startActivity(intencao1);
           }
       });

       tinturas.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intencao2 = new Intent(MainActivity.this, Tinturas.class);
                    startActivity(intencao2);
           }
       });

       opt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intencao3 = new Intent(MainActivity.this, Opcoes.class);
                    startActivity(intencao3);
           }
       });
    }
}
