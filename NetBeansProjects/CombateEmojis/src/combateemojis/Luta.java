/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combateemojis;

import java.util.Random;

/**
 *
 * @author Celmar Pereira
 */
public class Luta {
    // Atributos
    private Lutador desafiado, desafiante;;
    private int rounds;
    private boolean aprovada;
    
    // Métodos Publicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
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
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            
            // Gerando resultado aleátoriamente
            Random random = new Random();
            int vencedor = random.nextInt(3);  // Gera valores enteo 0 ,1 e 2
            System.out.println("====== RESULTADO DA LUTA ======");
            // Definição do vencedor, perdedor e empate
            switch(vencedor) {
                //Empate
                case 0 -> {
                    System.out.println("Empate!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                }
                // Desafiado vence
                case 1 -> {
                    System.out.println(this.getDesafiado().getNome() + " venceu!");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                }
                // Desafiante vence
                case 2 -> {
                    System.out.println(this.getDesafiante().getNome() + " venceu!");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
                }
            }
            System.out.println("===============================");
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
