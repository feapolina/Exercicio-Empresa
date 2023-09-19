import java.util.Locale;
import java.util.Scanner;

public class MainEmpresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Empregado funcionario = new Empregado();

        System.out.print("Nome: ");
        funcionario.setNome(sc.nextLine());
        System.out.print("Salário Bruto (R$): ");
        funcionario.setSalarioBruto(sc.nextDouble());
        System.out.print("Imposto: ");
        funcionario.setImposto(sc.nextDouble());
        funcionario.mostraDados();
        System.out.print("Qual o percentual para aumentar o salário? ");
        funcionario.aumentaSalario(sc.nextDouble());
        sc.close();
    }
}
