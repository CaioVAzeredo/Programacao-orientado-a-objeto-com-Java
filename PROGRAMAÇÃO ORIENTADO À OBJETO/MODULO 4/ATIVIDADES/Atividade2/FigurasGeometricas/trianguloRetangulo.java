package Atividade2.FigurasGeometricas;

class trianguloRetangulo  extends FigurasGeometricas{
    public double getArea(){
        return (getBase() * getAltura())/2;
    }
    trianguloRetangulo(){}
    trianguloRetangulo(String nome, double Altura, double Base){
        setNome(nome);
        setAltura(Altura);
        setBase(Base);
    }

    public String toString(){
        return "Nome: " + getNome() + "\tArea: " + getArea();
    }
}
