    public class Personagem {

    String nome;
    int pontos;
    double vida;
    Arma aprincipal;

    void usarArma(int quantidadeResis){
        aprincipal.resist -= quantidadeResis;

    }
    void tomaDano(int quantidadeDano){

        this.vida -= quantidadeDano;

    }

}