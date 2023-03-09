abstract class FiguraGeometrica {
    private String nome;

    abstract  double getArea();
    abstract  String getDescricao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}