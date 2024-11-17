package task_17_11_24;

import java.util.Scanner;

public class Task_1_Array {
    public static void main(String[] args) {
// array elementlerin scannerle daxil edin sonra onlari bir setirde cap edin
// arr uzunlugu 5 olsun yeni array[5].

        Scanner sc=new Scanner(System.in);
        int[] number=new int[5];
        for (int i=0;i<number.length;i++){
            number[i]= sc.nextInt();
        }
        for (int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }





    }
}
