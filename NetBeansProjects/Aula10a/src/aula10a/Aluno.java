/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10a;

/**
 *
 * @author Celmar Pereira
 */
public class Aluno extends Pessoa {
    // Atributos
    private boolean matr;
    private String curso;
    
    // M�todos Publicos
    public void cancelarMatr() {
        
    }
    
    // M�todos Especiais
    public boolean getMatr() {
        return matr;
    }

    public void setMatr(boolean matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
      
}
