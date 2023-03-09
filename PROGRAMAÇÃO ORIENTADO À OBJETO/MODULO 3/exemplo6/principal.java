package exemplo6;
public class principal {
    public static void main(String[] args) {
        /**
         * 
         */
        professor p = new professor("Caio", "DOUTOR", 5000,"uc1561894895");
        professor p2 = new professor("Caio", "DOUTOR", 5000,"uc1561894895");
        if(p.equals(p2)){
            System.out.println("sao iguais ");
        }else{
            
            System.out.println("sao diferentes");
        }
    }
}
