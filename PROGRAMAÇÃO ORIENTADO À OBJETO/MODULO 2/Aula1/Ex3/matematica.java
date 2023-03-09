package Ex3;
public class matematica {
    public static double soma(double num1, double num2) {
        return num1 + num2;
    }
    public static double sub(double num1, double num2) {
        return num1 - num2;
    }
    public static double multi(double num1, double num2){
        return num1*num2;
    }
    public static double divi(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1/num2;
    }
    public static double resto(double num1, double num2){
        return num1%num2;
    }
    public static double exp(double num1, double num2){
        double numero = num1;
        
        for(int i = 1; i<num2; i++){
            numero = numero * num1;
        }
        return numero;
    }
}
