package Ex7;

import java.util.Scanner;

public class Ex7 {
    public static final Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        Dados[] num = new Dados[2];

        double somador = 0;
        double contador = 0;
        int impar = 0;
        int par = 0;
        String Quantidade = "";
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Insira um numero: ");
            num[i] = new Dados();
            num[i].numero = Scanner.nextDouble();

            somador += num[i].numero;
            contador ++;

            if(num[i].numero % 2 == 0){
                par++;
            }else{
                impar++;
            }

        }

        double media = somador/contador;
        
        for (int i = 0; i < num.length; i++) {
            Quantidade += num[i].numero + ", ";
        }
        System.out.println("Media dos numeros: " + media+ "\n pares: " + par+ "\nimpar: "+ impar + "\nNumeros informados: " + Quantidade);
    }
}

class Dados {
    double numero;
}
