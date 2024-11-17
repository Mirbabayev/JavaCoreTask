package task_17_11_24;

import java.util.Scanner;

public class Task_2_MinMax {
    public static void main(String[] args) {
//  array scanner ile doldur sonra min ve max tapin.
//  ekrana min ve max cixarin.
//  arr uzunluq arr[5]

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max deyer: " + max);

        System.out.println("-----------------------------");
        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("min deyer: " + min);


    }
}
