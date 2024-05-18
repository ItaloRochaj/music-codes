package br.com.codes.music.principal;

import br.com.codes.music.modelos.MinhasPreferidas;
import br.com.codes.music.modelos.Musica;
import br.com.codes.music.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Hail to the King");
        minhaMusica.setCantor("Avenged Sevenfold");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Musiccodes");
        meuPodcast.setApresentador("Italo Rocha");

        for (int i = 0; i < 5000 ; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {

        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
