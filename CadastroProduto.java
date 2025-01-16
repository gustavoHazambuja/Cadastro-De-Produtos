package Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CadastroProduto {
    Scanner dados = new Scanner(System.in);
    
    private ArrayList<Produto> produtos;

    public CadastroProduto(){
        this.produtos = new ArrayList<Produto>();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void cadastrarProdutos(){

        try {
            System.out.println("Informe o nome do produto:");
            String nome = dados.nextLine();

            if(nome.isEmpty() || nome.matches("\\d+")){
                throw new IllegalArgumentException("O nome do produto deve conter letras e não pode ser vazio ou apenas números.");
            }

            System.out.println("Informe a descrição do produto:");
            String descricao = dados.nextLine();

            if(descricao.isEmpty() || descricao.matches("\\d+")){
                throw new IllegalArgumentException("A descrição do produto deve conter letras e não pode ser vazio ou apenas números.");
            }

            System.out.println("Informe o preço do produto:");
            double preco = dados.nextDouble();

            dados.nextLine();

            Produto p = new Produto(nome, descricao, preco);
            produtos.add(p);

            System.out.println("Produto cadastrado com sucesso!");
            listarProdutos();

        } catch (NumberFormatException e){
            System.out.println("Erro: O preço deve ser um número válido.");
        }catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch(Exception e){
            System.out.println("Erro ao cadastrar o pruduto. Verifique os campos e tente novamente.");
        }

    }

    public void listarProdutos(){
        if(produtos.isEmpty()){
            System.out.println("Nenhum produto cadastrado.");
        }
        else{
            for(Produto p: produtos){
                System.out.println(p);
            }
        }
    }

    public boolean produtoEstaDisponivel(){

        System.out.println("Informe o nome do produto");
        String nome = dados.nextLine().toLowerCase();

        for(Produto p: produtos){
            if(p.getNome().toLowerCase().contains(nome)){
                System.out.println("Produto disponível" + p);
                return true;
            }
        }
        System.out.println("Produto não disponível.");
        return false;
    }


    public boolean removerProduto(){

        System.out.println("Informe o nome do produto que deseja remover:");
        String nome = dados.nextLine().toLowerCase();

       for(Produto p: produtos){
        if(p.getNome().toLowerCase().contains(nome)){
            System.out.println("Produto removido " + p);
            produtos.remove(p);
            return true;
        } 
    }
    System.out.println("Produto não encontrado.");
    return false;
  }

  public void ordenacaoPorPreco(){
    if(produtos.isEmpty()){
        System.out.println("Nenhum produto cadastrado.");
    }
    else{
        Collections.sort(produtos);
        System.out.println("Produtos ordenados por preço: ");
        for(Produto p: produtos){
            System.out.println(p);
        }
    }
  }

  public int quantidadeProdutos(){
    if(produtos.isEmpty()){
        System.out.println("Nenhum produto cadastrado");
    }
        return (int) produtos.stream()
        .count();
    
   
  }

}
