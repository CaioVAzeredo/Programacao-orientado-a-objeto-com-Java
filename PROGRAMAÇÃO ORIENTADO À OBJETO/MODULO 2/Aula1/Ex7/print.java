package Ex7;

public class print {
    
    public static void printNumero(Numero[] num) {
        for(int i = 0; i< num.length; i++){
            System.out.println("\n"+(i+1) + "° número: " + num[i].numero);
        }
    }

    public static void printNum(String numero) {
        System.out.println(numero);
    }
    
}
