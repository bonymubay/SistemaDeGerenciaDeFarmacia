import java.util.Scanner;

public class Programa1 {
   
    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);

        int op; //variavel responsavel por controlar o menu principal
        
        //Instanciando a classe que trabalha com comprimidos
         Comprimidos comprimidos =new Comprimidos("","", 0.0, 0);

         //Instanciando a classe que trabalha com pomadas
         Pomada pomadas= new Pomada("",0.0,0);

         //Instanciando a classe que trabalha com xaropes
         Xarope xaropes= new Xarope("",0.0,0);

         //Instanciando a classe que trabalha com cosmeticos/produtos de higiene pessoal
         Cosmetico cosmeticos= new Cosmetico("",0.0,0);

         //Instanciando a classe pai/mae que sera de todas as classes
         Medicamentos medicamentos=new Medicamentos("", 0.0, 0);

            System.out.println("\n\n********BEM VINDO********\n");
        
       do {
                    //Menu Inicial
           
            System.out.println("\n\n[1]-comprimidos         [2]-Pomadas");
            System.out.println("[3]-Xaropes             [4]-Cosmeticos");
            System.out.println("[5]-Visualizar Todos Os Medicamentos");
            System.out.println("[0]-Sair");
            op= input.nextInt();


            //o codigo em baixo e pra trabalhar com a classe de comprimidos
            if(op==1){
                int p; //variavel local responsavel por contralar sub-menu dos comprimidos
                do{
                        //Sub-menu dos comprimidos

                        //Essa  parte do sub-menu sera mostrada quando a classe Comprimidos nao tiver comprimido no estoque
                    if(comprimidos.getNome().equals("")){
                        System.out.println("\n[1]-Adicionar comprimidos");
                        System.out.println("[0]-Voltar");
                        p= input.nextInt();
                    }
                    else{
                        //Essa  parte do sub-menu sera mostrada quando a classe Comprimidos  tiver pelo menos 1 comprimido no estoque
                        System.out.println("\n[1]-Adicionar comprimidos");
                        System.out.println("[2]-Ver Comprimidos Existentes");
                        System.out.println("[3]-Vender Comprimidos");
                        System.out.println("[4]-Remover Comprimidos");
                        System.out.println("[0]-Voltar");
                        p= input.nextInt();

                    }

             switch(p){
                    case 1: //adicinar comprimidos
                    System.out.println("\nNome: ");
                    String nome=input.next();
                    System.out.println("\nTipo: ");
                    String tipo=input.next();
                    System.out.println("\nPreco: ");
                    double preco=input.nextDouble();
                    System.out.println("\nEstoque: ");
                    int estoque=input.nextInt();
                    comprimidos =new Comprimidos(nome,tipo, preco, estoque);
                    comprimidos.adicionar(comprimidos);
                     break;

                    case 2:// visualizar comprimidos
                            comprimidos.visualizar(); //Funcao responsavel por nos mostrar comprimidos existentes
                            
                    break;

                    case 3:
                        //realizacao da venda
                        System.out.println("\nNome do Comprimido: ");
                        String nom= input.next();
                        System.out.println("\nUnidades do Comprimido: ");
                        int unidades= input.nextInt();
                        comprimidos.vender(nom,unidades); //funcao esponsavel pela venda

                        break;

                    case 4:
                        //Eleminacao dos comprimidos
                       //primeiro sao listados antes de serem apagados 
                        System.out.println("\nLista dos comprimidos que existem: \n");
                        comprimidos.visualizar();

                        //Eliminacao dos comprimidos
                        System.out.println("\nEscolha a Opcao dos comprimidos que deseja Eliminar: ");
                        int idx= input.nextInt();
                        comprimidos.eliminar(idx); //funcao responsavel por eleminar comprimidos

                    break;

                    default:
                        if(p!=0)
                        System.out.println("Escolha invalida");
                        break;
                 }
                }while(p!=0);
            }

                //o codigo em baixo e pra trabalhar com a classe de pomadas
            else if(op==2){
                int p;
                            do{
                            
                            if(pomadas.getNome().equals("")){
                                    System.out.println("\n[1]-Adicionar Pomada");
                                    System.out.println("[0]-Voltar");
                                    p= input.nextInt();
                            }
                            else{
                                    System.out.println("\n[1]-Adicionar Pomada");
                                    System.out.println("[2]-Ver Pomadas Existentes");
                                    System.out.println("[3]-Vender Pomadas");
                                    System.out.println("[4]-Remover Pomadas");
                                    System.out.println("[0]-Voltar");
                                    p= input.nextInt();
                                
                            }
                             switch(p){
                             case 1: //adicinar pomada
                                System.out.println("\nNome: ");
                                String nome=input.next();
                                System.out.println("\nPreco: ");
                                double preco=input.nextDouble();
                                System.out.println("\nEstoque: ");
                                int estoque=input.nextInt();
                                pomadas =new Pomada(nome, preco, estoque);
                                pomadas.adicionar(pomadas);

                                break;

                            case 2://  Exibir pomadas
                                pomadas.visualizar();
                                break;

                                case 3:
                                System.out.println("\nNome da Pomada: ");
                                String nom= input.next();
                                System.out.println("\nUnidades da Pomada: ");
                                int unidades= input.nextInt();
                                pomadas.vender(nom,unidades);

                                break;

                                case 4:
                                    //primeiro listar Pomadas

                                    System.out.println("\nLista dos Pomadas que existem: \n");
                                    pomadas.visualizar();

                                    //Eliminar pomadas
                                    System.out.println("\nEscolha a Opcao das Pomadas que deseja Eliminar: ");
                                    int idx= input.nextInt();
                                    pomadas.eliminar(idx);
                                            break;

                                default:
                                    if(p!=0)
                                    System.out.println("Escolha invalida");
                                    break;

                            }
                         }while(p!=0);


            }

            //o codigo em baixo e pra trabalhar com a classe de xaropes
           else if(op==3){ 
                
                             int p;
                do{
                    if(xaropes.getNome().equals("")){
                        System.out.println("\n[1]-Adicionar Xaropes");
                        System.out.println("[0]-Voltar");
                        p= input.nextInt();
                    }
                    else{
                        System.out.println("\n[1]-Adicionar Xaropes");
                        System.out.println("[2]-Ver Xaropes Existentes");
                        System.out.println("[3]-Vender Xaropes");
                        System.out.println("[4]-Remover Xaropes");
                        System.out.println("[0]-Voltar");
                        p= input.nextInt();
                    }
             switch(p){
                    case 1: //adicinar Xaropes
                    System.out.println("\nNome: ");
                    String nome=input.next();
                    System.out.println("\nPreco: ");
                    double preco=input.nextDouble();
                    System.out.println("\nEstoque: ");
                    int estoque=input.nextInt();
                    xaropes =new Xarope(nome, preco, estoque);
                    xaropes.adicionar(xaropes);

                    break;

                    case 2:// visualizar xaropes
                    xaropes.visualizar();
                    break;

                    case 3:
                        System.out.println("\nNome do Xarope: ");
                        String nom= input.next();
                        System.out.println("\nUnidades do Xarope: ");
                        int unidades= input.nextInt();
                        xaropes.vender(nom,unidades);

                        break;

                    case 4:
                        //primeiro listar Xaropes
                        xaropes.visualizar();
                                    
                            //Eliminar xaropes
                            System.out.println("\nEscolha a Opcao do Xarope que deseja Eliminar: ");
                                int idx= input.nextInt();
                                 pomadas.eliminar(idx);
                         break;


                    default:
                        if(p!=0)
                        System.out.println("Escolha invalida");
                        break;
                 }
                }while(p!=0);
            
           } 

                //o codigo em baixo e pra trabalhar com a classe de cosmeticos
           else if(op==4){

                        int p;
                do{
                    if(cosmeticos.getNome().equals("")){
                        System.out.println("\n[1]-Adicionar Cosmeticos");
                        System.out.println("[0]-Voltar");
                        p= input.nextInt();
                    }
                    else{
                        System.out.println("\n[1]-Adicionar Cosmeticoss");
                        System.out.println("[2]-Ver Cosmeticoss Existentes");
                        System.out.println("[3]-Vender Cosmeticos");
                        System.out.println("[4]-Remover Cosmeticos");
                        System.out.println("[0]-Voltar");
                        p= input.nextInt();

                    }

             switch(p){
                    case 1: //adicinar cometicos
                    System.out.println("\nNome: ");
                    String nome=input.next();
                    System.out.println("\nPreco: ");
                    double preco=input.nextDouble();
                    System.out.println("\nEstoque: ");
                    int estoque=input.nextInt();
                    cosmeticos =new Cosmetico(nome, preco, estoque);
                    cosmeticos.adicionar(cosmeticos);
                     break;

                    case 2:// visualizar Cosmeticos
                            cosmeticos.visualizar();
                    break;

                    case 3:
                        System.out.println("\nNome do Cosmetico: ");
                        String nom= input.next();
                        System.out.println("\nUnidades do Cosmetico: ");
                        int unidades= input.nextInt();
                        cosmeticos.vender(nom,unidades);

                        break;

                    case 4:
                     //primeiro listar Cosmeticos
                        System.out.println("\nLista dos Cosmeticos que Existem: \n");
                        cosmeticos.visualizar();

                        //Eliminar comprimidos
                        System.out.println("\nEscolha a Opcao dos Cosmeticos que deseja Eliminar: ");
                        int idx= input.nextInt();
                        cosmeticos.eliminar(idx);

                    break;

                    default:
                        if(p!=0)
                        System.out.println("Escolha invalida");
                        break;
                 }
                }while(p!=0);

           }

            else if(op==5){
                medicamentos.visualizarItens(comprimidos, pomadas, xaropes, cosmeticos);
            }


            else
            System.out.println("Escolha Invalida");

       } while(op!=0);

       System.out.println("\n\n    OBRIGADO PELA PREFERENCIA    ");
    } 
}

        