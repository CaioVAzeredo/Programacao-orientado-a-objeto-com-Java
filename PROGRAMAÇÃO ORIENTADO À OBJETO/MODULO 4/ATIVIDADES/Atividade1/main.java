package Atividade1;
public class main{
    public static void main(String[] args) {
     professor prof = new professor("Caio ", "123.456.789-23", 50000,"MESTRE");
     System.out.println(prof.toString());

     administrativo adm = new administrativo("Felipe ", "123.456.789-23", 50000,2);
     System.out.println(adm.toString());
    }
}