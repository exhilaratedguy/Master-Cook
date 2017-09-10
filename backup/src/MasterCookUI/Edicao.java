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
public class Edicao {
    private String cidade;
    private int ano;
    private double pesoChef;
    //private ArrayList<Concorrente> concorrentes;
    private TreeMap<Integer, Concorrente> concorrentes;
    
    public Edicao(String cidade, int ano, double pesoChef){
        this.cidade=cidade;
        this.ano=ano;
        this.pesoChef=pesoChef;
        //concorrentes = new ArrayList<>(8);
        concorrentes = new TreeMap<Integer, Concorrente>();
    }
    public Edicao(int ano){
        this.ano=ano;
        cidade="";
        concorrentes = new TreeMap<Integer, Concorrente>();
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
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void addConcorrente(Integer numero, Concorrente c){
        concorrentes.put(numero, c);
    }
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        
        Edicao e = (Edicao) obj;
        return ano == e.getAno();
    }
    
    public String toString(){
        String info = "Ano: "+ano+"\nCidade: "+cidade;
        info+="\nAvaliação com Chef: "+pesoChef;
        
        //for (Concorrente c : concorrentes)
            //info+="\n"+c.toString();
        
        return info;
    }
}
