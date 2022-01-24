/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author emanu
 */
public class cadastro_Jogo {
private String nick;
private String sexo;
private boolean brasileiro;
private String cpf;
private boolean robo;   

    public cadastro_Jogo() {
        this.nick = "";
        this.sexo = "";
        this.brasileiro = brasileiro;
        this.cpf = "";
        this.robo =robo;
    }

    public cadastro_Jogo(String nick, String sexo, boolean brasileiro, String cpf, boolean robo) {
        this.nick = nick;
        this.sexo = sexo;
        this.brasileiro = brasileiro;
        this.cpf = cpf;
        this.robo = robo;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isBrasileiro() {
        return brasileiro;
    }

    public void setBrasileiro(boolean brasileiro) {
        this.brasileiro = brasileiro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isRobo() {
        return robo;
    }

    public void setRobo(boolean robo) {
        this.robo = robo;
    }

}