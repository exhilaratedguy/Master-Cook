/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterCookUI;

import java.util.TreeMap;
/**
 *
 * @author Henrique
 */
public class Edicao {
    private String cidade; //cria uma string que guarda o nome da cidade
    private int ano; //cria um int que guarda o ano da edição
    private double pesoChef; //cria um double que guarda o peso da avalição do chef
    private TreeMap<Integer, Concorrente> concorrentes; //cria uma treemap cujas chaves são os números dos concorrentes e os valores são os concorrentes
    
    public Edicao(String cidade, int ano, double pesoChef){ 
        this.cidade=cidade; //inicializa o nome da cidade com o parâmetro passado
        this.ano=ano; //inicializa o ano da edição com o parâmetro passado
        this.pesoChef=pesoChef; //inicializa o peso da avaliação do chef com o parâmetro passado
        concorrentes = new TreeMap<Integer, Concorrente>(); //inicializa a treemap concorrentes
    }
    
    public String getCidade() {
        return cidade;
    }
    public int getAno() {
        return ano;
    }
    public TreeMap<Integer, Concorrente> getConcorrentes() {
        return concorrentes;
    }
    public double getPesoChef() {
        return pesoChef;
    }
    
    public void addConcorrente(Concorrente c){
        concorrentes.put(c.getNumero(), c);
    }
    public boolean temChef(){
        return pesoChef!=0;
    }
    
    public boolean contemConcorrente(int numero){
        return concorrentes.containsKey(numero);
    }
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        
        Edicao e = (Edicao) obj;
        return ano == e.getAno(); //retorna true/false dependendo o ano desta edição é igual ao ano da edição passada como parâmetro
    }
    
    //função que retorna a informação do objeto como String quando chamada
    public String toString(){
        String info = "Ano: "+ano+"\nCidade: "+cidade+"\nAvaliação com Chef: ";
        if(temChef())
            return info+="Sim\nPeso do Chef: "+pesoChef;
        else
            return info+="Não";
    }
}
