

public class main {
    public static void main(String[] args) {
        Figura ff = new Figura(15, 30);
        TrianguloRetangulo tri = new TrianguloRetangulo(50, 40);
        Retangulo re = new Retangulo(40, 60);

        Figura f;
        f = tri;
        System.out.println(f.toString());
        f = re;
        System.out.println(f.toString());
    
    }
}
