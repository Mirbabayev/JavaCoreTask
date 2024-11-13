package task_13_11_24;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var input = sc.nextInt();
        var divisionTrue3="3-e bolunur";
        var divisionTrue4="4-e bolunur";
        var divisionFalse="3-e ve 4-e bolunmur";
        if (input!=0){
            if (input % 3 == 0) {
                System.out.printf(divisionTrue3);
            } else if (input % 4 == 0) {
                System.out.println(divisionTrue4);
            }else {
                System.out.println(divisionFalse);
            }
        }

    }
}
