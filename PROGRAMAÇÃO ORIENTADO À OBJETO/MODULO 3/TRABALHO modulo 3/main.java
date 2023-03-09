import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setNome("Circulo");
        circulo.setRaio(5); //raio de 5

        Retangulo retangulo = new Retangulo();
        retangulo.setNome("Retangulo");
        retangulo.setBase(15); //base de 15
        retangulo.setAltura(10); //altura de 10

        Triangulo triangulo = new Triangulo();
        triangulo.setNome("Triangulo");
        triangulo.setBase(10); //base de 10
        triangulo.setAltura(10); // altura de 10

        // Adiciona as figuras geometricas em uma lista
    List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>() ;
    listaFigurasGeometricas.add( retangulo );   
    listaFigurasGeometricas.add( triangulo );
    listaFigurasGeometricas.add( circulo );
    
     // Mostra dados das figuras geometricas
     for(FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {
        System.out.println(figuraGeometrica.getNome());
        System.out.println( figuraGeometrica.getDescricao() );
        System.out.printf( "Area da figura: %.2f \n", figuraGeometrica.getArea() );
        System.out.println("\n");
    }
}
}
