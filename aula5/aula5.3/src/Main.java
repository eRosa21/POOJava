public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        Arma aprincipal = new Arma();
        Arma secundaria = new Arma();

        personagem.nome = "Ricardinho Sangue Quente";
        personagem.pontos = 500;
        personagem.vida = 268;

        personagem.aprincipal = aprincipal; // aqui estou apontando para a arma principal na classe Personagem e na classe Arma

        aprincipal.nome = " Sabre de Fogo";
        aprincipal.poder = 125;
        aprincipal.resist = 55;
        aprincipal.descricao = " Um sabre de fogo que queima os inimigos e causa +3 de dano a cada 5 segudos.";

        personagem.usarArma(2);
        personagem.tomaDano(5);

        System.out.println("Vida do personagem = " + personagem.vida);

        aprincipal.mostraInfoArma();  // queria saber como que eu eu faço para escolher qual a arma que vou mostrar aqui.

        System.out.println("Resistancia da arma = " + aprincipal.resist);
    }
}