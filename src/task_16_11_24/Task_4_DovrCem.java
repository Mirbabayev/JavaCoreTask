package task_16_11_24;

import java.util.Scanner;

public class Task_4_DovrCem {
    public static void main(String[] args) {
//İstifadəçidən eded daxil etməyi tələb edən proqram yazın. Proqram bütün ededlərin cəmini göstərəcək.
//İstifadəçi 0-a daxil olduqda proqram dayanır.dayandiqdan sonra cem gorunsun.

//meselen:
//Əlavə etmək üçün eded daxil edin (dayandırmaq üçün 0 daxil edin):
//eded daxil edin: 5
//eded daxil edin: 10
//eded daxil edin: -3
//eded daxil edin: 0
//Ümumi məbləğ: 12
        Scanner sc = new Scanner(System.in);
        var result = 0;
        var input = 0;
        var info = "Ededleri daxil edin: ";
        while (true) {
            System.out.print(info);
            input = sc.nextInt();
            result += input;
            if (input == 0) {
                System.out.println("-----------------");
                System.out.println("Ededlerin cemi: " + result);
                break;
            }
        }


    }
}
