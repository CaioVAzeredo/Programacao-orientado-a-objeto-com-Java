package Ex3;
public class Ex3 {
    
    public static void main(String[] args) { 
        double num1 = leitor.lerDouble("Insira o primeiro  numero");
        char operador = leitor.operador("informe um operador\n(+, -, *, /, %, e): ");
        double num2 = leitor.lerDouble("Insira o segundo número");
        double resultado = excolha.calculadora(num1, operador,num2);
        print.print(num1, operador, num2, resultado);
        
    }

    
}