/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import model.Pedidos;

/**
 *
 * @author Renato
 */
public class GerarPDF {
    public void createPdf(Pedidos pedidos){
        Document doc = new Document();
        ArrayList<Pedidos> listaPedidos = new ArrayList<>();
        String arquivoPDF = "relatorioPDF";
        
        pedidos.getDescricao();
        pedidos.getQuantidade();
        pedidos.getPreco();
        listaPedidos.add(pedidos);
    
          try {
            //Criando o arquivo pdf com o nome contido na variavel arquivoPDF.
            PdfWriter.getInstance(doc, new FileOutputStream(arquivoPDF));
            
            //Abrindo arquivo pdf já craido.
            doc.open();
            
            //Criando prieiro paragrafo com a descrição do arquivo.
            Paragraph paragrafo = new Paragraph("RELATORIO PDF TESTE");
            
            //Alinhando o primeiro paragro ao centro da tela.
            paragrafo.setAlignment(1);
            
            //adicionando o paragrafo ao doc que o pdf aberto.
            doc.add(paragrafo);
            
            //Criando paragrafo vazio.
            paragrafo = new Paragraph("  ");
            doc.add(paragrafo);
            
            // Instanciando tabela.
            PdfPTable pdfTable = new PdfPTable(3);
            
            
            PdfPCell celula1 = new PdfPCell(new Paragraph("DESCRIÇÃO"));
            PdfPCell celula2 = new PdfPCell(new Paragraph("QUANTIDADE"));
            PdfPCell celula3 = new PdfPCell(new Paragraph("PREÇO"));
            
            //Adicionando as celulas criadas a tabela
            pdfTable.addCell(celula1);
            pdfTable.addCell(celula2);
            pdfTable.addCell(celula3);
            
            for(Pedidos p: listaPedidos){
                 celula1 = new PdfPCell(new Paragraph(p.getDescricao()));
                 celula2 = new PdfPCell(new Paragraph(p.getQuantidade()+""));
                 celula3 = new PdfPCell(new Paragraph(p.getPreco()+""));
                 
                //Adicionando as celulas criadas a tabela
                pdfTable.addCell(celula1);
                pdfTable.addCell(celula2);
                pdfTable.addCell(celula3);
            }
            doc.add(pdfTable);
            doc.close();
            Desktop.getDesktop().open(new File(arquivoPDF));
            
        } catch (Exception ex) {
              System.err.println("ERRO AO SALVAR O PDF"+ex.getMessage());
        }
 
    
    }
    
}
