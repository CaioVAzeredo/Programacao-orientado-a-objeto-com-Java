

public class Retangulo extends Figura {

    Retangulo(double altura, double base) {
        super(altura, base);
        
    }

    public static double getArea(){
        return getAltura()*getBase();
    }

    public String toString(){
        return "Area: " + getArea();

    }
   

}
