/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05b;

/**
 *
 * @author Celmar Pereira
 */
public class Aula05b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta p1 = new Conta();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        
        
        Conta p2 = new Conta();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        
        p1.depositar(300);
        p2.depositar(500);
        
        p2.sacar(100);
        
        p1.sacar(350);
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}
