package com.example.lista_24_03_25;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityEx5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex5);

        CheckBox checkNotificacoes = findViewById(R.id.checkNotificacoes);
        CheckBox checkModoEscuro = findViewById(R.id.checkModoEscuro);
        CheckBox checkLembrarLogin = findViewById(R.id.checkLembrarLogin);
        Button btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder preferencias = new StringBuilder();

                if (checkNotificacoes.isChecked()) {
                    preferencias.append("Receber notificações\n");
                }
                if (checkModoEscuro.isChecked()) {
                    preferencias.append("Modo escuro\n");
                }
                if (checkLembrarLogin.isChecked()) {
                    preferencias.append("Lembrar login\n");
                }

                // Verifica se alguma opção foi escolhida
                if (preferencias.length() == 0) {
                    Toast.makeText(ActivityEx5.this, "Nenhuma preferência foi escolhida.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ActivityEx5.this, "Preferências salvas:\n" + preferencias.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
