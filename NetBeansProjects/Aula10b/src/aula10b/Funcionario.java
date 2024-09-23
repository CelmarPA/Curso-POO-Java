/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10b;

/**
 *
 * @author Celmar Pereira
 */
public class Funcionario extends Pessoa {
    // Atributos
    private String setor;
    private boolean trabalhando;
    
    // M�todos Publicos
    public void mudarTrabalho(String setor) {
        if (this.getTrabalhando()) {
            this.setSetor(setor);
        } else {
            System.out.println("O funcion�rio n�o est� trabalhando atualmente!");
        }
    }
        
    // M�todos Especiais
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public boolean getTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
