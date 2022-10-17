package barbearia.app_barbearia_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TelaCadastro extends AppCompatActivity {
    //Atributos
    private TextView cadastro;
    private EditText nomeCompleto;
    private EditText email;
    private EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_main);

        //Esconder a barra que contém o nome do projeto no emulador.
        getSupportActionBar().hide();
        IniciarComponentes();

        //Objetos para referenciar os componentes da tela.
        EditText edNomeCompleto = findViewById(R.id.edNomeCompleto);
        EditText edEmail = findViewById(R.id.edEmail);
        EditText edSenha = findViewById(R.id.edSenha);
        Button btCadastrar = findViewById(R.id.btCadastrar);

        //Criar evento do botão CADASTRAR.
        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TelaCadastro.this,
                        "Cadastrado", Toast.LENGTH_SHORT).show();

                Intent it = new Intent(TelaCadastro.this, TelaLogin.class);
                startActivity(it);
            }
        });
    }

    private void IniciarComponentes() {
        cadastro = findViewById(R.id.Cadastro);
    }
}
