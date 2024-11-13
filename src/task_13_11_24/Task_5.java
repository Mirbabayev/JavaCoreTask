package task_13_11_24;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ededleri daxil edin");
        var num1 = sc.nextDouble();
        var num2 = sc.nextDouble();
        System.out.println("Secim edin: \n" +
                "toplama - 1 \n" +
                "cixma - 2 \n" +
                "vurma - 3 \n" +
                "bolme - 4 ");
        var operation = sc.nextInt();
        var result = 0.0;
        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println(result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println(result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println(result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println(result);
                break;
            default:
                System.err.println("error operation");
        }


    }
}
