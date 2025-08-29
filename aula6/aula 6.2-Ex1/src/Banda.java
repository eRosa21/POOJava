public class Banda {

    public String nome;
    public String genero;

    public Empresario empresario;

    public Musica[] musicas;
    public Membro[] membros;

    int indiceMusicas = 0;
    int indiceMembros = 0;

    Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;

        this.membros = new Membro[5];
        this.musicas = new Musica[10];
    }

        void addMembroNovo(Membro novoMembro) {
        if (indiceMembros < membros.length) {
            membros[indiceMembros] = novoMembro;
            indiceMembros++;
        }
    }

    void addMusicaNova(Musica novaMusica) {
        if (indiceMusicas < musicas.length) {
            musicas[indiceMusicas] = novaMusica;
            indiceMusicas++;
        } else {
            System.out.println("O álbum da banda está cheio!");
        }
    }

    void mostraInfo() {
        System.out.println("----- Ficha da Banda -----");
        System.out.println("Banda: " + this.nome);
        System.out.println("Gênero: " + this.genero);

        if (this.empresario != null) {
            System.out.println("Empresário: " + this.empresario.nome);
        }

        System.out.println("\n--- Membros (" + indiceMembros + ") ---");
        for (int i = 0; i < indiceMembros; i++) {
            System.out.println("Membro: " + membros[i].nome + " | Função: " + membros[i].funcao);
        }

        System.out.println("\n--- Músicas (" + indiceMusicas + ") ---");
        for (int i = 0; i < indiceMusicas; i++) {
            System.out.println("Música: " + musicas[i].nome + " | Duração: " + musicas[i].duracao);
        }
        System.out.println("--------------------------");
    }
}