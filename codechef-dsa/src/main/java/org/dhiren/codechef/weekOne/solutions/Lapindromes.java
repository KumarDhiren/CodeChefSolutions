package org.dhiren.codechef.weekOne.solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Lapindromes {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                int num = scanner.nextInt();
                for (int i = 0; i < num; i++) {
                    testLaptindromes(scanner.next());
                }
                return;
            }
        }
    }

    private static boolean containsSpecialCharacters(String test) {
        Pattern pattern = Pattern.compile("[a-zA-Z]*");
        return pattern.matcher(test).matches();
    }

    private static void sameFrequencyAndEqual(String str1, String str2) {
        char[] chars = str1.toCharArray();
        char[] chars1 = str2.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        String first_half = new String(chars);
        String second_half = new String(chars1);
        System.out.println(first_half.contentEquals(second_half) ? "YES" : "NO");
    }

    private static void testLaptindromes(String text) {
        String first_half, second_half;
        final int length = text.length();
        if (containsSpecialCharacters(text)) {
            System.out.println("NO");
        } else {
            if (length % 2 == 0) {
                first_half = text.substring(0, length / 2);
                second_half = text.substring(length / 2);
            } else {
                first_half = text.substring(0, length / 2);
                second_half = text.substring(length / 2 + 1);
            }
            sameFrequencyAndEqual(first_half, second_half);
        }
    }
}
