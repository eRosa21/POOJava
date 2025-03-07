public class Main {
    public static void main(String[] args) {

        Zumbi zumb1 = new Zumbi();
        Zumbi zumb2 = new Zumbi();


        zumb1.nome = "Christiano Ronaldo Careca";
        zumb2.nome = "Jefferson Pegadinhas";

        zumb1.careca = true;
        zumb2.careca = false;


        zumb1.força = 19;
        zumb2.força = 21;

        zumb1.vida = 215;
        zumb2.vida = 300;


        zumb1.correr();
        zumb2.correr();

        zumb1.seAlimentar();
        zumb2.seAlimentar();


    }

}