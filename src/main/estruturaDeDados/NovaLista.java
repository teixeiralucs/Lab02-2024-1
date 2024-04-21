import estruturaDeDados.Lista;

public class NovaLista implements Lista{
    public int[] array;
    public int indice_fim;

    public NovaLista(){

    }

    @Override
    public int buscaIndice(int valor){
        if (this.array != null){
            for (int i = 0; i< this.array.length; i++){
                if (this.array[i] == valor){
                    return valor;
                }
            }
        }
        return -1;
    }
    @Override
    public void insereElementoPosicao(int valor, int buscaIndice ){
        if (this.array != null){
            int[] n =new int[this.array.length +1];
            for (int i = 0; i < buscaIndice; i++){
                n[i] = this.array[i];
            }
            this.array = n;
        }
    }

    @Override
    public void insereInicio(int valor){
        if (this.array != null){
            int[] n = new int[this.array.length +1];
            n[0] = valor;
            for (int i = 1; i <n.length;i++){
                n[i]= this.array[i-1];
            }
            this.array=n;
        
        }
        else {
            this.array = new int[1];
            this.array[0] = valor;
        }
    }
    @Override
    public void insereFim(int valor){
        int[] n = this.array;
        if(n != null){
            this.array = new int[array.length +1];
            for (int i = 0; i <array.length -1;i++){
                this.array[i] = n[i];
            }
            this.array[array.length-1] = valor;
        }
        else{
            this.array = new int[1];
            this.array[1] = valor;
        }
    }
    @Override
    public void removeInicio(){
        if (this.array != null){
            this.indice_fim = this.array.length-1;
            int[] n = new int[indice_fim];
            if (this.array.length != 1){
                for (int i =1; i<indice_fim;i++){
                    n[i-1]=this.array[i];
                }
            this.array = n;
            }
            else{
                this.array[0]=0;
            }
            }
    }
    @Override
    public void removeIndice(int indice){
        if(this.array != null){
            if(indice==0){
                removeInicio();
            }
            else {
                int outro = -1;
            }
            if (this.array.length >= indice){
                int outro = indice;
            }
            int outro;
            if (outro != -1){
                for (int i = outro; i<this.array.length-1;i++){
                    this.array[i] = this.array[i+1];
                }
            this.array[this.array.length-1]=0;
            }
        }
    }
        @Override
        public void removeFim(){
            if(this.array != null){
                this.indice_fim = this.array.length-1;
                int[] n = new int[indice_fim];
                for (int i = 0; i < indice_fim; i++){
                    n[i] = this.array[i];
                }
                this.array = n;
            }
        }
    
    
}