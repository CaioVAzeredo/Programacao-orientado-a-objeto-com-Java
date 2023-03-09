package Ex1;

import java.util.Scanner;

public class leitor {
    public static final Scanner Scanner = new Scanner(System.in);

    // Leitura de Double
    public static double lerDouble(String msg) {
        System.out.println(msg);
        return lerDouble();
    }

    public static double lerDouble() {
        return Scanner.nextDouble();
    }

    // leitor de Character
    public static char lerChar(String msg) {
        System.out.println(msg);
        return lerChar();
    }

    public static char lerChar() {
        return Scanner.next().charAt(0);
    }

    // leitor de String
    public static String lerString(String msg) {
        System.out.println(msg);
        return lerString();
    }

    public static String lerString() {
        return Scanner.next();
    }
    //Ler Int
    public static int lerInt(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public static int lerInt() {
        return Scanner.nextInt();
    }

    public static int lerInt(String msg, String erro, int min, int max) {
        int retorno = 0;
        do {
            retorno = lerInt(msg);
            if(retorno> min && retorno < max){
                break;
            }else{
                System.out.println(erro);
            }
            
        } while (true);

        return retorno;
    }

    // Leitura de Double
    public static double lerDouble(String msg, String erro, double min, double max) {
        double retorno = 0;

        do{
            retorno = lerDouble(msg);
            if(retorno > min){
                break;
            }else{
                System.out.println(erro);
            }
        }while(true);
        
        return retorno;
    }

}
