
package padraoobserver;

import java.util.Observable;
import java.util.Observer;


public class Assinante implements Observer {
    private String nome;
    private int edicaoNovaRevista;
    private Observable revista;
    
    public Assinante(Revista revista) {
        this.revista = revista;
        revista.addObserver(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEdicaoNovaRevista() {
        return edicaoNovaRevista;
    }

    public void setEdicaoNovaRevista(int edicaoNovaRevista) {
        this.edicaoNovaRevista = edicaoNovaRevista;
    }

    public Observable getRevista() {
        return revista;
    }

    public void setRevista(Observable revista) {
        this.revista = revista;
    }
    

    @Override
    public void update(Observable revistaSubject, Object arg) {
        if(revistaSubject instanceof Revista){
            Revista revista = (Revista) revistaSubject;
            edicaoNovaRevista = revista.getEdicao();
            System.out.println("Atenção " + getNome() + ", já chegou mais uma edição de Revista. Esta é a edição de número: "
                    + edicaoNovaRevista);
        }
    }
    
}
