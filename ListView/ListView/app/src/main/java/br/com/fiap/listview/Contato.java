package br.com.fiap.listview;

/**
 * Created by logonrm on 03/04/2018.
 */

public class Contato {
    private String nome;
    private String sobre;
    private int imagem;
    private int contato;


    //Construtores
    //alt + insert = cria os construtores e o get & set
    public Contato() {
    }

    public Contato(String nome, String sobre, int imagem, int contato) {
        this.nome = nome;
        this.sobre = sobre;
        this.imagem = imagem;
        this.contato = contato;
    }


    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }
}
