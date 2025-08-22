public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 38;
        z2.vida = 72;

        z1.vida =z2.vida;

        if(z1.vida ==z2.vida) {
            System.out.println("Vidas são iguais");
        }else{
            System.out.println("Vidas são diferentes");
        }

    }
}