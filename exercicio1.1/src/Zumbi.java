public class Zumbi {

    String nome;
    string genero;
    string decomposção;

    boolean careca;

    int força;
    int vida;

    void correr(){
        System.out.println("Zombi correndo...");

    }
    void seAlimentar(){
        System.out.println(nome+" esta comendo");

        if(força>=20){
            vida = vida + 20;
        }else {
            vida =vida +7;
        }
    }
}

