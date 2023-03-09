import java.util.Scanner;

public class Ex3 {
    public static void main(String arg[]) {
        System.out.print("Insira uma nota: ");
        double nota1 = new Scanner(System.in).nextDouble();
        System.out.print("Insira a segunda nota: ");
        double nota2 = new Scanner(System.in).nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.printf("Nota: " + media + "\nAPROVADO");
        } else {
            System.out.printf("Nota: " + media + "\nREPROVADO");
        }
    }
}
