/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.Funcionario;
import controller.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class FuncionarioDAO extends ConexaoDB{
    
    public FuncionarioDAO() {
        conectar();
    }
    
    //CREATE
    public void inserirDados(Funcionario item) {
        try {
            PreparedStatement estado;
            String sqlInsert = "INSERT INTO funcionario (nome,endereco,cargo,telefone,cpf) VALUES (?,?,?,?,?)";
            estado = conexao.prepareStatement(sqlInsert);
            
            estado.setString(1, item.getNome());
            estado.setString(2, item.getEndereco());
            estado.setString(3, item.getCargo());
            estado.setString(4, item.getTelefone());
            estado.setString(5, item.getCpf());
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
            String sqlDelete = "DELETE FROM funcionario WHERE nome=?";
            estado = conexao.prepareStatement(sqlDelete);
            estado.setString(1, item.getNome());
            estado.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
