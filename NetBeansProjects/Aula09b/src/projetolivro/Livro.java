/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolivro;

/**
 *
 * @author Celmar Pereira
 */
public class Livro implements Publicacao {
    // Atributos
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Métodos Publicos
    public String detalhes() {
        return "Livro {" + "titulo = " + titulo + ", autor = " 
                + autor + ",\n totPaginas = " + totPaginas 
                + ", pagAtual = " + pagAtual + ", aberto = " 
                + aberto + ",\n leitor = " + leitor.getNome() 
                + ", idade = " + leitor.getIdade()
                + ", sexo = " + leitor.getSexo() + " }";
    }
    
    
    // Métodos Especiais
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public void setTituto(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getTotPaginas() {
        return this.totPaginas;
    }
    public void setTotPaginas(int totpaginas) {
        this.totPaginas = totpaginas;
    }
    
    public int getPagAtual() {
        return this.pagAtual;
    }
    public void setPagAtual(int pagatual) {
        this.pagAtual = pagatual;
    }
    
    public boolean getAberto() {
        return this.aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    public Pessoa getLeitor() {
        return this.leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
        if (pagina > this.getTotPaginas()) {
            this.setPagAtual(0);
        } else {
            this.setPagAtual(pagina);
        }
    }

    @Override
    public void avancarPag() {
        if (this.getPagAtual() >= this.getTotPaginas()) {
            this.getPagAtual();
        } else {
            this.setPagAtual(this.getPagAtual() + 1);
        }
        
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() == 0) {
            this.setPagAtual(0);
        } else {
            this.setPagAtual(this.getPagAtual() - 1);
        }
        
    }
    
}
