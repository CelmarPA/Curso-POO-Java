/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula02b;

/**
 *
 * @author Celmar Pereira
 */
public class Aula {
    String titulo;
    String tema;
    int tempo;
    boolean pratica;
    boolean exercicios;
    
    void status() {
        System.out.println("T�tulo: " + this.titulo);
        System.out.println("Tema:" + this.tema);
        System.out.println("Dura��o: " + this.tempo + " minutos");
        System.out.println("Aula pr�tica? " + this.pratica);
        System.out.println("Possui exerc�cios? " + this.exercicios);
    }
    
    void passarexercicio() {
        this.exercicios = true;
    }
    
    void naopassarexercicio() {
        this.exercicios = false;
    }
    
    void dever() {
        if (this.exercicios == false) {
            System.out.println("Est� aula n�o possui exerc�cios a serem resolvidos!");
        } else {
            System.out.println("Estou resolvendo os exerc�cios!");
        }
    }
}
