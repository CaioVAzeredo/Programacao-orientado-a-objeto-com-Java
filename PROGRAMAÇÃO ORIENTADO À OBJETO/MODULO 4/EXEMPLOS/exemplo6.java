package EXEMPLOS;
public class exemplo6 {
    public static void main(String[] args) {
        Turno [] turnos = Turno.values();
        for (Turno trn : turnos) {
          System.out.println("Descrição: "+trn.name());
          System.out.println("Descrição: "+trn.ordinal());
        }
      }
    }
    enum Turno{
      MATUTINO, VESPERTINO, NOTURNO
    }	

