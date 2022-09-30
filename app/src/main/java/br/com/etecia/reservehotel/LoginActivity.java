package br.com.etecia.reservehotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button btnEntrar, btnSair;
    EditText edtUsuario, edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        btnEntrar = findViewById(R.id.btnEntrar);
        btnSair = findViewById(R.id.btnSair);
        edtSenha = findViewById(R.id.edtSenha);
        edtUsuario = findViewById(R.id.edtUsuario);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             //criando as variaveis
                                             String usuario, senha;
                                             //atribuindo valores sa variaveis
                                             usuario = edtUsuario.getText().toString();
                                             senha = edtSenha.getText().toString();

                                             //validando usuario e senha
                                             if (usuario.equals("Raquell") && senha.equals("0510")) {
                                                 //abrir janela de menu
                                                 startActivity(new Intent(getApplicationContext(),
                                                         MainActivity.class));
                                                 finish();

                                             } else {
                                                 Toast.makeText(getApplicationContext(),
                                                         "Usuário ou senha invalidos!!!",
                                                         Toast.LENGTH_SHORT).show();
                                                 edtUsuario.setText("");
                                                 edtSenha.setText("");
                                                 edtUsuario.requestFocus();

                                             }
                                         }
                                     }
        );
    }
}