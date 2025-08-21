public class Funcionarios {
    String nome = "Geraldo";
    int idade = 27;
    Double salario = 2576.88;
    boolean ativo = true;

    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();
        funcionario.exibirDados();
    }

    void exibirDados() {
        System.out.println("Nome do Funcionário: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salário: R$" + String.format("%.2f" , this.salario));
        if (this.ativo)
            System.out.println("Ativo");
        else
            System.out.println("Inativo");
    }

}
