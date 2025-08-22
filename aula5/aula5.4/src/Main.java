//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();
        Kart k1 = new Kart();
        Kart k2 = new Kart();


        k1.piloto = p1;
        k2.piloto = p2;
        p1.nome = "Rogerinho";
        p1.vilao = false;
        p2.nome = "Vulto";
        p2.vilao = true;
        k1.nome = "Banana móvel";
        k2.nome = "Carruagem de Deus";
        k1.motor.velocidadeMaxima = 75;
        k2.motor.velocidadeMaxima = 120;
        k1.motor.cilindradas = "50";
        k2.motor.cilindradas = "100";

        k1.motor.mostraInfo();
        k1.pular();
        k1.fazerDrift();
        k1.soltarTurbo();
        p1.soltaSuperPoder();

    }
}