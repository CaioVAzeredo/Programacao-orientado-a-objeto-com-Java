package Aula2.ATIVIDADES.Atividade1;

public class calculadora {
    // atributos da calculadora
    private double num1;
    private double num2;
    private char operador;
    // métodos da calculadora:

    public double getCalculadora() {
        double resultado = 0;
        if (getOperador() == '+') {
            resultado = getNum1() + getNum2();
        }
        if (getOperador() == '-') {
            resultado = getNum1() - getNum2();
        }
        if (getOperador() == '*') {
            resultado = getNum1() * getNum2();
        }
        if (getOperador() == '/') {
            resultado = getNum1() / getNum2();
        }
        return resultado;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

}
