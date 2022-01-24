/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author emanu
 */
public class experiencia {
private String xp;
private String media_tempo;
private String satisfacao;

    public experiencia() {
        this.xp = "";
        this.media_tempo = "";
        this.satisfacao = "";
    }

    public experiencia(String xp, String media_tempo, String satisfacao) {
        this.xp = xp;
        this.media_tempo = media_tempo;
        this.satisfacao = satisfacao;
    }

    public String getXp() {
        return xp;
    }

    public void setXp(String xp) {
        this.xp = xp;
    }

    public String getMedia_tempo() {
        return media_tempo;
    }

    public void setMedia_tempo(String media_tempo) {
        this.media_tempo = media_tempo;
    }

    public String getSatisfacao() {
        return satisfacao;
    }

    public void setSatisfacao(String satisfacao) {
        this.satisfacao = satisfacao;
    }

}
