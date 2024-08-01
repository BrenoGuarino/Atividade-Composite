package org.example;

public abstract class ConteudoStreaming {

    private String titulo;

    public ConteudoStreaming(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract String getDetalhes();
}