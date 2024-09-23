/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11b;

/**
 *
 * @author Celmar Pereira
 */
public class Bolsista extends Aluno {
    // Atributos
    private float bolsa;
    
    // M�todos Publicos
    public void renovarBolsa() {
        System.out.println("Renovando a bolsa de " + this.nome);
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " � bolsista! Pagamento facilitado!");
    }
    
    // M�todos Especiais
    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
