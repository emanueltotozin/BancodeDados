/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/**
 *
 * @author emanu
 */
public class ListaTurma {
    private String email ;
    private String primeiro_nome;
    private String data_de_nascimento;
    private String cpf;

    public ListaTurma(String email, String primeiro_nome, String data_de_nascimento, String cpf, String nome_jogo) {
        this.email = email;
        this.primeiro_nome = primeiro_nome;
        this.data_de_nascimento = data_de_nascimento;
        this.cpf = cpf;
        this.nome_jogo = nome_jogo;
    }

    public ListaTurma() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrimeiro_nome() {
        return primeiro_nome;
    }

    public void setPrimeiro_nome(String primeiro_nome) {
        this.primeiro_nome = primeiro_nome;
    }

    public String getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(String data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome_jogo() {
        return nome_jogo;
    }

    public void setNome_jogo(String nome_jogo) {
        this.nome_jogo = nome_jogo;
    }
    private String nome_jogo;
}
