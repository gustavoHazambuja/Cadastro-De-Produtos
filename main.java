import java.util.Scanner;

import Produto.CadastroProduto;

public class main {
    
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        int opcao;
        CadastroProduto cadastro = new CadastroProduto();

        do {
            System.out.println("Menu de opções:");
            System.out.println("(1) Cadastrar produto");
            System.out.println("(2) Listar por preço");
            System.out.println("(3) Pesquise se o produto está dispovível para venda");
            System.out.println("(4) Remover produto");
            System.out.println("(5) Quantidade de produtos");
            System.out.println("(6) Sair");

            opcao = dados.nextInt();
    
            switch (opcao) {
                case 1:
                    cadastro.cadastrarProdutos();
                    break;
                case 2:
                    cadastro.ordenacaoPorPreco();
                    break;   
                case 3:
                    cadastro.produtoEstaDisponivel();
                    break; 
                case 4:
                    cadastro.removerProduto();
                    break; 
                case 5:
                    System.out.println("Quantidade de produto(os): " + cadastro.quantidadeProdutos());
                    break; 
                case 6:
                    System.out.println("Saindo...");
                    break;              
                default:
                     System.out.println("Opção inválida!");  
                     break;    
    
            }
        } while(opcao != 6);
       
        


    }
}
