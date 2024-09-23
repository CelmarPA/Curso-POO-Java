/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11b;

/**
 *
 * @author Celmar Pereira
 */
public class Tecnico extends Aluno {
    // Aributos
    private int registroProfissional;
    
    // Métodos Publicos
    public void praticar() {
        System.out.println("O aluno " + this.nome + " está praticando!");
    }
    
    // Métodos Especiais
    public int getRegistroProfissional() {
        return registroProfissional;
    }
    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
