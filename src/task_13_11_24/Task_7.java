package task_13_11_24;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
 /*  Proqram Tələbləri
    İstifadəçidən bir ədəd daxil etməsini xahiş et.
    Ədədin müsbət, mənfi yoxsa sıfır olduğunu yoxlamaq üçün if-else ifadələrindən istifadə et.
    Nəticəni çap et.
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin: ");
        var number = sc.nextDouble();
        if (number < 0) {
            System.out.println("Negative number");
        } else if (number>0) {
            System.out.println("Positive number");
        }else {
            System.out.println("Zero");
        }


    }
}
