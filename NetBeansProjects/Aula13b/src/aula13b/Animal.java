/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13b;

/**
 *
 * @author Celmar Pereira
 */
public abstract class Animal {
    // Atributos
    protected float peso;
    protected int idade;
    protected int membros;
    
    // M�todos Publicos
    public abstract void emitirSom();
    
    // M�todos Especiais
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
    
}
