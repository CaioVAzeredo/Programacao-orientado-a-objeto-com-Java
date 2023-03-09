import java.util.Scanner;

public class Ex2 {
    public static void main (String args[]){
        
    System.out.print("Incira a temperatura em celcio: ");
    double cel = new Scanner(System.in).nextDouble();
    double far = (9*cel+160)/5;
    System.out.printf("temperatura em fahrenheit: " + far);

    }
}
