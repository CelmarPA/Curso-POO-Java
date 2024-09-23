/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12b;

/**
 *
 * @author Celmar Pereira
 */
public class Aula12b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Animal a1 = new Animal();
        
        Ave a = new Ave();
        Mamifero m = new Mamifero();
        Peixe p = new Peixe();
        Reptil r = new Reptil();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();
        
        /* a.locomover();
        m.locomover();
        p.locomover();
        r.locomover(); */
        
        c.locomover();
        c.emitirSom();
        k.emitirSom();
    }
    
}
