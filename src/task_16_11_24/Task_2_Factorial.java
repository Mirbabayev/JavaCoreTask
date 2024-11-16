package task_16_11_24;

import java.util.Scanner;

public class Task_2_Factorial {
// 1.scannerden 1 eded daxil edirik
// 2.ededlerin hasilin tap
// 3.neticeni cap edin
// ve sonsuz olsun tekrar tekrar eded daxil etmeyi istesin eger dayandirmaq isteyirikse -1 daxil etmeyimizi istesin
// meselen: 4 daxil edirik  24

    public static void main(String[] args) {
        System.out.print("Ededi daxil edin: ");
        Scanner sc = new Scanner(System.in);
        var factorial = sc.nextInt();
        var result=1;
        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }
        System.out.println(result);

    }


}
