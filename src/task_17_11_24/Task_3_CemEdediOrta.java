package task_17_11_24;

import java.util.Scanner;

public class Task_3_CemEdediOrta {
    public static void main(String[] args) {
//scanner ile uzunlugu 5 olan array yaz,ededlerin cem cap et ve ededi ortasin.(sum ve average).
//numune
//Enter 5 numbers:
//5 7 8 9 4
//Sum: 33
//Average: 6.6

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        var cem = 0;
        double edediOrta = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            cem += arr[i];
            edediOrta = (double) cem / arr.length;
        }
        System.out.println("ededlerin cemi: " + cem);
        System.out.println("ededi orta: " + edediOrta);

    }
}
