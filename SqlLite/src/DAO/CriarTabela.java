/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Renato
 */
public class CriarTabela {
    private final Conectar conexao;
    
    public CriarTabela(Conectar conexao){
        this.conexao = conexao;
    }
    public void criarTabelaPedidos(){
        String sql = "CREATE TABLE IF NOT EXISTS tb_peddios("
                + "id integer PRIMARY KEY,"
                + "nome text NOT NULL,"
                + "idade integer"
                + ");";
        //Executando sql de criar tabela
        boolean conectou = false;
        try {
           conectou =  this.conexao.conexao();
            Statement stmt = this.conexao.criarStatement();
            stmt.execute(sql);
            System.out.println("TABELA CRIADA COM SUCESSO!");
            
        } catch (SQLException ex) {
            System.err.println("ERRO AO CRIAR TABEL: "+ex);
        }finally{
            if (conectou) {
                this.conexao.desconectar();
            }
        }
    }
    
    
    
}
