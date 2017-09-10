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
    private String tipo, nome, regiao; //cria strings que guardam o tipo, nome, e regiao do prato
    private double tempo; //cria um double que guarda o tempo limite de execução do prato
    private double tempo_usado; //cria um double que guarda o tempo de confeção do prato
    private double nota; //cria um double que guarda a nota do prato
    private boolean duelo; //cria um boolean que indica se este é um prato de duelo ou não
    
    //este construtor é chamado quando se insere um novo prato pelo programa
    public Prato(String nome, String tipo, String regiao, double tempo, double tempo_usado, boolean duelo) {
        this.tipo = tipo; //inicializa o tipo do prato com o parâmetro passado
        this.nome = nome; //inicializa o nome do prato com o parâmetro passado
        this.regiao = regiao; //inicializa a regiao do prato com o parâmetro passado
        this.tempo = tempo; //inicializa o tempo limite de execução do prato com o parâmetro passado
        this.tempo_usado = tempo_usado; //inicializa o tempo de confeção do prato com o parâmetro passado
        this.duelo = duelo; //inicializa o boolean de duelo do prato com o parâmetro passado
        nota=-1; //inicializa nota a -1 para indicar que ainda não foi avaliado
    }
    
    //este construtor é chamado quando se insere um novo prato ao ler do ficheiro
    public Prato(String nome, String tipo, String regiao, double tempo, double tempo_usado, boolean duelo, double nota) {
        this.tipo = tipo; //inicializa o tipo do prato com o parâmetro passado
        this.nome = nome; //inicializa o nome do prato com o parâmetro passado
        this.regiao = regiao; //inicializa a regiao do prato com o parâmetro passado
        this.tempo = tempo; //inicializa o tempo limite de execução do prato com o parâmetro passado
        this.tempo_usado = tempo_usado; //inicializa o tempo de confeção do prato com o parâmetro passado
        this.duelo = duelo; //inicializa o boolean de duelo do prato com o parâmetro passado
        this.nota = nota; //inicializa nota do prato com o parâmetro passado
    }
    
    public String getTipo() {
        return tipo;
    }

    public double getTempo() {
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

    public double getTempo_usado() {
        return tempo_usado;
    }

    public boolean isDuelo() {
        return duelo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setDuelo(boolean duelo) {
        this.duelo = duelo;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    
    public void setTempo_usado(double tempo_usado) {
        this.tempo_usado = tempo_usado;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
