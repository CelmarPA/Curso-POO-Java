/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11a;

/**
 *
 * @author Celmar Pereira
 */
public class Aluno extends Pessoa { // Heran�a para diferen�a
    // Atributos
    private int matricula;
    private String curso;
    
    // M�todos publicos
    public void pagarMensalidade() {
        
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
