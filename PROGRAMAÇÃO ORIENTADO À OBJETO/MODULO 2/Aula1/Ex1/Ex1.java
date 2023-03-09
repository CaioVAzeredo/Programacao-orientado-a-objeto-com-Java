
package Ex1;
public class Ex1{
    public static void main (String[] args){
            double valor = leitor.lerDouble("Insira o valor da dívida");
            double taxa = leitor.lerDouble("taxa do juros");
            double juros = calcular.calcularDivida(valor,taxa);
            print.print(valor, taxa, juros); 
    }
}


