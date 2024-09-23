/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11b;

/**
 *
 * @author Celmar Pereira
 */
public class Professor extends Pessoa {
    // Atributos
    private String especialidade;
    private float salario;
    
    // Métodos Publicos
    public void receberAumento(float aumento) {
        this.setSalario(this.getSalario() + aumento);
        System.out.println("O professor " + this.nome + " tinha um salaria de R$" + 
                (this.salario - aumento) + " e recebeu um aumento de R$" + 
                aumento + " e agora seu novo salário é de R$" + this.getSalario());
    }
    
    // Métodos Especiais
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
