package com.topone.fasesdodia;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    
    //Atributos
    
    String [] frases = {
            "O código bem escrito é como poesia para um programador.",
            "Debugar: encontrar a agulha no palheiro digital.",
            "Programar é a arte de criar soluções elegantes para problemas complexos.",
            "Compilando sonhos em linhas de código.",
    };
        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void gerarFrase(View view){
        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio = new Random().nextInt(3);
        
        String frase = frases[ numeroAleatorio ];
        texto.setText(frase);
        
    }
    
    public void exibirTodas(View view){
        TextView texto = findViewById(R.id.textResultado);
        String textoResultado = "";
        
        for( String frase : frases){
            textoResultado = textoResultado + frase + "\n" + "\n";
        }
        texto.setText(textoResultado);
                
    }
    
}