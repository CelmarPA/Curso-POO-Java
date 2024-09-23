/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioaula02;

/**
 *
 * @author Celmar Pereira
 */
public class ExercicioAula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mouse m1 = new Mouse();
        m1.modelo = "Razer";
        m1.cor = "Preto";
        m1.velocidade = 20000f;
        m1.rgb = true;
        m1.desligar();
        m1.status();
        m1.clicar();
    }
    
}
