public class Main {
    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        z1.nome = "Bob o bobo";
        z1.vida = 100;

        Zumbi z2 = new Zumbi();
        z2.nome = "Robertinhoinho";
        z2.vida = 80;
        boolean sucesso = z1.transfere(z2, 80); // z1 transfere para z2

        if (sucesso==true) {
            System.out.println("Transferência realizada com sucesso!");
            System.out.println("Vida de " + z1.nome + " é igual a: " + z1.vida);  // nao consegui usar o mostraVida, não sei o motivo
        } else {
            System.out.println("Falha na transferência.");
        }
    }
}