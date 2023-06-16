import java.util.ArrayList;
public class Comprimidos extends Medicamentos{

    private String tipo;
   public static ArrayList<Comprimidos> compriList=new ArrayList<>();


    public Comprimidos(String nome,String tipo, double preco, int estoque){
        super(nome, preco, estoque);
        this.tipo=tipo;
    }

        public String getTipo(){
        return this.tipo;
    }


     public void adicionar(Comprimidos m){
       compriList.add(m);
    }

    public  void visualizar(){
        int i=0;
        
        for(Comprimidos med: compriList){
            if(med.getEstoque()>0){
            System.out.println("\n"+i+1+"-Nome: "+med.getNome()+"  Tipo: "+med.getTipo()+ "  Preco: "+med.getPreco()+"MZN  Estoque: "+med.getEstoque());
            i++;
            }
        }
        if(i==0)
        System.out.println("\nNao ha Comprimidos no Momento!\n");
    }

     public void eliminar(int idx){

        if(--idx>compriList.size()){
            System.out.println("\nOpcao Invalida");
        }
        else{
        compriList.remove(idx);
        System.out.println("\nItem Removido da Lista");
        }
    }

    public void vender(String nome, int unidades){
        int contador=0;
            for(Comprimidos med: compriList){
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
