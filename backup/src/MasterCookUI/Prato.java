/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterCookUI;

/**
 *
 * @author Henrique
 */
public class Prato {
    private String tipo, nome, regiao;
    private int tempo; //em segundos
    private double nota;
    private boolean duelo;
    
    public Prato(String nome, String tipo, String regiao, int tempo, boolean duelo) {
        this.tipo = tipo;
        this.nome = nome;
        this.regiao = regiao;
        this.tempo = tempo;
        this.duelo = duelo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public int getTempo() {
        return tempo;
    }

    public String getNome() {
        return nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public double getNota() {
        return nota;
    }

    public boolean isDuelo() {
        return duelo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    public void darNota(int j1, int j2, int j3){
        nota = (j1+j2+j3)/(double)3;
    }
    public void darNota(int j1, int j2, int j3, int chef, double pesoChef){
        nota = ((j1+j2+j3)/3)*(1-pesoChef)+chef*pesoChef;
    }
    
    
    
}
