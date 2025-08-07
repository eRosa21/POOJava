import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com sua NPA:");
        int npa = entrada.nextInt();

        if(npa>=60){

            System.out.println("Aprovado");
        } else{
            System.out.println("Insira sua nota NP3");
            int np3 = entrada.nextInt();

            float nfa = (float)(npa+np3)/2;
            if(nfa>=49.5){
                System.out.println("Aprovado!");
            }else{
                System.out.println("Reprovado");
            }
        }
    };

}