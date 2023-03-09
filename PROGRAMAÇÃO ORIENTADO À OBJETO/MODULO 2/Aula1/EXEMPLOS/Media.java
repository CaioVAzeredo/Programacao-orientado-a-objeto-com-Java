package EXEMPLOS;
public class Media {

  public static void main(String args[]) {

    double valorUm = 10;
    double valorDois = 3;

    // invocando um método
    double somar = somar(valorUm, valorDois);
    System.out.println(somar);
  }

  // os metodos devem ficar dentro da classe e fora do main
  public static double somar(double valorUm, double valorDois) {
    return (valorUm + valorDois);
  }
}