import java.util.Scanner;

public class Exemplo2 {
  /**
   * @param args
   */
  public static void main(String[] args) {
    double salario;
    System.out.print("Informe um salario: ");
    salario = new Scanner(System.in).nextDouble();

    float idade;
    System.out.print("Insira uma idade: ");
    idade = new Scanner(System.in).nextInt();

    System.out.printf("Salario: " + salario + "\n") ;
    System.out.printf("idade: " + idade);
  }
}