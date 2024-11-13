package task_13_11_24;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var input = sc.nextInt();

        var printTrue = "Eded '4' ve '6' bolunur";
        var printFalse = "Eded '4' ve '6' bolunmur";
        var printFalse6 = "Eded '4' bolunur '6' bolunmur";
        var printFalse4 = "Eded '6' bolunur '4' bolunmur";


        if (input != 0) {
            if ((input % 4 == 0) && (input % 6 == 0)) {
                System.out.println(printTrue);

            } else if ((input % 4 == 0) && (input % 6 != 0)) {
                System.out.println(printFalse6);

            } else if ((input % 4 != 0) && (input % 6 == 0)) {
                System.out.println(printFalse4);
            } else {
                System.out.println(printFalse);
            }
        }

    }
}
