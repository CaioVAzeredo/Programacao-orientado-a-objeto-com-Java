package Aula2.Exemplo3;

import java.util.Scanner;

public class leitor {

    //Leitor double
    public static double receberDouble(String msg) {
        System.out.println(msg);
        return receberDouble();
    }
    
    public static double receberDouble(){
        return new Scanner(System.in).nextDouble();
    }

    public static char receberChar(String msg) {
        System.out.println(msg);
        return receberChar();
    }

    public static char receberChar(){
        return new Scanner(System.in).next().charAt(0);
    }

    public static String lerString(String msg) {
        System.out.println(msg);
        return lerString();
    }

    private static String lerString() {
        return new Scanner(System.in).next();
    }

   

    
    
}
