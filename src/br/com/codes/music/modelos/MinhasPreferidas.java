package br.com.codes.music.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9 ) {
            System.out.println(audio.getTitulo() + " Mais ouvido da semana" +  " top 10!");
        } else {
            System.out.println(audio.getTitulo() + " Preferencia do publico até 25 anos");
        }
    }

}
