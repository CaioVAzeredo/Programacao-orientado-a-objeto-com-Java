package EXEMPLOS;
public class exemplo5 {
    public static void main(String[] args) {
        Sexo sx = Sexo.MASCULINO;
        System.out.println(sx.name());
        System.out.println(sx.ordinal());
        System.out.println(sx.valor);   
      }   
    }
    enum Sexo{
      MASCULINO(1), //o argumento passado é atribuido a valor
      FEMININO(2); // o ponto e vírgula finaliza a declaração.
      public int valor; //atributo do enum sexo
      private Sexo (int valor){//construtor private do enum Sexo
        this.valor = valor;//atribuição do valor
      }
}
