package org.example.Biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotecaTest {

    //buscarLivrosPorGenero

    private Biblioteca biblioteca;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca("Municipal");
    }

    @Test
    public void testAdicionarLivro() {
        Livro MVU = new Livro("O Morro dos Ventos Uivantes", "Emily Bromte",
                "Terror",1847 );
        assertEquals(true, biblioteca.adicionarLivro(MVU));

        Livro qualquer = null;
        assertEquals(false, biblioteca.adicionarLivro(qualquer));
    }

    @Test
    public void testRemoverLivro() {
        Livro Frankenstein = new Livro("Frankenstein", "Marry Shelley",
                "Terror",1818 );
        biblioteca.adicionarLivro(Frankenstein);
        assertEquals(true, biblioteca.removerLivro(Frankenstein));
    }

    @Test
    public void testBuscarLivroPorTitulo() {
        Livro Dracula = new Livro("Dracula", "Bram Stoker",
                "Terror",1897 );
        biblioteca.adicionarLivro(Dracula);
        assertEquals(Dracula, biblioteca.buscarLivroPorTitulo("Dracula"));
    }

    @Test
    public void testBuscarLivrosPorAutor() {
        Livro MeM = new Livro("Medico e o Monstro", "Stevenson",
                "Terror",1897 );
        biblioteca.adicionarLivro(MeM);
        assertEquals(1, biblioteca.buscarLivrosPorAutor("Stevenson").size());
    }

    @Test
    public void testBuscarLivrosPorGenero() {
        Livro MeM = new Livro("Medico e o Monstro", "Stevenson",
                "Terror",1897 );
        Livro Dracula = new Livro("Dracula", "Bram Stoker",
                "Terror",1897 );
        Livro Frankenstein = new Livro("Frankenstein", "Marry Shelley",
                "Terror",1818 );
        Livro MVU = new Livro("O Morro dos Ventos Uivantes", "Emily Bromte",
                "Terror",1847 );
        biblioteca.adicionarLivro(MeM);
        biblioteca.adicionarLivro(Dracula);
        biblioteca.adicionarLivro(Frankenstein);
        biblioteca.adicionarLivro(MVU);
        assertEquals(4, biblioteca.buscarLivrosPorGenero("Terror").size());
    }

    @Test
    public void testgetQuantidadeLivros() {
        Livro MeM = new Livro("Medico e o Monstro", "Stevenson",
                "Terror",1897 );
        Livro Dracula = new Livro("Dracula", "Bram Stoker",
                "Terror",1897 );
        Livro Frankenstein = new Livro("Frankenstein", "Marry Shelley",
                "Terror",1818 );
        Livro MVU = new Livro("O Morro dos Ventos Uivantes", "Emily Bromte",
                "Terror",1847 );
        biblioteca.adicionarLivro(MeM);
        biblioteca.adicionarLivro(Dracula);
        biblioteca.adicionarLivro(Frankenstein);
        biblioteca.adicionarLivro(MVU);
        assertEquals(4, biblioteca.getQuantidadeLivros());
    }

    @Test
    public void testgetLivros() {
        Livro MeM = new Livro("Medico e o Monstro", "Stevenson",
                "Terror",1897 );
        Livro Dracula = new Livro("Dracula", "Bram Stoker",
                "Terror",1897 );
        Livro Frankenstein = new Livro("Frankenstein", "Marry Shelley",
                "Terror",1818 );
        Livro MVU = new Livro("O Morro dos Ventos Uivantes", "Emily Bromte",
                "Terror",1847 );
        biblioteca.adicionarLivro(MeM);
        biblioteca.adicionarLivro(Dracula);
        biblioteca.adicionarLivro(Frankenstein);
        biblioteca.adicionarLivro(MVU);
        assertEquals(4, biblioteca.getLivros().size());
    }

    @Test
    public void testgetSetNome() {
       biblioteca.setNome("Do bairro");
        assertEquals("Do bairro", biblioteca.getNome());
    }
}
