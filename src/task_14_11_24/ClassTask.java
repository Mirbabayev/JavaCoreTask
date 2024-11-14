package task_14_11_24;

import java.util.Scanner;

public class ClassTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var b = sc.nextInt();
        var c = sc.nextInt();
        var d = 0;
        var a = sc.nextInt();
        if (a == 1) {
            d = b + c;
            System.out.println(d);
        } else if (a == 2) {
            d=b*c;
            System.out.println(d);
        }
    }


}
