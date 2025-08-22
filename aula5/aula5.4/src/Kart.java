public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;
    Motor m2;


    public Kart(){
        motor = new Motor();
    }

    void pular(){
        System.out.println("Pulou");
    }
    void soltarTurbo(){
        System.out.println("Turbo Ativado!");
    }

    void fazerDrift(){
        System.out.println("Drift deu bom");
    }

}
