package com.example.receitanamao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AtividadeIntroducao extends AppCompatActivity {

    //Variaveis
    private Button btnJaSouUtilizador, btnNovoUtilizadorRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_atividade_introducao);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnJaSouUtilizador = findViewById(R.id.btnJaSouUtilizador);
        btnNovoUtilizadorRegistro = findViewById(R.id.btnNovoUtilizadorRegistro);

        btnJaSouUtilizador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AtividadeIntroducao.this, Login.class);
                startActivity(intent);
                finish();
            }
        });

        btnNovoUtilizadorRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AtividadeIntroducao.this, Registro.class);
                startActivity(intent);
                finish();
            }
        });
    }
}