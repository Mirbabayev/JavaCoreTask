package task_17_11_24;

import java.util.Scanner;

public class Task_4_TekrarlananEded {
    public static void main(String[] args) {
//array doldurursunuz scanner ile,user den bir eded isteyirsiz hemin ededin array de
// nece defe tekrarlandigini tapirsiniz.
//uzunlugu 5 olsun.arr[5]
//Enter 5 numbers:
//4
//5
//2
//3
//12
//Enter a number to count: 2

        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Ededleri daxil edin: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Yoxladiginiz deyer: ");
        var inNum = sc.nextInt();
        var count = 0;
        for (int i = 0; i < array.length; i++) {
            if (inNum == array[i]) {
                count++;
            }
        }
        System.out.println("Bu deyer " + count + " defe tekrarlanib");


    }
}
