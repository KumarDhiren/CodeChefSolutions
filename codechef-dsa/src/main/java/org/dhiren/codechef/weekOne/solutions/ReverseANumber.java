package org.dhiren.codechef.weekOne.solutions;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                int num = scanner.nextInt();
                for (int i = 0; i < num; i++) {
                    reverseNumber(scanner.nextInt());
                }
                return;
            }
        }
    }

    private static void reverseNumber(int number) {
        int rev = 0;
        if (number < 10)
            rev = number;
        else {
            while (number > 0) {
                rev = rev * 10 + number % 10;
                number = number / 10;
            }
        }
        System.out.println(rev);
    }

}
