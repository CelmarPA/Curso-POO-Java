/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10a;

/**
 *
 * @author Celmar Pereira
 */
public class Professor extends Pessoa {
    // Atributos
    private String especialidade;
    private float salario;
    
    // M�todos Publicos
    public void receberAum() {
        
    }
    
    // M�todos Especiais
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
