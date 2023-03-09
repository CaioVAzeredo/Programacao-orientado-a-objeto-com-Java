package EXEMPLOS.Exemplo3;

public class pessoa {
    private String nome;

    public pessoa(String nome) {
        setNome(nome);
        
    }

    public double getImpostoEspesical() {
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome: " + getNome() + "\tImposto: " + getImpostoEspesical();
    }
}
