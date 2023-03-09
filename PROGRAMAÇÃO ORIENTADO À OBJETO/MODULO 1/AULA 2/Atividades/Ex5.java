import java.util.Scanner;

public class Ex5 {

    public static final Scanner Scanner = new Scanner(System.in);

    public static void main(String[] arg) {

        double contador = 0;
        double maior = 0;
        double menor = 0;
        double somador = 0;

        for (int i = 0; i <= 10; i++) {

            System.out.println("Insira um numero: ");
            double numero = Scanner.nextDouble();

            somador =+ numero;

            contador++;
            
            if (numero > maior) {
                maior = numero;
            }
            if (menor == 0) {
                menor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }

        }
        double media = somador/contador;
        System.out.println("O maior numero: " + maior + "\n O menor numero: " + menor + "\n A media: " + media);
    }

}