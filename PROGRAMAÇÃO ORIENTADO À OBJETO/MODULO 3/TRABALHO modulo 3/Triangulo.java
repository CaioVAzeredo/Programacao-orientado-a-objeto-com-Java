public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    public double getArea(){
        double A = (getBase()*getAltura())/2;
        return A;
    }
    public String getDescricao(){
        return "Base: " + getBase() + ". Altura: " + getAltura();
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
