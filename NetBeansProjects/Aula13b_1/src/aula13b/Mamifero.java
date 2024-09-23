/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13b;

/**
 *
 * @author Celmar Pereira
 */
public class Mamifero extends Animal {
    // Atributos
    protected String corPelo;
    
    // M�todo P�blicos
    @Override
    public void emitirSom() {
        System.out.println("Som de Mam�fero...");
    }
    
    // M�todos Especiais
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
