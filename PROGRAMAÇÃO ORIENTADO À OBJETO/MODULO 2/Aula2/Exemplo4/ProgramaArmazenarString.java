package Aula2.Exemplo4;

import java.util.ArrayList;//Import para usar o objeto ArrayList
public class ProgramaArmazenarString{
  public static void main(String args[]){
/*L1*/ ArrayList<String> times = new ArrayList();
       
       // adicionando elementos à vontade
       times.add("Bragantino");
       times.add("Flamengo");
       times.add("Fluminense");
       times.add("Vasco");

       //acesso indexado
       String time = times.get(2);// inicia de ZERO
       System.out.println(time+"\n"); //será apresentado: Fluminense

       //Para apresentar todos
/*L2*/ for(String elemento : times){
         System.out.println(elemento);
       }
			
    }
}
