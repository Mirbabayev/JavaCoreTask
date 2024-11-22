package family;

import java.util.Scanner;

public class RunClass {
    public static void main(String[] args) {

//array-e elave etmek ve silmek
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 13;
        arr[2] = 14;
        arr[3] = 15;
        arr[4] = 16;
        int[] arr2 = new int[6];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]= sc.nextInt();
            arr=arr2;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
