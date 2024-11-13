package task_13_11_24;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
  /*Proqram Tələbləri
    İstifadəçidən 1-dən 7-ə qədər bir ədəd daxil etməsini xahiş et.
    Switch ifadəsindən istifadə edərək həftənin gününü çap et (1 - Bazar ertəsi, 2 - Çərşənbə axşamı və s.).
  */
//        Bazar ertəsi
//        Çərşənbə axşamı
//        Çərşənbə
//        Cümə axşamı
//        Cümə
//        Şənbə
//        Bazar


        Scanner sc = new Scanner(System.in);
        System.out.println("1-7 arasi secim edin: ");
        var num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Bazar ertəsi");
                break;
            case 2:
                System.out.println("Çərşənbə axşamı");
                break;
            case 3:
                System.out.println("Çərşənbə");
                break;
            case 4:
                System.out.println("Cümə axşamı");
                break;
            case 5:
                System.out.println("Cümə");
                break;
            case 6:
                System.out.println("Şənbə");
                break;
            case 7:
                System.out.println("Bazar");
                break;
                default:
                    System.err.println("error");


        }

    }
}
