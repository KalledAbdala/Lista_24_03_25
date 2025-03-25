package com.example.lista_24_03_25;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Bt Ex1
        Button btnEx1 = findViewById(R.id.btnEx1);
        btnEx1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityEx1.class);
            startActivity(intent);
        });

        // Bt Ex2
        Button btnEx2 = findViewById(R.id.btnEx2);
        btnEx2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityEx2.class);
            startActivity(intent);
        });

        // Bt Ex3
        Button btnEx3 = findViewById(R.id.btnEx3);
        btnEx3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityEx3.class);
            startActivity(intent);
        });

        // Bt Ex4
        Button btnEx4 = findViewById(R.id.btnEx4);
        btnEx4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityEx4.class);
            startActivity(intent);
        });

        // Bt Ex5
        Button btnEx5 = findViewById(R.id.btnEx5);
        btnEx5.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityEx5.class);
            startActivity(intent);
        });


    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("CicloDeVida", "onStart() chamado");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("CicloDeVida", "onRestart() chamado");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("CicloDeVida", "onResume() chamado");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("CicloDeVida", "onPause() chamado");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("CicloDeVida", "onStop() chamado");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("CicloDeVida", "onDestroy() chamado");
    }
}