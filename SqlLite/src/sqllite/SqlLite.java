/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqllite;

import DAO.Conectar;
import DAO.CriarTabela;

/**
 *
 * @author Renato
 */
public class SqlLite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conectar conectar = new Conectar();
        CriarTabela criarTabela = new CriarTabela(conectar);
        criarTabela.criarTabelaPedidos();
        conectar.desconectar();
    }
    
}
