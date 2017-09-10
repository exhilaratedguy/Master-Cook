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
    private String nome, sexo;
    private int numero, idade;
    //private ArrayList<Prato> pratos;
    private TreeMap<String, Prato> pratos;
    
    public Concorrente(String nome, int numero, int idade, String sexo){
        this.nome=nome;
        this.numero=numero;
        this.idade=idade;
        this.sexo = sexo;
        //pratos = new ArrayList<>(4);
        pratos = new TreeMap<String, Prato>();
    }
    public Concorrente(int numero){
        this.numero=numero;
        nome="";
        idade=0;
        sexo="";
        pratos = new TreeMap<String, Prato>();
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public TreeMap<String, Prato> getPratos() {
        return pratos;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void addPrato(String nome, Prato p){
        pratos.put(nome, p);
    }
    
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        
        Concorrente c = (Concorrente) obj;
        return (numero == c.getNumero() || nome.equalsIgnoreCase(c.getNome()));
    }
    
    public String toString(){
        String info = "Nome: "+nome+"\nNumero: "+numero+"\nIdade: "+idade;
        return info;
    }
    
}
