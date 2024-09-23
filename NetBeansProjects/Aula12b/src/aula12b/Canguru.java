/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12b;

/**
 *
 * @author Celmar Pereira
 */
public class Canguru extends Mamifero {
    // Métodos Publicos
    public void usarBolsa() {
        System.out.println("Usando bolsa...");
    }
    
    @Override
    public void locomover() {
        System.out.println("Saltando...");
    }
}
