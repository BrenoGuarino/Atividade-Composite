package org.example;

public class Filme extends ConteudoStreaming {

    private String diretor;
    private int duracao;

    public Filme(String titulo, String diretor, int duracao) {
        super(titulo);
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String getDetalhes() {
        return "Filme: " + getTitulo() + " - Diretor: " + diretor + " - Duração: " + duracao + " minutos\n";
    }
}