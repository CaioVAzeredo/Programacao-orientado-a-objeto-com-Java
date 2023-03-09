package EXEMPLOS;
import java.util.Scanner;
import java.util.InputMismatchException;
public class exemplo7{
  public static void main(String args[]){
    double salario;
    try{//delimita a zona de perigo
    //na leitura pode ter exception
    System.out.println("Informe o salário: ");
    salario = new Scanner(System.in).nextDouble();  
    //o que acontece qdo acontecer a exception será definido no catch.
    }catch(InputMismatchException ex){
      System.out.println("Ops! O valor informado é inválido");   
    }
    
    System.out.println("Finalizando o programa normalmente.");  
  }   
  
  
}

