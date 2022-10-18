package barbearia.app_barbearia_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
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
    Button btCadastrar;
    Usuario usuario;
    boolean validardados;

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

                validardados = validarCampos();

                if (validardados) {
                    usuario = new Usuario();

                    usuario.setNomeCompleto(edNomeCompleto.getText().toString());
                    usuario.setEmail(edEmail.getText().toString());
                    usuario.setSenha(edSenha.getText().toString());

                    Toast.makeText(TelaCadastro.this,
                            "Cadastrado com sucesso", Toast.LENGTH_LONG).show();

                    Intent it = new Intent(TelaCadastro.this, TelaLogin.class);
                    startActivity(it);
                }else{
                    Toast.makeText(TelaCadastro.this,
                            "Favor preencher todos os campos corretamente", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private boolean validarCampos() {
        boolean retorno = false;

        if(!TextUtils.isEmpty(nomeCompleto.getText().toString())){

            retorno = true;
        }else{
            nomeCompleto.setError("Preencher  *");
            nomeCompleto.requestFocus();
        }
        if(!TextUtils.isEmpty(email.getText().toString())){

            retorno = true;
        }else{
            email.setError("Preencher o campo *");
            email.requestFocus();
        }
        if(!TextUtils.isEmpty(senha.getText().toString())){

            retorno = true;
        }else{
            senha.setError("Preencher o campo corretamente *");
            senha.requestFocus();
        }

        return  retorno;
    }

    private void IniciarComponentes() {
        cadastro = findViewById(R.id.Cadastro);
    }
}
