import estruturaDeDados.NovaLista;
package estruturaDeDados;

public class ListaLigada implements NovaLista{
    private No cabeca;
    
    public ListaLigada(){
        this.cabeca = null;
    }

    @Override
    public int buscaIndice(int valor){
        No atual = this.cabeca;
        int indice = 0;
        while (atual != null){
            if (atual.getValor() == valor){
                return indice;
            }
            atual = atual.getProximo();
            indice++;
        }
        return -1;
    }

    @Override
    public int insereElementoPosicao(int valor, int buscaIndidce){
        No novo = new No(valor);
        No atual = this.cabeca;
        No anterior = null;
        int indice = 0;
        while (atual != null && indice < buscaIndidce){
            anterior = atual;
            atual = atual.getProximo();
            indice++;
        }
        if (anterior == null){
            novo.setProximo(this.cabeca);
            this.cabeca = novo;
        }
        else{
            novo.setProximo(atual);
            anterior.setProximo(novo);
        }
        return 0;
    }

    @Override
    pulic void insereInicio(int valor){
        if (this.cabeca == null){
            this.cabeca = new No(valor);
        } else {
            No n = new No(valor);
            n.setProximo(this.cabeca);
            this.cabeca = n;
        }
    }

    @Override
    public void InsereFim (int valor){
        No novo = new No(valor);
        if (this.cabeca == null){
            this.cabeca = novo;
        } else {
            No atual = this.cabeca;
            while (atual.getProximo() != null){
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
    
    }

    @Override
    public int removeInicio(){
        if (this.cabeca == null){
            return -1;
        }
        this.cabeca = this.cabeca.getProximo();
        return 0;
    }
    @Override
    public int removeFim(){
        if (this.cabeca == null){
            return -1;
        }
        if (this.cabeca.getProximo() == null){
            this.cabeca = null;
            return 0;
        }
        No atual = this.cabeca;
        No anterior = null;
        while (atual.getProximo() != null){
            anterior = atual;
            atual = atual.getProximo();
        }
        anterior.setProximo(null);
        return 0;
    } 

    @Override
    public int removeIndice(int buscaIndice){
        No atual = this.cabeca;
        No anterior = null;
        int indice = 0;
        while (atual != null && indice < buscaIndice){
            anterior = atual;
            atual = atual.getProximo();
            indice++;
        }
        if (atual == null){
            return -1;
        }
        if (anterior == null){
            this.cabeca = atual.getProximo();
        } else {
            anterior.setProximo(atual.getProximo());
        }
        return 0;
    }
}