  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11a;

/**
 *
 * @author Celmar Pereira
 */
public class Aula11a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Pessoa op1 = new Pessoa(); como Pessoa é uma classe abstrata não pode gerar objeto
        Visitante v1 = new Visitante(); // Visitante é uma classe de herança pobre (Herança de Implementação)
        Aluno a1 = new Aluno();
    }
    
}
