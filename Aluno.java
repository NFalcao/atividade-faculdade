public class Aluno {
    private String nome;
    private String matricula;
    private double nota1, nota2, nota3;
    public double media;
    // Construtor com parâmetros
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1=nota1;

    }public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2=nota2;

    }public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3=nota3;
    }
    public void realizarMedia(double nota1, double nota2, double nota3) {
        media = (nota1 + nota2 + nota3) / 3;
    }
}