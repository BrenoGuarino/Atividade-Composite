import org.example.Categoria;
import org.example.Filme;
import org.example.Serie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StreamingTeste {

    @Test
    void deveRetornarDetalhesCategoria() {
        Filme filme1 = new Filme("Inception", "Christopher Nolan", 148);
        Filme filme2 = new Filme("The Thing", "John Carpenter", 136);
        Serie serie1 = new Serie("Stranger Things", 4);

        Categoria categoria = new Categoria("Suspense");
        categoria.addConteudo(filme1);
        categoria.addConteudo(filme2);
        categoria.addConteudo(serie1);

        assertEquals("Categoria: Suspense\n" +
                "Filme: Inception - Diretor: Christopher Nolan - Duração: 148 minutos\n" +
                "Filme: The Thing - Diretor: John Carpenter - Duração: 136 minutos\n" +
                "Série: Stranger Things - Temporadas: 4\n", categoria.getDetalhes());
    }

    @Test
    void deveAdicionarConteudoNaCategoria() {
        Filme filme = new Filme("Interstellar", "Christopher Nolan", 169);

        Categoria categoria = new Categoria("Ficção Científica");
        categoria.addConteudo(filme);

        assertEquals("Categoria: Ficção Científica\n" +
                "Filme: Interstellar - Diretor: Christopher Nolan - Duração: 169 minutos\n", categoria.getDetalhes());
    }

    @Test
    void deveRetornarDetalhesFilme() {
        Filme filme = new Filme("The Godfather", "Francis Ford Coppola", 175);
        assertEquals("Filme: The Godfather - Diretor: Francis Ford Coppola - Duração: 175 minutos\n", filme.getDetalhes());
    }

    @Test
    void deveRetornarDetalhesSerie() {
        Serie serie = new Serie("Breaking Bad", 5);
        assertEquals("Série: Breaking Bad - Temporadas: 5\n", serie.getDetalhes());
    }
}