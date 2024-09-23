/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combateemojis;

/**
 *
 * @author Celmar Pereira
 */
public class Lutador {
    // Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    // Métodos Publicos
    public void apresentar() {
        System.out.println("------------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentando o lutador " + this.getNome() + "!");
        System.out.println("Diretamente de " + this.getNacionalidade() + ", ");
        System.out.println("com " + this.getIdade() + " anos, medindo " + this.getAltura() + "m e ");
        System.out.println("pesando " + this.getPeso() +"kg, ");
        System.out.println("com " + this.getVitorias() + " vitórias, ");
        System.out.println(this.getDerrotas() + " derrotas e  ");
        System.out.println(this.getEmpates() + " empates!");
        System.out.println("------------------------------------------------------");
    }
    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes,");
        System.out.println("perdeu " + this.getDerrotas() + " vezes e ");
        System.out.println("empatou " + this.getEmpates() + " vezes!");
    }
    public void ganharLuta() {
        this.setVitorias(getVitorias() + 1);
        
    }
    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
        
    }
    public void empatarLuta() {
        this.setEmpates(getEmpates() + 1);
        
    }
    
    // Métodos Especiais

    public Lutador(String nome, String nacionalidade, int idade, float altura,
            float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    
    
}
