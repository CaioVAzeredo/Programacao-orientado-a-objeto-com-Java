

public class Figura {
    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private static double altura;
    public static double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private static double base;
    
     public static double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Figura(double altura, double base) {
        setAltura(altura);
        setBase(base);
    }

    public static double getArea(){
        return 0;
    }
    
}
