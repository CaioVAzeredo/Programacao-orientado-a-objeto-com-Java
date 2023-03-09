package Aula2.ATIVIDADES.Atividade1;
//Crie um programa que seja uma calculadora, a partir de todos os conceitos que você aprendeu.
//Sua solução deve ter uma classe chamada Calculadora, que terá três atributos 
//(dois operandos e um operador) e quatro métodos (que fazem as operações 
//básicas: soma, subtração, multiplicação e divisão), que retornarão os resultados. 
//Crie as leituras do usuário e faça a apresentação devida.

public class calcular {
    public static void main(String[] args) {
        calculadora c = new calculadora();
        
        c.setNum1(leitor.receberDouble("Insira o segundo número: "));
        c.setOperador(leitor.receberChar("OPERADOR: "));
        c.setNum2(leitor.receberDouble("Insira o segundo número: "));
        

        System.out.println("valor: " + c.getCalculadora());
        
        
    }
}
