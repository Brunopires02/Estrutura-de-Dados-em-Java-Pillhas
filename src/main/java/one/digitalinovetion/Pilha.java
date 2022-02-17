package one.digitalinovetion;

public class Pilha {

    private No refNoentradaPilha;

    public Pilha() {
        this.refNoentradaPilha = null;
    }
    public void push(No novoNo){
        No refAuxiliar = refNoentradaPilha;
        refNoentradaPilha = novoNo;
        refNoentradaPilha.setRefNo(refAuxiliar);
    }
    public No pop(){
        if (!isEmpty()){
            No noPoped = refNoentradaPilha;
            refNoentradaPilha = refNoentradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public  No top(){
        return refNoentradaPilha =null;
    }

    public  boolean isEmpty(){
        return refNoentradaPilha == null;
    }

    @Override
    public String toString(){

        String stringRetorno = "-----------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += "-----------\n";

        No noAuxiliar = refNoentradaPilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += " [No{dado=" + noAuxiliar.getDado() +  " }] \n " ;
                noAuxiliar = noAuxiliar.getRefNo();
            }else {
                break;
            }
        }
        stringRetorno += "==========\n";

        return stringRetorno;
    }
}
