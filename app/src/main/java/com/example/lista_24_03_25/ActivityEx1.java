package com.example.lista_24_03_25;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityEx1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ex1);

        EditText edtNome = findViewById(R.id.edtNome);
        EditText edtIdade = findViewById(R.id.edtIdade);
        Button btnVerificar = findViewById(R.id.btnVerificar);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnVerificar.setOnClickListener(v -> {
            String nome = edtNome.getText().toString();
            String idadeStr = edtIdade.getText().toString();

            if (nome.isEmpty() || idadeStr.isEmpty()) {
                txtResultado.setText("Preencha todos os campos!");
                return;
            }

            int idade = Integer.parseInt(idadeStr);
            txtResultado.setText(nome + (idade >= 18 ? " é maior de idade." : " é menor de idade."));
        });

    }
}