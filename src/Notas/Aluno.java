package Notas;

import java.util.Observable;
import java.util.Observer;


public class Aluno  implements Observer {
    private String nome;

    public Aluno(Turma turma) {
        turma.addObserver(this);
    }
    
    public void adicionarTurma(Turma turma){
        turma.addObserver(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Observable turmaSubject, Object arg) {
        if(turmaSubject instanceof Turma){
            Turma turma = (Turma) turmaSubject;
            System.out.println("Olá "+getNome()+", sua nota na turma " +turma.getNome() + " foi lançada");
        }
    }
    
}
