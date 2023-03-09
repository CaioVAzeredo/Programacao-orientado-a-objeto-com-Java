public class Retangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    public double getArea(){ 
        return getBase()*getAltura();
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
