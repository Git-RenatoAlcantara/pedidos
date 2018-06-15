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
     private final Conexao conexao;
    
    public CriarTabela(Conexao conexao){
        this.conexao = conexao;
    }
    public void criarTabelaPedidos(String tabela){
        System.out.println(tabela);
        String sql = "CREATE TABLE IF NOT EXISTS "+tabela+
                "(id integer PRIMARY KEY,"
                + "nome text NOT NULL,"
                + "idade integer"
                + ");";
        //Executando sql de criar tabelas
        boolean conectou = false;
        try {
           conectou =  this.conexao.conectar();
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
