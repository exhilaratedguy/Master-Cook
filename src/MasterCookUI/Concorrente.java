/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterCookUI;
import java.util.ArrayList;
import java.util.TreeMap;
/**
 *
 * @author Henrique
 */
public class Concorrente { 
    private String nome, sexo; //cria strings que guardam o nome e sexo do concorrente
    private int numero, idade; //cria ints que guardam o numero e idade do concorrente
    private double nota_total = -1; //cria e inicializa a variavel que guarda a nota total a -1
    private ArrayList<Double> penalizacoes; //cria um arraylist que guarda as penalizacoes (doubles)
    private TreeMap<String, Prato> pratos; //cria um treemap cujas chaves sao os nomes dos pratos e os valores sao os pratos
    
    public Concorrente(String nome, int numero, int idade, String sexo, double nota_total){
        this.nome=nome; //inicializa o nome do concorrente com o parametro passado
        this.numero=numero; //inicializa o numero do concorrente com o parametro passado
        this.idade=idade; //inicializa a idade do concorrente com o parametro passado
        this.sexo = sexo; //inicializa o sexo do concorrente com o parametro passado
        this.nota_total = nota_total; //inicializa a nota total do concorrente com o parametro passado
        penalizacoes = new ArrayList<>(); //inicializa o arraylist penalizacoes
        pratos = new TreeMap<String, Prato>(); //inicializa o treemap pratos
    }
    
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    ;                       Getters                                                                                                                                        ;
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    
    //retorna o nome
    public String getNome() {
        return nome;
    }

    //retorna o numero
    public int getNumero() {
        return numero;
    }

    //retorna a idade
    public int getIdade() {
        return idade;
    }

    //retorna o sexo
    public String getSexo() {
        return sexo;
    }

    //retorna o treemap pratos
    public TreeMap<String, Prato> getPratos() {
        return pratos;
    }

    //retorna o arraylist penalizacoes
    public ArrayList<Double> getPenalizacoes() {
        return penalizacoes;
    }

    //retorna a nota total
    public double getNota_total() {
        return nota_total;
    }
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    ;                                                                                                                                                                      ;
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    //retorna true se contem um prato com esse nome
    public boolean contemPrato(String nome){
        return pratos.containsKey(nome);
    }

    //atualiza a nota total para a passada como parametro
    public void setNota_total(double nota_total) {
        this.nota_total = nota_total;
    }

    //adiciona o prato p
    public void addPrato(Prato p){
        pratos.put(p.getNome(), p);
    }
}
