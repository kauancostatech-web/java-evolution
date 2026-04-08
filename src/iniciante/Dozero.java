package iniciante;

import java.util.Scanner;

public class Dozero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int idade;
        String nome;
        double salario;

        System.out.println(" Digite sua idade  :");
        idade = s.nextInt();

        System.out.println("Seu nome  :");
        nome = s.next();

        System.out.println("seu salario :");
        salario = s.nextDouble();

        System.out.println("1 -  Seu nome e:  " + nome);
        System.out.println("2 -  vc tem   :" + idade);
        System.out.println("3-   seu salario e  :" + salario);

        s.close();
    }
}
