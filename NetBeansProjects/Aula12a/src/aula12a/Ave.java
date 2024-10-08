/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12a;

/**
 *
 * @author Celmar Pereira
 */
public class Ave extends Animal {
    // Atributos
    private String corPena;
    
    // M�todos Publicos
    public void fazerNinho() {
        System.out.println("Construiu ninho.");
    }
    
    // M�todos Especiais
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave...");
    }
    
}
