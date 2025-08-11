import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o numero de alunos:");
        int numAlunos = entrada.nextInt();


        switch (numAlunos){

            case 10:
            case 20:
                System.out.println("Aula na sala I-16");
            break;

            case 30:
                System.out.println("Aula na sala I-22");
            break;

            default:
                System.out.println("Aula na sala I-17");
        }


       entrada.close();

    }
}