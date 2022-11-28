/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author pedro
 */
public class Produto {
    private int id;
    private String nome;
    private double preco;
    private double valorCompra;

    public Produto(int id, String nome, double preco, double valorCompra) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.valorCompra = valorCompra;
    }

    public Produto(String nome, double preco, double valorCompra) {
        this.nome = nome;
        this.preco = preco;
        this.valorCompra = valorCompra;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nome=" + nome + ", preco=" + preco + ", valorCompra=" + valorCompra;
    }  
}
