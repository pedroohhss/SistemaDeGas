/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class ProdutoDAO extends ConexaoDB {
    
    public ProdutoDAO() {
        conectar();
    }
    
    //INSERIR
    public void inserirDados(Produto item) {
        try {
            PreparedStatement estado;
            String sqlInsert = "INSERT INTO produto (nome,preco,valorCompra) VALUES (?,?,?)";
            estado = conexao.prepareStatement(sqlInsert);
            
            estado.setString(1, item.getNome());
            estado.setDouble(2, item.getPreco());
            estado.setDouble(3, item.getValorCompra());
            estado.executeUpdate();
            estado.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }  
    }
    
    //UPDATE
    
    //DELETE
    public void deletar(Produto item) {
        try {
            PreparedStatement estado;
            String sqlDelete = "DELETE FROM produto WHERE nome=?";
            estado = conexao.prepareStatement(sqlDelete);
            estado.setString(1, item.getNome());
            estado.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
