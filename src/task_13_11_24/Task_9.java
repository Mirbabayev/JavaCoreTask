package task_13_11_24;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

//        1.bir il daxil edin.
//        2.İlin fevral ayi 29 olan ildirmi
//        3.Uzun ildir ve ya deyil çap edilsin

        Scanner sc = new Scanner(System.in);
        System.out.println("Ili daxil edin: ");
        var year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("uzun ildir");
            } else if (year % 100 == 0 && year % 400 == 0) {
                System.out.println("uzun ildir");

            } else {
                System.out.println("uzun il deyildir");
            }
        } else {
            System.out.println("uzun il deyildir");
        }


    }
}
