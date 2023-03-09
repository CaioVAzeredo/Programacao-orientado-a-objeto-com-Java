package Ex3;
import java.util.Scanner;


public class leitor {
    public static final Scanner Scanner = new Scanner(System.in);
   public static String lerString(String msg){
            System.out.println(msg);
            return lerString();
   }
    public static String lerString(){
            return Scanner.next();
    }
    public static double lerDouble(String msg) {
        System.out.println(msg);
        return lerDouble();
    }
    public static double lerDouble() {
        return Scanner.nextDouble();
    }
    public static char operador(String msg) {
        System.out.println(msg);
        return operador();
    }
    public static char operador() {
        return Scanner.next().charAt(0);
    }
}
