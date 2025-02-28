package org.example;

public class Zumbi {
    string nome;
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
            vida + 20;
        }else {
            vida +7;
        }
    }
}
