/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12b;

/**
 *
 * @author Celmar Pereira
 */
public class Cachorro extends Mamifero {
    // M�todos publicos
    public void enterrarOsso() {
        System.out.println("Enterrando osso...");
    }
    public void abanarRabo() {
        System.out.println("Abanando rabo...");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
}
