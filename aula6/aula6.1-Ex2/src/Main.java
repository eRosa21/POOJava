public class Main {
    public static void main(String[] args) {

        Cantina cantina = new Cantina("Cantina do Inatel");
        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        salgado1.nome = "Esfirra de carne";
        salgado2.nome = "Pastel de Pizza";
        salgado3.nome = "Joelho";
        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);

        cantina.mostraInfo();
    }
}