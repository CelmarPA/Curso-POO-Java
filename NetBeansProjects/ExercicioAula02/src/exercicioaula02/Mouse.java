/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula02;

/**
 *
 * @author Celmar Pereira
 */
public class Mouse {
    String modelo;
    String cor;
    float velocidade;
    boolean rgb;
    boolean ligado;
    
    void status() {
        System.out.println("Modelo do Mouse: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Velocidade  (DPI): " + this.velocidade);
        System.out.println("Possui RGB: " + this.rgb);
        System.out.println("O Mousa está ligado? " + this.ligado);
    }
    
    void ligar() {
        this.ligado = true;
    }
    
    void desligar() {
        this.ligado = false;  
    }
    
    void clicar(){
        if (this.ligado == false) {
            System.out.println("ERRO! Não é possível clicar!");
        } else {
            System.out.println("Estou Clicando!");
        }
    }
    
}
