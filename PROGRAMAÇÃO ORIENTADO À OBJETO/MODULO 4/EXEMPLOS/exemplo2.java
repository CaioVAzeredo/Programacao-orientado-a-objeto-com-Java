package EXEMPLOS;
public class exemplo2 {
    public static void main(String[] args) {
        Calculator c = new Soma();
        double res = c.operacao(10, 20);//Polimorfismo
        System.out.println("O Resultado da soma é: "+res);
                                    
        c = new Subtracao();
        res = c.operacao(10, 20);//Polimorfismo
        System.out.println("O Resultado da subtração é: "+res);
      }
    }
    interface Calculator{
      //somente métodos com a assinatura
      public double operacao(double a, double b);
    }
    class Soma implements Calculator {
      @Override
      public double operacao(double a, double b) {
        return a + b;
      }
    }
    class Subtracao implements Calculator{
      @Override
      public double operacao(double a, double b) {
        return a - b;
      }
}
