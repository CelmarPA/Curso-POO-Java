/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author Celmar Pereira
 */
public class Luta {
    // Atributos
    private Lutador desafiado;  // Tipo abstrato de dado
    private Lutador desafiante; // Tipo abstrato de dado
    private int rounds;
    private boolean aprovada;
    
    // Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2) ) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("Luta marcada!");
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("Luta não pode ser marcada!");
        }
    }
    
    public void lutar() {
        if (this.getAprovada()) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            Random random = new Random();
            int vencedor = random.nextInt(3);
            switch (vencedor) {
                case 0 -> {
                    //Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                case 1 -> {
                    //Ganhou Desafiado
                    System.out.println(this.getDesafiado().getNome() + " venceu!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2 -> {
                    //Ganhou Desafiante
                    System.out.println(this.getDesafiante().getNome() + " venceu!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                }
            }
            
        } else {
            System.out.println("Luta não pode acontecer!");
        }
    }
    
    //Métodos especiais
    
    public Lutador getDesafiado() {
        return this.desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    
    public Lutador getDesafiante() {
        return this.desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    
    public int getRounds() {
        return this.rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    
    public boolean getAprovada() {
        return this.aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
