package calculator;

import java.util.Scanner;

public class SocksCalculation {
    static int count = 0;


    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Eneter the number of socks you have");
        int number = in.nextInt();
        int pair[] = new int[number];
        System.out.println("Enter the types of socks");
        for (int i = 0; i < number; i++) {

            pair[i] = in.nextInt();


        }


        for (int i = 0; i < number; i++) {
            for (int j = i; j < number; j++) {
                if (pair[i] < pair[j]) {
                    int temp = pair[j];
                    pair[j] = pair[i];
                    pair[i] = temp;

                }
            }
        }


        for (int i = 0; i < number; i++) {

            System.out.println(pair[i]);


        }

        System.out.println("count= " + count);
    }
}
