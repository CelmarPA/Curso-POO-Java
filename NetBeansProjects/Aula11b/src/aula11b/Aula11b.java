/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11b;

/**
 *
 * @author Celmar Pereira
 */
public class Aula11b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Pessoa p1 = new Pessoa(); Classe Pessoa é abstrata e não pode ser instanciada
        /* Visitante v1 = new Visitante();  // Herança de Implementação
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString()); */
        
        Aluno a1 = new Aluno();
        a1.setNome("Claúdio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        System.out.println("");
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.setCurso("Administração");
        b1.setIdade(17);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        System.out.println("");
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Cristina");
        t1.setMatricula(1113);
        t1.setCurso("Edificação");
        t1.setIdade(18);
        t1.setSexo("F");
        t1.pagarMensalidade();
        t1.praticar();
        
        System.out.println("");
        
        Professor p1 = new Professor();
        p1.setNome("Rubens");
        p1.setIdade(45);
        p1.setSexo("M");
        p1.setEspecialidade("Matemática");
        p1.setSalario(2500.75f);
        p1.receberAumento(500f);
        
    }
    
}
