
package padraoobserver;


public class PadraoObserver {

    public static void main(String[] args) {
        int novaEdicao = 3;
        Revista revista = new Revista();
        Assinante assinante1 = new Assinante(revista);
        assinante1.setNome("Pedro");
        Assinante assinante2 = new Assinante(revista);
        assinante2.setNome("João");
        revista.setEdicao(novaEdicao);
    }
    
}
