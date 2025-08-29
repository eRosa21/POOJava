public class Main {
    public static void main(String[] args) {

        Empresario empresario = new Empresario("PDiddy", 78601);

        Banda banda = new Banda("The Pilantras", "Rock");

        Membro membro1 = new Membro("José Cano Curto", "Vocalista");
        Membro membro2 = new Membro("Ja", "Guitarrista");
        Membro membro3 = new Membro("Azir", "Baterista");

        Musica musica1 = new Musica("Bumbum tamtam", 3.5);
        Musica musica2 = new Musica("Eva", 4.1);

        banda.empresario = empresario;

        banda.addMembroNovo(membro1);
        banda.addMembroNovo(membro2);
        banda.addMembroNovo(membro3);

        banda.addMusicaNova(musica1);
        banda.addMusicaNova(musica2);

        banda.mostraInfo();
    }
}