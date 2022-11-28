package controller;

/**
 *
 * @author pedro
 */
public class Cliente {
    
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    
    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public Cliente(String nome, String endereco, String telefone, String cpf) {
        this.nome = nome;    
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }
    
    public Cliente(String nome) {
        this.nome = nome;
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
        return "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", cpf=" + cpf;
    } 
}


