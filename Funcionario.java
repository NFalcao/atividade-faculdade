public abstract class Funcionario {
    protected String nome;
    String endereco;
    public double altura;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Método abstrato: será implementado pelas subclasses
    public abstract double calcularSalario();

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário base: R$" + salarioBase);
    }
}
