package ATIVIDADES.Atividade5;

public class TrianguloRetangulo extends Figura {

    TrianguloRetangulo(double altura, double base) {
        super(altura, base);
        
    }

    public static double getArea(){
        return (getAltura()*getBase())/2;
    }
    public String toString(){
        return "Area: " + getArea();

    }
    

}
