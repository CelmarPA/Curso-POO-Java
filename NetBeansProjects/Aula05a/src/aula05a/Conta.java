/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05a;

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
    
    public Conta() {
        this.saldo = 0;
        this.status = false;
    
}
    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "CC") {
            setSaldo(50f);
        } else if (t == "CP") {
            setSaldo(150f);
        }
    }
    
    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("A conta possui saldo!");
        } else if (saldo < 0) {
            System.out.println("A conta possui debito!");
        } else {
            setStatus(false);
        }
    }
    
    public void depositar(float v) {
        if (getStatus() == true) {
            setSaldo(getSaldo() + v);
        } else {
            System.out.println("Impossível depositar!");
        }
    }
    
    public void sacar(float v) {
        if (getStatus() == true) {
            if (getSaldo() > v) {
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível realizar o saque!");
        }
    }
    
    public void pagarMensal() {
        float v = 0;
        if (tipo == "CC") {
            v = 12;
        } else if (tipo == "CP") {
            v = 20;
        }
        
        if (getStatus() == true) {
            if (getSaldo() > v) {
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossivel realizar pagamento!");
        }
        
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
    
    public void setStatus(boolean sta) {
        this.status = sta;
    }
    public boolean getStatus() {
        return status;
    }
    
}
