package Produto;

public class Produto implements Comparable<Produto> {
    
    private String nome;
    private String descricao;
    private double preco;

    public Produto(String nome, String descricao, double preco){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int compareTo(Produto o){
        return Double.compare(preco, o.preco);
    }

    @Override
    public String toString(){
        return String.format("\nNome: %s " + "\nDescriçaõ: %s" + "\nPreço: %.2f\n", nome,descricao,preco);
    }
}
