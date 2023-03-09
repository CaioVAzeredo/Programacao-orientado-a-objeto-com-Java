package Atividade2.FigurasGeometricas;

class retangulo extends FigurasGeometricas{
    public double getArea(){
        return getBase() * getAltura();
    }
    retangulo(){}
    retangulo(String nome, double Altura, double Base){
        setNome(nome);
        setAltura(Altura);
        setBase(Base);
    }

    public String toString(){
        return "Nome: " + getNome() + "\tArea: " + getArea();
    }

}
