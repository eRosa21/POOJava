public class Arma {

    String nome;
    int poder;
    int resist;
    String descricao;

    public int mostraResist(){
        return this.resist;
    }
    void mostraInfoArma(){   // utilizei o this. pois estava tentando fazer um meto de escolha para saber qual arma mostrar
        System.out.println("Nome: " + this.nome);
        System.out.println("Poder:" + this.poder);
        System.out.println("Resistencia: " + this.resist);
        System.out.println("Descrição:" + this.descricao);
    }
}
