 public class Medicamentos{

    private String nome;
    private double preco;
    private int estoque;

   
        public Medicamentos(String nome, double preco, int estoque){
        this.nome=nome;
        this.preco=preco;
        this.estoque=estoque;
       }



       public void visualizarItens(Comprimidos comp, Pomada pom, Xarope xaro, Cosmetico cosm){
                    int i=0;
                    int contador=0;

                    System.out.println("\n\nIntens Existentes no Sistema: ");
                    for( Comprimidos med : Comprimidos.compriList){
                        if(Comprimidos.compriList.isEmpty()){}
                        else{
                            if(contador==0){
                        System.out.println("\n\nComprimidos: ");
                            contador++;
                           
                            }
                        
                        System.out.println("\n"+(i+1)+"- Nome: "+med.getNome()+"  Tipo: "+med.getTipo()+ "  Preco: "+med.getPreco()+"MZN  Estoque: "+med.getEstoque());
                        i++;
                        }
                    }

                    contador=0;

                    for( Pomada med : Pomada.pomList){
                         if(Pomada.pomList.isEmpty()){}
                        else{
                            if(contador==0){
                        System.out.println("\n\nPomadas: ");
                          contador++;
                            
                            }
                        System.out.println("\n"+(i+1)+"- Nome: "+med.getNome()+"  Preco: "+med.getPreco()+"MZN  Estoque: "+med.getEstoque());
                        i++;
                         }
                    }

                    contador=0;

                    for( Xarope med : Xarope.xaroList){
                         if(Xarope.xaroList.isEmpty()){}
                        else{
                           
                            if(contador==0){
                        System.out.println("\n\nXaropes: ");
                             contador++;
                            
                            }
                    
                        System.out.println("\n"+(i+1)+"- Nome: "+med.getNome()+"  Preco: "+med.getPreco()+"MZN  Estoque: "+med.getEstoque());
                        i++;
                         }
                    }

                    contador=0;

                    for( Cosmetico med : Cosmetico.cosmList){
                         if(Cosmetico.cosmList.isEmpty()){}
                        else{
                            
                            if(contador==0){
                        System.out.println("\n\nCosmeticos: ");
                                contador++;
                            
                            }
                    
                        System.out.println("\n"+(i+1)+"- Nome: "+med.getNome()+"  Preco: "+med.getPreco()+"MZN  Estoque: "+med.getEstoque());
                        i++;
                        }
                    }

                         if(i==0)
                            System.out.println("\nNenhum Item Foi Encontrado!\n\n");
       }


    public double getPreco(){
        return this.preco;
    }
    public int getEstoque(){
        return this.estoque;
    }

    public int  setEstoque(int estoque){
        this.estoque=estoque;
            return this.estoque;
    }

    public String getNome(){
        return this.nome;
    }

}