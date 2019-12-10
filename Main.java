package com.company;


import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long sum;
        String str = input.next();
        try {
            sum = Long.parseLong(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Сумма  \"" + str + "\" должна быть целым типом!!");
        }

        if (sum < 0) {
            System.out.print("Сумма должна быть неотрицательна");
            System.exit(0);
        }
        if (sum == 0) {
            System.out.print(0 + " Разбиения не существует поскольку сумма 0");
            System.exit(0);
        }

        int CountOfNominals = input.nextInt();
        long[] nominals = new long[CountOfNominals];
        for (int i = 0; i < CountOfNominals; i++) {
            String str1 = input.next();
            try {
                nominals[i] = Long.parseLong(str1);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Номинал  \"" + str1 + "\" должен быть целым типом!!");
            }
            if (nominals[i] <= 0) {
                System.out.print("Номиналы должны быть положительные ");
                System.exit(0);
            }
        }
        long[] counts = new long[CountOfNominals];
        System.out.println(printCombinations(nominals, counts, 0, sum));

        //  System.out.print(count(nominals, CountOfNominals, sum));
    }

    public static String str = "";
    public static long solution = 0;

    public static String printCombinations(long[] nominals, long[] counts, int startIndex, long totalSum) {
        if (startIndex >= nominals.length) {
            solution++;
            for (int i = 0; i < nominals.length; i++) {
                str += nominals[i] + "*" + counts[i] + "  ";
                // System.out.print(nominals[i] + "*" + counts[i] + "  ");
            }
            str += solution;
            // System.out.print(solution);
            str += "\n";
            //  System.out.println();
            return str;
        }
        if (startIndex == nominals.length - 1) {

            if (totalSum % nominals[startIndex] == 0) {
                counts[startIndex] = totalSum / nominals[startIndex];
                printCombinations(nominals, counts, startIndex + 1, 0);
            }
        } else {
            for (int i = 0; i <= totalSum / nominals[startIndex]; i++) {
                counts[startIndex] = i;
                printCombinations(nominals, counts, startIndex + 1, totalSum - nominals[startIndex] * i);
            }
        }
        return str;
    }

    //Красивая функция для количество способов
   /* static long count(long S[], int m, long n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (m <= 0 && n >= 1) {
            return 0;
        }
        return count(S, m - 1, n) + count(S, m, n - S[m - 1]);
    }*/
}

