package com.example.lista_24_03_25;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityEx2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ex2);

        EditText edtNumero1 = findViewById(R.id.edtNumero1);
        EditText edtNumero2 = findViewById(R.id.edtNumero2);
        Button btnSoma = findViewById(R.id.btnSoma);
        Button btnSubtracao = findViewById(R.id.btnSubtracao);
        Button btnMultiplicacao = findViewById(R.id.btnMultiplicacao);
        Button btnDivisao = findViewById(R.id.btnDivisao);
        TextView txtResultadoCalc = findViewById(R.id.txtResultadoCalc);

        View.OnClickListener operacaoListener = v -> {
            String num1Str = edtNumero1.getText().toString();
            String num2Str = edtNumero2.getText().toString();

            if (num1Str.isEmpty() || num2Str.isEmpty()) {
                txtResultadoCalc.setText("Preencha os dois números!");
                return;
            }

            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);
            double resultado = 0;

            if (v.getId() == R.id.btnSoma) {
                resultado = num1 + num2;
            } else if (v.getId() == R.id.btnSubtracao) {
                resultado = num1 - num2;
            } else if (v.getId() == R.id.btnMultiplicacao) {
                resultado = num1 * num2;
            } else if (v.getId() == R.id.btnDivisao) {
                resultado = (num2 == 0) ? Double.NaN : num1 / num2;
            }

            txtResultadoCalc.setText("Resultado: " + resultado);
        };

        btnSoma.setOnClickListener(operacaoListener);
        btnSubtracao.setOnClickListener(operacaoListener);
        btnMultiplicacao.setOnClickListener(operacaoListener);
        btnDivisao.setOnClickListener(operacaoListener);
    }
}
