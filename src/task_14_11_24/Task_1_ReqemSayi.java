package task_14_11_24;

import java.util.Scanner;

public class Task_1_ReqemSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var num = sc.nextInt();
        var num2 = 0;
        while (num != 0) {
            num = num / 10;
            num2++;

        }
        System.out.println("Daxil edilen eded " + "'" + num2 + "'" + " reqemlidir");
    }


}
