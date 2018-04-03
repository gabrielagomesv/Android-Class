package br.com.fiap.pesistenciasqlite;

/**
 * Created by logonrm on 03/04/2018.
 */

class Contato {
    private int id;
    private String nome;

    public Contato(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Contato() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Override no toString
    public String toString(){
        return this.nome;
    }
}
