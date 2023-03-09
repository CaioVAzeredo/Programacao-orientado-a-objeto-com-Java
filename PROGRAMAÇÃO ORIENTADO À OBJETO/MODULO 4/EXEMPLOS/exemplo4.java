package EXEMPLOS;
public class exemplo4 {
    public static void main(String[] args) {
        
              Sexo sx0 = Sexo.MASCULINO;
              System.out.println(sx0.name());
              System.out.println(sx0.ordinal());

              Sexo sx1 = Sexo.FEMININO;
              System.out.println(sx1.name());
              System.out.println(sx1.ordinal());
            }
          }
          enum Sexo {
            MASCULINO, FEMININO //enum sexo tem duas instâncias constantes.
          }
