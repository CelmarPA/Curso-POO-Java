/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05b;

/**
 *
 * @author Celmar Pereira
 */
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // Métodos Personalizados
    public void estadoAtual() {
        System.out.println("------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("------------------------------------------");
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }   
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("A conta possui saldo!");
        } else if (this.getSaldo() < 0) {
            System.out.println("A conta possui debito!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v) {
        if (this.getStatus() ==  true) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizando na conta de " + getDono() + "!");
        } else {
            System.out.println("Impossível realizar o depositar!");
        }
    }
    
    public void sacar(float v) {
        if (this.getStatus() == true) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado nada conta de " + getDono() + "!");
            } else if (this.getSaldo() < v) {
                System.out.println("Não há saldo suficiente para realizar o saque!");
            }
        } else {
            System.out.println("Impossível realizar o saque!");
        }
    }
    
    public void pagarMensal() {
        float v = 0;
        if ("CC".equals(getTipo())) {
            v = 12;
        } else if ("CP".equals(getTipo())) {
            v = 20;
        }
        
        if (this.getStatus() == true) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Pagamento debitado com sucesso na conta de " + getDono() + "!");
            } else {
                System.out.println("Saldo insuficiente para pagamento!");
            }
        } else {
            System.out.println("Impossível realizar pagamento!");
        }
    }
    
    // Métodos Especiais
    public Conta() {
        this.saldo = 0;
        this.status = false;
    }
    
    public void setNumConta(int n) {
        this.numConta = n;
    }
    public int getNumConta() {
        return numConta;
    }
    
    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getTipo() {
        return tipo;
    }
    
    public void setDono(String d) {
        this.dono = d;
    }
    public String getDono() {
        return dono;
    }
    
    public void setSaldo(float s) {
        this.saldo = s;
    }
    public float getSaldo() {
        return saldo;
    }
    
    public void setStatus(boolean cond) {
        this.status = cond;
    }
    public boolean getStatus() {
        return status;
    }
    
}
