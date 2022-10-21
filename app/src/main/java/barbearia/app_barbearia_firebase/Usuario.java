package barbearia.app_barbearia_firebase;



import androidx.appcompat.app.AppCompatActivity;

public class Usuario extends AppCompatActivity {
    //Atributos
    private String nomeCompleto;
    private String email;
    private String senha;
    private String emailLogin;
    private String senhaLogin;

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

    public String getEmailLogin(){return emailLogin; }

    public void setEmailLogin(String emailLogin) { this.emailLogin = emailLogin; }

    public String getSenhaLogin(){return senhaLogin; }

    public  void setSenhaLogin(String senhaLogin) {this.senhaLogin = senhaLogin; }
}
