package Aula2.ATIVIDADES.Atividade3;

import java.util.ArrayList;
import ATIVIDADES_ARRAY.leitor;


public class Turma {
    public static void main(String[] args) {

        ArrayList<String> Aluno = new ArrayList();
        ArrayList<Double> Nota = new ArrayList();

        char condicao;
        do {
            condicao = leitor.lerCaracter("Adicionar aluno? (s/n)");
            if (condicao == 's') {
                Aluno.add(leitor.criarAluno());
                Nota.add(leitor.criarNota());

            } else {
                break;
            }

        } while (true);
        String media = leitor.Media2(Nota, Aluno);

        
        System.out.println(media);
        

        
        
        

    }

}
