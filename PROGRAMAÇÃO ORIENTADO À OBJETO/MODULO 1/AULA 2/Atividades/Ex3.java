import java.util.Scanner;

public class Ex3 {
    public static final Scanner Scanner = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Insira o nome do vendedor: ");
        String vendedor = Scanner.next();

        System.out.println("Informe o salario do vendedor: ");
        double salario = Scanner.nextDouble();

        System.out.println("Insira a quantidade de vendas no mês: ");
        double vendas = Scanner.nextDouble();

        double comissao = vendas * (salario*0.15);

        double salFinal = comissao + salario;

        System.out.println(vendedor + ": " + salFinal);

    }
}