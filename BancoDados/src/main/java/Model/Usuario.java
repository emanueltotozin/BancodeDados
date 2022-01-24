/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author emanu
 */
public class Usuario {
private String email ;
private String aparelho ;
private String n_de_telefone ;
private String primeiro_nome ;
private String segundo_nome ;
private String data_de_nascimento ;

    public Usuario() {
    }

    public Usuario(String email, String aparelho, String n_de_telefone, String primeiro_nome, String segundo_nome, String data_de_nascimento) {
        this.email = email;
        this.aparelho = aparelho;
        this.n_de_telefone = n_de_telefone;
        this.primeiro_nome = primeiro_nome;
        this.segundo_nome = segundo_nome;
        this.data_de_nascimento = data_de_nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAparelho() {
        return aparelho;
    }

    public void setAparelho(String aparelho) {
        this.aparelho = aparelho;
    }

    public String getN_de_telefone() {
        return n_de_telefone;
    }

    public void setN_de_telefone(String n_de_telefone) {
        this.n_de_telefone = n_de_telefone;
    }

    public String getPrimeiro_nome() {
        return primeiro_nome;
    }

    public void setPrimeiro_nome(String primeiro_nome) {
        this.primeiro_nome = primeiro_nome;
    }

    public String getSegundo_nome() {
        return segundo_nome;
    }

    public void setSegundo_nome(String segundo_nome) {
        this.segundo_nome = segundo_nome;
    }

    public String getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(String data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }
}
