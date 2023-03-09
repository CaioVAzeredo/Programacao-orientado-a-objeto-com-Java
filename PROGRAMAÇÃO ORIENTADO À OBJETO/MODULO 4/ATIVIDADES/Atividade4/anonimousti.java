package Atividade4;

import java.util.ArrayList;

public class anonimousti {
private ArrayList<Pessoa> Pessoa;

public anonimousti(){
    setPessoa(new ArrayList<Pessoa>());
}

public void adicionar(Pessoa p){
    getPessoa().add(p);
}

public ArrayList<Pessoa> getPessoa() {
    return Pessoa;
}

public void setPessoa(ArrayList<Pessoa> pessoa) {
    Pessoa = pessoa;
}

public ArrayList<Atividade4.Pessoa> imprimir(a) {
    for (Pessoa pe : p) {
        System.out.println("Nome: " + a.getNome());
    }
}
}
