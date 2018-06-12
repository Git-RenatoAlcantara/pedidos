/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import model.Pedidos;

/**
 *
 * @author Renato
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pedidos pedidos = new Pedidos();
        GerarPDF gerarPDF = new GerarPDF();
        
        pedidos.setDescricao("Desodorante Roll-on");
        pedidos.setQuantidade(10);
        pedidos.setPreco(10.50);
        gerarPDF.createPdf(pedidos);
    }
    
}
