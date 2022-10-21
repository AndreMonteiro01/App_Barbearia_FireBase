package barbearia.app_barbearia_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TelaLogin extends AppCompatActivity {
    //Atributos
    private EditText emailLogin;
    private EditText senhaLogin;
    Button btEntrar;
    private CheckBox manterConectado;
    Button btCriarConta;
    Usuario usuario;
    boolean validarDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        //Esconder a barra que contém o nome do projeto no emulador.
        getSupportActionBar().hide();
        IniciarComponentes();

        //Objetos para referenciar componentes.
        emailLogin = findViewById(R.id.edEmailLogin);
        senhaLogin = findViewById(R.id.edSenhaLogin);
        btEntrar = findViewById(R.id.btEntrar);
        manterConectado = findViewById(R.id.manterConectado);
        btCriarConta = findViewById(R.id.btCriarConta);

        //Criar evento do botão ENTRAR.
        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarDados = validarCampos();

                if (validarDados){
                    usuario = new Usuario();

                    usuario.setEmailLogin(emailLogin.getText().toString());
                    usuario.setSenhaLogin(senhaLogin.getText().toString());

                    Toast.makeText(TelaLogin.this,
                            " TelaAgendamento.class, Login realizado com sucesso", Toast.LENGTH_LONG).show();

                    Intent it = new Intent(TelaLogin.this, TelaAgendamento.class);
                    startActivity(it);
                }else{
                    Toast.makeText(TelaLogin.this,
                            "Favor preencher campos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private Object validarCampos() {

        boolean retorno = false;

        if(!TextUtils.isEmpty(emailLogin.getText().toString())){

            retorno = true;
        }else{
            emailLogin.setError("Preencher  *");
            emailLogin.requestFocus();
        }
        if(!TextUtils.isEmpty(senhaLogin.getText().toString())){

            retorno = true;
        }else{
            senhaLogin.setError("Preencher o campo *");
            senhaLogin.requestFocus();
        }

        return  retorno;
    }

    private void IniciarComponentes() {
        l
    }
}
