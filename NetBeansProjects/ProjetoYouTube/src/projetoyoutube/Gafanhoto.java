/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author Celmar Pereira
 */
public class Gafanhoto extends Pessoa {
    // Atributos
    private String login;
    private int totAssistido;
   
    // Métodos Publicos
    public void viuMaisUm() {
        
    }
    
    // Métodos Especiais
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo); // chama Pessoa
        this.login = login;
        this.totAssistido = 0;
    }
        
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nlogin = " + login + ", totAssistido = " + totAssistido + '}';
    }
    
    
}
