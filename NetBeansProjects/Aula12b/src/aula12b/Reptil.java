/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12b;

/**
 *
 * @author Celmar Pereira
 */
public class Reptil extends Animal {
    // Atributos
    private String corEscama;
    
    // Métodos Publicos
    @Override
    public void locomover() {
        System.out.println("Arrastando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo insetos...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de reptíl...");
    }
    
    /// Métodos Especiais
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
