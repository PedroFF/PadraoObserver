
package padraoobserver;

import java.util.Observable;

class Revista extends Observable {
    private int edicao;

    public int getEdicao() {
        return this.edicao;
    }

    public void setEdicao(int novaEdicao) {
        this.edicao = novaEdicao;
        setChanged();
        notifyObservers();
    }
    
    
    
}
