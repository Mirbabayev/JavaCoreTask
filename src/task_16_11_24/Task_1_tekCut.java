package task_16_11_24;

import java.util.Scanner;

public class Task_1_tekCut {
    public static void main(String[] args) {

//User 2 eded daxil etsin .Hemin ededler arasinda yerleşen  tek ve cut ededlerin sayini ve cemini tapin .

        Scanner sc = new Scanner(System.in);
        System.out.print("Baslangic: ");
        var num1 = sc.nextInt();
        System.out.print("Son: ");
        var num2 = sc.nextInt();
        System.out.print("Cut: ");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n-------------------");
        System.out.print("Tek: ");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }


    }
}

