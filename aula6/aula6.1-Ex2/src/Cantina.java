public class Cantina {
    String nome;
    Salgado[] salgados;
    int i = 0;

    public Cantina(String nome) {
        this.nome = nome;
        this.salgados = new Salgado[3];
    }

    void addSalgado(Salgado novoSalgado) {
        if ( i < salgados.length) {
            this.salgados[i] = novoSalgado;
            this.i++;
        }
    }
    void mostraInfo() {
        System.out.println("\n--- Informações da " + this.nome + " ---");
        for (int i = 0; i < salgados.length; i++) {
            System.out.println(salgados[i].nome);
        }
    }
}