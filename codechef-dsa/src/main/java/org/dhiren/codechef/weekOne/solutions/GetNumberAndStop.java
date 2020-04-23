package org.dhiren.codechef.weekOne.solutions;

import java.util.Scanner;

public class GetNumberAndStop {

    private static final int NUMBER_TO_STOP = 42;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                int num = scanner.nextInt();
                if (num == NUMBER_TO_STOP) {
                    return;
                }
                System.out.println(num);
            }
        }
    }
}
