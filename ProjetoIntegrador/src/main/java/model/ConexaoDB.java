/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class ConexaoDB{

    public Connection conexao;

    public boolean conectar() {
        try {
            String url = "jdbc:postgresql://localhost:5432/sistemaGas";
            String usuario = "postgres";
            String senha = "1415";
            conexao = DriverManager.getConnection(url, usuario, senha);

            if (conexao != null) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        return false;
    }

}
