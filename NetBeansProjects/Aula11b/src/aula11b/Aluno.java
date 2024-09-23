/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11b;

/**
 *
 * @author Celmar Pereira
 */
public class Aluno extends Pessoa {
    // Atributos
    private int matricula;
    private String curso;
    
    // M�todos Publicos
    public void pagarMensalidade() {
        System.out.println("Pagando a mesalidade do aluno " + this.nome + "!");
    }
    
    // M�todos Especiais
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
