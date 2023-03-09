import java.util.Scanner;

public class Exemplo2 {

  private static final Scanner Scanner = new Scanner(System.in);

  public static void main(String[] args) {
    double salario;
    System.out.print("Informe um salario: ");
    salario = Scanner.nextDouble();

    float idade;
    System.out.print("Insira uma idade: ");
    idade = Scanner.nextInt();

    System.out.printf("Salario: " + salario + "\n");
    System.out.printf("idade: " + idade);
  }
}