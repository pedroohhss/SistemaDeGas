package model;

import java.sql.*;
import controller.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author pedro
 */
public class ClienteDAO extends ConexaoDB{

    public ClienteDAO(){
        conectar();
    }
    
    //CREATE
    public void inserirDados(Cliente item){
        try {
            PreparedStatement estado;
            String sqlInsert = "INSERT INTO cliente (nome,endereco,telefone,cpf) VALUES (?,?,?,?)";
            estado = conexao.prepareStatement(sqlInsert);
            
            estado.setString(1, item.getNome());
            estado.setString(2, item.getEndereco());
            estado.setString(3, item.getTelefone());
            estado.setString(4, item.getCpf());
            estado.executeUpdate();
            estado.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }  
    }
    //UPDATE
    
    //DELETE
    public void deletar(Cliente item) {
        try {
            PreparedStatement estado;
            String sqlDelete = "DELETE FROM cliente WHERE nome=?";
            estado = conexao.prepareStatement(sqlDelete);
            estado.setString(1, item.getNome());
            estado.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
