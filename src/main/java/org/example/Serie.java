package org.example;

import java.util.ArrayList;
import java.util.List;

public class Serie extends ConteudoStreaming {

    private int numeroTemporadas;

    public Serie(String titulo, int numeroTemporadas) {
        super(titulo);
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    @Override
    public String getDetalhes() {
        return "Série: " + getTitulo() + " - Temporadas: " + numeroTemporadas + "\n";
    }
}