/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author emanu
 */
public class jogo {
private String nome_jogo;
private String mobile_pc;
private String conheceu_aonde;
private int ano_do_jogo;

    public jogo() {
        this.nome_jogo = "";
        this.mobile_pc = "";
        this.conheceu_aonde = "";
        this.ano_do_jogo = 0;
    }

    public jogo(String nome_jogo, String mobile_pc, String conheceu_aonde, int ano_do_jogo) {
        this.nome_jogo = nome_jogo;
        this.mobile_pc = mobile_pc;
        this.conheceu_aonde = conheceu_aonde;
        this.ano_do_jogo = ano_do_jogo;
    }

    public String getNome_jogo() {
        return nome_jogo;
    }

    public void setNome_jogo(String nome_jogo) {
        this.nome_jogo = nome_jogo;
    }

    public String getMobile_pc() {
        return mobile_pc;
    }

    public void setMobile_pc(String mobile_pc) {
        this.mobile_pc = mobile_pc;
    }

    public String getConheceu_aonde() {
        return conheceu_aonde;
    }

    public void setConheceu_aonde(String conheceu_aonde) {
        this.conheceu_aonde = conheceu_aonde;
    }

    public double getAno_do_jogo() {
        return ano_do_jogo;
    }

    public void setAno_do_jogo(int ano_do_jogo) {
        this.ano_do_jogo = ano_do_jogo;
    }
 
}
