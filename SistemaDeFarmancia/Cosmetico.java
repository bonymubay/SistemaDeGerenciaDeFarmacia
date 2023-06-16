import java.util.ArrayList;
class Cosmetico extends Medicamentos{

    public static ArrayList<Cosmetico> cosmList=new ArrayList<>();

    public Cosmetico(String nome, double preco, int estoque){
        super(nome, preco, estoque);
    }

    public void adicionar(Cosmetico m){
       cosmList.add(m);
    }

    public  void visualizar(){
        int i=0;
        
        for(Cosmetico med: cosmList){
            if(med.getEstoque()>0){
            System.out.println("\n"+i+1+"-Nome: "+med.getNome()+"  Preco: "+med.getPreco()+"MZN  Estoque: "+med.getEstoque());
            i++;
            }
        }
        if(i==0)
        System.out.println("\nNao ha Cosmeticos no Momento!\n");
    }

     public void eliminar(int idx){

        if(--idx>cosmList.size()){
            System.out.println("\nOpcao Invalida");
        }
        else{
        cosmList.remove(idx);
        System.out.println("\nItem Removido da Lista");
        }
    }

    public void vender(String nome, int unidades){
        int contador=0;
            for(Cosmetico med: cosmList){
                if(med.getNome().equals(nome)){
                    contador++;
                    int estoqActual = med.getEstoque();
                    if(estoqActual>=unidades){
                    med.setEstoque(estoqActual-unidades);

                        System.out.println("\nVendido Com Sucesso! \nValor a pagar: "+med.getPreco()*unidades+"MZN\n");
                    }
                    else{
                        System.out.println("\nQuantidade nao Disponivel");
                    }
                    
                }
    
            }
                 if(contador==0)
             System.out.println("\nComprimido nao Encontrado no Sistema!");
    }
}