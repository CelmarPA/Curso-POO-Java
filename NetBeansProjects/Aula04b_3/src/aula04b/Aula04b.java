/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04b;

/**
 *
 * @author Celmar Pereira
 */
public class Aula04b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta("NIC", 0.4f, "Amarelo");
        c1.setTampada(true);
        c1.status();
        System.out.println(" ");
        Caneta c2 = new Caneta("KKK", 1.5f, "Laranja");
        c2.setTampada(true);
        c2.status();
        
        /* c1.setModelo("BIC");  // Método acessor
        // c1.modelo = "BIC"; // Médodo direto
        
        c1.setPonta(0.5f);  // Método acessor
        // c1.ponta = 0.5f; // ponta é privado 
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta()); */
        
    }
    
}
