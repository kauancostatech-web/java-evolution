package Condicões;

import java.util.Scanner;

public class maioreigual {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("dIGITEB UM VALOLR DO N1  : ");
        int n1 = 900;
        n1 = s.nextInt();
        System.out.println("Digite o valor do n2");
        int n2 = 900;
        n2 = s.nextInt();

        if (n1 > n2) {
            System.out.println("n1 maior");
        } else if (n1 < n2) {
            System.out.println("n1 menor");
        } else {
            System.out.println("iguais");
        }
    }
}
