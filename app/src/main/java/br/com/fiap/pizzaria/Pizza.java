package br.com.fiap.pizzaria;

/**
 * Created by gabrielagv on 20/05/2018.
 */

public class Pizza {
    private String sabor;
    private String preco;
    private String ingredientes;
    private int imagem;

    public Pizza() {
    }

    public Pizza(String sabor, String preco, String ingredientes, int imagem) {
        this.sabor = sabor;
        this.preco = preco;
        this.ingredientes = ingredientes;
        this.imagem = imagem;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
