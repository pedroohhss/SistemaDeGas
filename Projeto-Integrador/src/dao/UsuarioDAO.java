package dao;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class UsuarioDAO {
    
    private Connection conexao;
        
    //Construtor
    public UsuarioDAO()throws Exception {
        try {
            String url = "jdbc:postgresql://localhost:5432/sistemaGas";
            String usuario = "postgres";
            String senha = "1234";
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            System.exit(1);
        }
    }//Fim construtor
    
    //Registrar no banco de dados
    public boolean registrar(String user, String pass) throws SQLException{
        try {
 
            PreparedStatement estado;

            String sqlInsert = "INSERT INTO usuarios (username, password) VALUES(?,?)";
            estado = conexao.prepareStatement(sqlInsert, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            estado.setString(1, user);
            estado.setString(2, pass);
            
            boolean teste = estado.execute();
            System.out.println(teste);
            if (teste = true) {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            System.exit(1);
        }
        return false;
}
    
    //Consultar Banco de Dados
    public void consultar() throws Exception{
        final String sqlSelect = "SELECT * FROM usuarios";
        try {
            PreparedStatement estado = conexao.prepareStatement(sqlSelect);
            
            ResultSet resultado = estado.executeQuery();
            
            System.out.println("ID  " + "USER     " + "PASSWORD");
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String user = resultado.getString("name");
                String pass = resultado.getString("password");
                System.out.println(id + "   " + user + "     " + pass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    //Efetuar login
    public boolean login(String user, String pass) {
        try {
            
            String sqlSelect = "SELECT user,password FROM usuarios WHERE username=? and password=?";
            PreparedStatement estado = conexao.prepareStatement(sqlSelect, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            estado.setString(1, user);
            estado.setString(2, pass);
            
            ResultSet resultado = estado.executeQuery();
            
            if (resultado.first()) {
                return true;
            }

        } catch (SQLException e) {
            System.err.println(e);
        }
        return false;
    }
}
