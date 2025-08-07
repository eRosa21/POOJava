import java.util.Scanner;

public class Main{

    public static void  main(String[] args)
    {
        System.out.println();

        Scanner entrada = new Scanner(System.in);

            System.out.println("Lanche1:");
            int lanche1 = entrada.nextInt();
            System.out.println("Lanche2:");
            int lanche2 = entrada.nextInt();
            System.out.println("Lanche3:");
            int lanche3 = entrada.nextInt();

            int total = lanche1+lanche2+lanche3;
            double media = (double)total/3;

        System.out.println(" o total de lanches:" + total);
        System.out.println(" media"+ media);

    }
}
