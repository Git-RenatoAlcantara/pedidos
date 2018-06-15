/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Renato
 */
public class Conectar
{
    
    private Connection connection;
    
    public boolean conexao(){
        try {
            String url = "jdbc:sqlite:banco_de_dados/banco_sqlite.db";
            this.connection = DriverManager.getConnection(url);
            System.out.println("CONECTADO COM SUCESSO! ");
            
        } catch (Exception ex) {
            System.err.println("ERRO AO CRIA BANCO: "+ex.getMessage());
            return false;
        }
        return true;
    }
     public boolean desconectar(){
         try {
             if (this.connection.isClosed() == false) {
                 connection.close();
                 System.out.println("DESCONECTADO");
             }
         } catch (Exception ex) {
             System.err.println("ERRO AO DESCONECTAR: "+ex.getMessage());
             return false;
         }
           return true;
        }
           //Criar statements para o sql ser executado
     public Statement criarStatement(){
         try {
             return this.connection.createStatement();
         } catch (SQLException ex) {
             return null;
         }
     }
     public Connection getConexao(){
         return this.connection;
     }

}
