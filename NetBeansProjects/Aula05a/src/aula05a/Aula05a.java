/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05a;

/**
 *
 * @author Celmar Pereira
 */
public class Aula05a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c1 = new Conta();
        c1.abrirConta("CC");
        c1.setDono("Celmar Pereira");
        c1.depositar(1000);
        c1.sacar(50);
        c1.pagarMensal();
        System.out.println("O dono da conta é " + c1.getDono() + " o tipo da conta é " + c1.getTipo());
        System.out.println("O saldo da conta é " + c1.getSaldo());
    }
    
}
