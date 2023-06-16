import java.util.ArrayList;
public class Pomada extends Medicamentos{

   public static ArrayList<Pomada> pomList=new ArrayList<>();

       public Pomada(String nome, double preco, int estoque){
        super(nome, preco, estoque);
    }

      public void adicionar(Pomada m){
       pomList.add(m);
    }

    public  void visualizar(){
        int i=0;
        for(Pomada med: pomList){
            System.out.println("\n"+i+1+"-Nome: "+med.getNome()+ "  Preco: "+med.getPreco()+"MZN  Estoque: "+med.getEstoque());
            i++;
        }

          if(i==0)
        System.out.println("\nNao ha Pomadas no Momento!\n");
    }

     public void eliminar(int idx){
        if(--idx>pomList.size()){
            System.out.println("\nOpcao Invalida");
        }
        else{
        pomList.remove(idx);
        System.out.println("\nRemovido da Lista Com Sucesso");
        }
    }

     public void vender(String nome, int unidades){
        int contador=0;
            for(Pomada med: pomList){
                if(med.getNome().equals(nome)){
                    contador++;
                    int estoqActual = med.getEstoque();
                    if(estoqActual>=unidades){
                    med.setEstoque(estoqActual-unidades);

                        System.out.println("\nVendido Com Sucesso! \nValor a pagar: "+med.getPreco()*unidades+"MZN");
                    }
                    else{
                        System.out.println("\nQuantidade nao Disponivel");
                    }      
                }   
            }
                if(contador==0)
             System.out.println("\nComprimido nao Encontrada no Sistema!");
    }
}