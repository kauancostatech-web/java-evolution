package Condicões;

import java.util.Scanner;

public class MaiorOuMenorDeidade {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("Digite a sua idade ");
        int idade = s.nextInt();

        if (idade >=18 ) {
            System.out.println(" Voce é maior de idade :");
        }  else   {
            System.out.println("vc nao é maior de idade ");
        }
        s.close();

    }
}

