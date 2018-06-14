/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Renato
 */
public class TratarValor {
    private String valor;
    
    public TratarValor(String valor) {
     this.valor = valor;
    }

    public String getValor() {
        String result = this.valor.replace(",", ".");
       this.valor =  result;
        return this.valor;
    }

 
    
    
}
