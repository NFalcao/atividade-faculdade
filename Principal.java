import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Gerivaldo", 10000, 700);
        gerente.exibirInformacoes();

        Scanner sc = new Scanner(System.in);
        Usuario usuario1 = new Usuario();
        System.out.println("Insira a senha: ");
        if (usuario1.autenticar(sc.nextLine())) {
            System.out.println("Senha aprovada!");
        } else {
            System.out.println("Sai fora!");
        }
    }
}
