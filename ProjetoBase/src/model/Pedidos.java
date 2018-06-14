/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Renato
 */
public class Pedidos {
    private String descricao;
    private int quantidade;
    private double preco;
    private String numCampanha;

    public String getNumCampanha() {
        return numCampanha;
    }

    public void setNumCampanha(String numCampanha) {
        this.numCampanha = numCampanha;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
