/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11a;

/**
 *
 * @author Celmar Pereira
 */
public abstract class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    // Métodos Publicos
    public final void fazeAniversario() {
        this.setIdade(this.getIdade() + 1);
    }
    
    //Métodos Especiais
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
