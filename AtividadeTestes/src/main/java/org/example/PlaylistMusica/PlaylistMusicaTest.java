package org.example.PlaylistMusica;

import org.example.Biblioteca.Livro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaylistMusicaTest {


    private PlaylistMusica playlistMusica;

    @BeforeEach
    public void setUp() {
        playlistMusica = new PlaylistMusica("Dreamspace");
    }

    @Test
    public void testAdicionarMusica() {
        Musica BYS = new Musica( " By Your Side", "omori", 2);
        assertEquals(true, playlistMusica.adicionarMusica( BYS));
        assertEquals(false, playlistMusica.adicionarMusica(null));
    }

    @Test
    public void testRemoverMusica() {
        Musica BBB = new Musica( "Bargain Bin Boys", "omori", 3);
        playlistMusica.adicionarMusica(BBB);
        assertEquals(true, playlistMusica.removerMusica(BBB));
    }

    @Test
    public void testBuscarMusicaPorTitulo() {
        Musica FD = new Musica("Final Duet", "omori",
                2);
        playlistMusica.adicionarMusica(FD);
        assertEquals(FD, playlistMusica.buscarMusicaPorTitulo("Final Duet"));
    }

    @Test
    public void testBuscarMuiscasPorArtista() {
        Musica FD = new Musica("Final Duet", "omori",
                2);
        Musica BBB = new Musica( "Bargain Bin Boys", "omori", 3);
        Musica BYS = new Musica( " By Your Side", "omori", 2);
        playlistMusica.adicionarMusica(FD);
        playlistMusica.adicionarMusica(BBB);
        playlistMusica.adicionarMusica(BYS);
        assertEquals(3, playlistMusica.buscarMusicasPorArtista("omori").size());
    }

    @Test
    public void testgetSetNome() {
        playlistMusica.setNome("Headspace");
        assertEquals("Headspace", playlistMusica.getNome());
    }

    @Test
    public void testgetMusicas() {
        Musica FD = new Musica("Final Duet", "omori",
                2);
        Musica BBB = new Musica( "Bargain Bin Boys", "omori", 3);
        Musica BYS = new Musica( " By Your Side", "omori", 2);
        playlistMusica.adicionarMusica(FD);
        playlistMusica.adicionarMusica(BBB);
        playlistMusica.adicionarMusica(BYS);
        assertEquals(3, playlistMusica.getMusicas().size());
    }
    
}
