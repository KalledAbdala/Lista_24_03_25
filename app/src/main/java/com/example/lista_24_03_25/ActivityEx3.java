package com.example.lista_24_03_25;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityEx3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3);

        EditText edtNome = findViewById(R.id.edtNome);
        EditText edtIdade = findViewById(R.id.edtIdade);
        EditText edtUF = findViewById(R.id.edtUF);
        EditText edtCidade = findViewById(R.id.edtCidade);
        EditText edtTelefone = findViewById(R.id.edtTelefone);
        EditText edtEmail = findViewById(R.id.edtEmail);
        RadioGroup rgTamanho = findViewById(R.id.rgTamanho);
        CheckBox cbVermelho = findViewById(R.id.cbVermelho);
        CheckBox cbAzul = findViewById(R.id.cbAzul);
        CheckBox cbVerde = findViewById(R.id.cbVerde);
        Button btnCadastrar = findViewById(R.id.btnCadastrar);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnCadastrar.setOnClickListener(v -> {
            String nome = edtNome.getText().toString();
            String idade = edtIdade.getText().toString();
            String uf = edtUF.getText().toString();
            String cidade = edtCidade.getText().toString();
            String telefone = edtTelefone.getText().toString();
            String email = edtEmail.getText().toString();

            int selectedId = rgTamanho.getCheckedRadioButtonId();
            RadioButton rbSelecionado = findViewById(selectedId);
            String tamanho = (rbSelecionado != null) ? rbSelecionado.getText().toString() : "Nenhum selecionado";

            StringBuilder cores = new StringBuilder();
            if (cbVermelho.isChecked()) cores.append("Vermelho ");
            if (cbAzul.isChecked()) cores.append("Azul ");
            if (cbVerde.isChecked()) cores.append("Verde ");

            String resultado = "Nome: " + nome + "\nIdade: " + idade + "\nUF: " + uf +
                    "\nCidade: " + cidade + "\nTelefone: " + telefone + "\nEmail: " + email +
                    "\nTamanho: " + tamanho + "\nCores: " + cores.toString();
            txtResultado.setText(resultado);
        });
    }
}
