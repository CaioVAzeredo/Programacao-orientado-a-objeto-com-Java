import java.util.Scanner;

public class Ex2 {
private static final Scanner Scanner = new Scanner(System.in); 

public static void main(String[] args){

    System.out.println("informe o percentual do juros (%): ");
    double taxa = (Scanner.nextDouble())/100;

    System.out.println("Informe o valor que está devendo: ");
    double valor = Scanner.nextDouble();

    double  juros = valor + (valor*taxa);
    

    System.out.println("valor total a ser pago: " + juros);
}

}
