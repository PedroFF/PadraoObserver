package Notas;

import java.util.Observable;


public class Turma extends Observable {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma(String nome) {
        this.nome = nome;
    }
    
    public void fechar(){
        setChanged();
        notifyObservers();
    }
}
