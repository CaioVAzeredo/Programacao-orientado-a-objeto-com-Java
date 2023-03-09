package Ex3;
public class excolha {
    public static double calculadora(double num1, double operador, double num2){
        double resultado = 0;
        if (operador == '+') {
            resultado = matematica.soma(num1, num2);
        }
        if (operador == '-') {
            resultado = matematica.sub(num1, num2);
        }
        if (operador == '*') {
            resultado = matematica.multi(num1,num2);
        }
        if (operador == '/') {
            resultado = matematica.divi(num1, num2);
        }
        if (operador == '%') { 
            resultado = matematica.resto(num1, num2);
        }
        if(operador == 'e'){
            resultado = matematica.exp(num1, num2);
        }
        return resultado;
    }
}
