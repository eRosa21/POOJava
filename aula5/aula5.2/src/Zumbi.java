public class Zumbi {

    String nome;
    int vida;

    public int mostraVida() {
        return this.vida;
    }
    public boolean transfere(Zumbi zumbiAlvo, int quantia) {
        if (this.vida >= quantia) {  // nao sei se o this. pode ser utilizado
            this.vida -= quantia;
            zumbiAlvo.vida += quantia;
            System.out.println(this.nome + " transferiu " + quantia + " de vida");
            return true;
        } else {
            System.out.println(this.nome + " não tem vida suficiente para transferir.");
            return false;
        }
    }
}