/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12a;

/**
 *
 * @author Celmar Pereira
 */
public class Peixe extends Animal {
    // Atributos
    private String corEscama;
    
    // M�todos Publicos
    public void soltarBolha() {
        System.out.println("Soltou uma bolha.");
    }
    
    // M�todos Especiais
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo subst�ncias...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som...");
    }
    
}
