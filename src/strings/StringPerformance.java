package strings;

import javax.swing.*;

public class StringPerformance {
    public static void main(String[] args) {
        //stringPerformance();
        stringBuilderPerformance();
    }

    //n = 100000 -> 1250 ms
    private static void stringPerformance() {
        int n = 1000000;
        String s = "";

        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for String : " + (endTime - startTime));
    }

    private static void stringBuilderPerformance() {
        int n = 10000000;
        StringBuilder sb = new StringBuilder("");

        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for StringBuilder : " + (endTime - startTime));
    }
}
