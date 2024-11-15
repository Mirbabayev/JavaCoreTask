package task_14_11_24;

import java.util.Scanner;

public class Task_3_Bosluq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var num = sc.nextInt();

        var qaliq = 0;
        var tam = 0;

        if (num > 9 && num < 100) {
            tam = num / 10;
            qaliq = num % 10;
            System.out.println(tam + " - " + qaliq);
        } else {
            System.err.println("Eded iki reqmli deyil !!!");
        }

    }
}
