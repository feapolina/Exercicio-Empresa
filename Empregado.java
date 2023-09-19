public class Empregado {
    private String nome;
    private double salarioBruto;
    private double imposto;
    private double percentual;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    public double calculaSalarioLiquido(){
        return salarioBruto - imposto;
    }
    public void aumentaSalario(double percentual) {
        this.percentual = percentual;
        salarioBruto += (salarioBruto * percentual / 100);
        double salarioLiquido = salarioBruto - imposto;
        System.out.println("Dados atualizados:");
        System.out.printf("Empregado: %s, Novo salário líquido: R$ %.2f%n", nome, salarioLiquido);
    }


    public void mostraDados(){
        System.out.println("Empregado: " + nome + ", R$ " + calculaSalarioLiquido());

    }
}
