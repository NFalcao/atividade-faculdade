public class Usuario implements Autenticavel{
    private String senha = "1234";

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
