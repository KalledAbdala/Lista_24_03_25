package com.example.lista_24_03_25;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityEx4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex4);

        EditText edtNome = findViewById(R.id.edtNome);
        Button btnGerar = findViewById(R.id.btnGerar);
        LinearLayout layoutCheckboxes = findViewById(R.id.layoutCheckboxes);

        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutCheckboxes.removeAllViews();

                String nome = edtNome.getText().toString();
                for (char letra : nome.toCharArray()) {
                    CheckBox checkBox = new CheckBox(ActivityEx4.this);
                    checkBox.setText(String.valueOf(letra));
                    layoutCheckboxes.addView(checkBox);
                }
            }
        });
    }
}
