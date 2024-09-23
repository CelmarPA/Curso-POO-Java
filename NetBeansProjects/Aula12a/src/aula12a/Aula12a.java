/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12a;

/**
 *
 * @author Celmar Pereira
 */
public class Aula12a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Animal a1 = nwe Animal();
         Mamifero m = new Mamifero();
         Reptil r = new Reptil();
         Peixe p = new Peixe();
         Ave a = new Ave();
         
         m.setPeso(85.3f);
         m.setIdade(2);
         m.setMembros(4);
         m.locomover();
         m.alimentar();
         m.emitirSom();
         
         System.out.println("");
         
         p.setPeso(0.35f);
         p.setIdade(1);
         p.setMembros(0);
         p.locomover();
         p.alimentar();
         p.emitirSom();
         p.soltarBolha();
         
         System.out.println("");
         
         a.setPeso(0.89f);
         a.setIdade(2);
         a.setMembros(2);
         a.locomover();
         a.alimentar();
         a.emitirSom();
         a.fazerNinho();
         
         System.out.println("");
         
         r.setPeso(0.25f);
         r.setIdade(1);
         r.setMembros(5);
         r.locomover();
         r.alimentar();
         r.emitirSom();
         
         System.out.println("");
         System.out.println("");
         
         Cachorro k = new Cachorro();
         Canguru c = new Canguru();
         
         m.setPeso(5.70f);
         m.setIdade(8);
         m.setMembros(4);
         m.locomover();
         m.alimentar();
         m.emitirSom();
         
         System.out.println("");
         
         c.setPeso(55.30f);
         c.setIdade(3);
         c.setMembros(4);
         c.locomover();
         c.alimentar();
         c.emitirSom();
         c.usarBolsa();
         
         System.out.println("");
         
         k.setPeso(3.94f);
         k.setIdade(5);
         k.setMembros(4);
         k.locomover();
         k.alimentar();
         k.emitirSom();
         k.enterrarOsso();
         k.abanarRabo();
    }
    
}
