/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author pedro
 */
public class Funcionario {
    
    private String nome;
    private String endereco;
    private String cargo;
    private String telefone;
    private String cpf;

    public Funcionario(String nome, String endereco, String cargo, String telefone, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cargo = cargo;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", endereco=" + endereco + ", cargo=" + cargo + ", telefone=" + telefone + ", cpf=" + cpf + '}';
    }

}
