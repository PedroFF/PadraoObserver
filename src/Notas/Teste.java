/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas;

/**
 *
 * @author ice
 */
public class Teste {
    public static void main(String[] args) {
        Turma turma1 = new Turma("ED 1");
        Turma turma2 = new Turma("ED 2");
        
        Aluno aluno = new Aluno(turma1);
        aluno.setNome("Mateus");
        
        Aluno aluno2 = new Aluno(turma1);
        aluno2.setNome("Jonas");
        
        Aluno aluno3 = new Aluno(turma1);
        aluno3.setNome("Gabriel");
        
        Aluno aluno4 = new Aluno(turma2);
        aluno4.setNome("Pedro");
        
        Aluno aluno5 = new Aluno(turma2);
        aluno5.setNome("Rian");
        
        Aluno aluno6 = new Aluno(turma2);
        aluno6.setNome("João");
        aluno6.adicionarTurma(turma1);        
        
        Aluno aluno7 = new Aluno(turma1);
        aluno7.setNome("Zeca");
        aluno7.adicionarTurma(turma2);        
        
        turma1.fechar();
        //turma2.fechar();
    }
}
