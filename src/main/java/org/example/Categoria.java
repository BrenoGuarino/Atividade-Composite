package org.example;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private String nome;
    private List<ConteudoStreaming> conteudos;

    public Categoria(String nome) {
        this.nome = nome;
        this.conteudos = new ArrayList<ConteudoStreaming>();
    }

    public void addConteudo(ConteudoStreaming conteudo) {
        this.conteudos.add(conteudo);
    }

    public String getDetalhes() {
        StringBuilder detalhes = new StringBuilder("Categoria: " + nome + "\n");
        for (ConteudoStreaming conteudo : conteudos) {
            detalhes.append(conteudo.getDetalhes());
        }
        return detalhes.toString();
    }
}