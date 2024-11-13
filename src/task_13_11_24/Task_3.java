package task_13_11_24;

import java.util.Scanner;

public class Task_3 {
    //    Imtahan balini  telebe daxil  etsin  ,topladiği bala esasen aldigi neticeni gosderin .
    //    Numune : telebenin daxil etdiyi bal :51     * Netice :E

//    Qiymət (0-100)	Qiymət Sırası
//    81 - 100	A
//    61 - 80	B
//    41 - 60	C
//    21 - 40	D
//    0 - 20	F

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0-100 arasi qiymet daxil edin");
        var input = sc.nextInt();

        if (input >= 0) {
            if (81 <= input && input <= 100) {
                System.out.println(input + " bal : A");
            } else if (61 <= input && input <= 80) {
                System.out.println(input + " bal : B");
            } else if (41 <= input && input <= 60) {
                System.out.println(input + " bal : C");
            } else if (21 <= input && input <= 40) {
                System.out.println(input + " bal : D");
            } else {
                System.out.println(input + " bal : f");
            }
        }


    }
}
