package TP03;

import java.util.Scanner;

public class NombreSecret {

    public static void main(String args[]) {

        int secret = (int) (Math.random() * 1000);
        boolean found = false;
        int tries = 0;

        Scanner sc = new Scanner(System.in);

        while (! found) {
            System.out.print("Player " + (tries % 11 + 1) + " : ");
            int guess = sc.nextInt();
            if (guess < secret) {
                System.out.println("+");
            } else if (guess > secret) {
                System.out.println("-");
            } else {
                found = true;
            }
            tries++;
        }
        System.out.println("U guessed it ! Bravo ! Total tries : " + tries);
    }
}

