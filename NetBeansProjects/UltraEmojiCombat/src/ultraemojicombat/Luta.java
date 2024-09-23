/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;

/**
 *
 * @author Celmar Pereira
 */
public class Luta {
    // Atributos
    private String desafiado;
    private String desafiante;
    private int rounds;
    private boolean aprovada;
    
    // Métodos abstratos
    public void marcarLuta() {
        
    }
    
    public void lutar() {
        
    }
    
    // Métodos especiais
    public void setDesafiado(String desafiado) {
        this.desafiado = desafiado;
    }
    public String getDesafiado() {
        return this.desafiado;
    }
    
    public void setDesafiante(String desafiante) {
        this.desafiante = desafiante;
    }
    public String getDesafiante() {
        return this.desafiante;
    }
    
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public int getRounds() {
        return this.rounds;
    }
    
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    public boolean getAprovada() {
        return this.aprovada;
    }
    
}
