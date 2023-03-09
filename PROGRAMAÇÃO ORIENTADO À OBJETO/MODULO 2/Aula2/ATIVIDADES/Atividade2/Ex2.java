package Aula2.ATIVIDADES.Atividade2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Uma palavra: ");
        String string = new Scanner(System.in).next();
        
        String StringUp = string.toUpperCase();

        String StringLow = string.toLowerCase();

        int StringQuanto = string.length();

        boolean stringComp = string.equals("Eu estou estudando Java");

        
        {
            
            String myString = string;
            StringTokenizer stringTokenizer1 = new StringTokenizer(myString);
            
    
            int tokensCount1  = stringTokenizer1.countTokens();
           
    
            System.out.println("Word count without delimiter: "+String.valueOf(tokensCount1));
           
        }
    }
}
