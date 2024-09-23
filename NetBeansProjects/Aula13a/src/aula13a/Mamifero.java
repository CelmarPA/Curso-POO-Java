/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13a;

/**
 *
 * @author Celmar Pereira
 */
public class Mamifero extends Animal {
    // Atributos
    private String corPelo;
    
    //Métodos Publicos
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero...");
    }
    
    // Métodos Especiais
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
