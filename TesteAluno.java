import java.util.Arrays;
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
        aluno.setNota1(sc.nextDouble());
        System.out.print("Nota2: ");
        aluno.setNota2(sc.nextDouble());
        System.out.print("Nota3: ");
        aluno.setNota3(sc.nextDouble());
        aluno.realizarMedia(aluno.getNota1(), aluno.getNota2(), aluno.getNota3());
        System.out.println("Média: " + aluno.media);
    }
}
