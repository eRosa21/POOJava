import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();
        int x = rand.nextInt(10)+1;
        System.out.println(x);



        for(int i = 0; i>=0;i++){
            System.out.println("Tente adivinhar o numero do computador");
            int y = entrada.nextInt();
            if(y==x){
            System.out.println("Acertou!!");
                break;

            }
        }
    }

}