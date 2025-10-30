import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Matrícula: ");
        String matricula = sc.nextLine();

        Aluno aluno = new Aluno(nome, matricula);
        // Entrada de notas
        System.out.print("Nota1: ");
        aluno.setNota1(nota1 = sc.nextDouble());
    }
}
