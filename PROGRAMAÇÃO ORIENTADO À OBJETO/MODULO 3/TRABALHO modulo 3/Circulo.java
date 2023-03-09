class Circulo extends FiguraGeometrica {
    private double raio;

    public double getArea() {
        return 3.14 * (getRaio() * getRaio());
    }

    public String getDescricao() {
        return "Raio: " + getRaio();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
