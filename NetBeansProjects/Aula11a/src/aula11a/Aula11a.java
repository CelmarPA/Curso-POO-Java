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
        // Pessoa op1 = new Pessoa(); como Pessoa � uma classe abstrata n�o pode gerar objeto
        Visitante v1 = new Visitante(); // Visitante � uma classe de heran�a pobre (Heran�a de Implementa��o)
        Aluno a1 = new Aluno();
    }
    
}
