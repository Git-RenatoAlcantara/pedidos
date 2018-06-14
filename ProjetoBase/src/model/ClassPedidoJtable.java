/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Renato
 */
public class ClassPedidoJtable extends AbstractTableModel {
    private ArrayList<Pedidos> dados = new ArrayList<>();
    private String colunas[] = {"DESCRIÇÃO","QUANTIDADE","PREÇO"};

        
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }

    
    
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public boolean isCellEditable(int linha, int coluna) {
        return true;
    }
    
    @Override
    public void setValueAt(Object valor, int linha, int coluna){
        if( valor == null) return;
         
        switch(coluna){
            case 0:  dados.get(linha).setDescricao((String) valor);break;
            case 1:  dados.get(linha).setQuantidade(Integer.parseInt((String) valor));break;
            case 2:  dados.get(linha).setPreco(Double.parseDouble((String) valor));break;
        } 
        this.fireTableRowsUpdated(linha, linha);
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return dados.get(linha).getDescricao();
            case 1:
                return dados.get(linha).getQuantidade();
            case 2:
                return dados.get(linha).getPreco();
            
        }
        return null;
    
    }
    
    public void addRow(Pedidos p){
        this.dados.add(p);
        this.fireTableDataChanged();
        
    }
   
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
}
