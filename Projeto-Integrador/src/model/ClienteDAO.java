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
            String sqlInsert = "INSERT INTO cliente (nome,endereco,telefone) VALUES (?,?,?)";
            estado = conexao.prepareStatement(sqlInsert);
            
            estado.setString(1, item.getNome());
            estado.setString(2, item.getEndereco());
            estado.setString(3, item.getTelefone());
            if(item.getNome() != null && item.getEndereco() != null && item.getTelefone() != null) {
                estado.executeUpdate();  
            } else {
                JOptionPane.showMessageDialog(null, "Insira todos os dados!");
            }             
        } catch (SQLException erroInsert) {
            try {
                PreparedStatement estado;
                String sqlUpdate = "UPDATE cliente SET nome=? endereco=? telefone=? WHERE id=?";
                estado = conexao.prepareStatement(sqlUpdate);
                estado.setInt(4, item.getId());
                estado.setString(1, item.getNome());
                estado.setString(2, item.getEndereco());
                estado.setString(3, item.getTelefone());
                estado.executeUpdate();
            } catch (SQLException erroUpdate) {
                
            }
        }  
    }
    
    //READ
    public List<Cliente> consultar() {
        List<Cliente> clientes = new ArrayList<>();
        try {
            
            String sqlSelect = "SELECT * FROM cliente";
            PreparedStatement estado = conexao.prepareStatement(sqlSelect);
            
            ResultSet resultado = estado.executeQuery();
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                String endereco = resultado.getString("endereco");
                String telefone = resultado.getString("telefone");
                Cliente cliente = new Cliente(id, nome, endereco, telefone);
                clientes.add(cliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clientes;
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
