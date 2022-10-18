package barbearia.app_barbearia_firebase;



import androidx.appcompat.app.AppCompatActivity;

public class Usuario extends AppCompatActivity {
    //Atributos
    private String nomeCompleto;
    private String email;
    private String senha;

    //Construtor.
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
