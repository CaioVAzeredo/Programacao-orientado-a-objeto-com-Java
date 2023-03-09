package Aula2.Exemplo2;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    
    

    public double getMedia() {
        return (getNota1() + getNota2()) / 2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota2() {
        return nota2;
    }
    
}
