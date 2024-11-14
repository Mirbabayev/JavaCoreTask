package task_13_11_24;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {


        /*Düşününki magazadan aliş-veriş edirsiniz ve etdiyiniz alis-veris mebleginden asili olaraq size mueyyen endirimler olunur .
        Meselen 1 ve 300 azn araliginda  alis- veris etdiyiniz zaman size 5% endirim olunur .
        Mebleg atdiqca endirim faizlerinide artirin .
        Müşdəri esas mebleği daxil etsin ,endirim tetbiq edilsin ve ödeyeceyi mebleği gösdərin .
        Numune :
        Müşderi:56 azn
        Ödeyeceyiniz mebleğ: 53.2 azn*/

        Scanner sc = new Scanner(System.in);
        var inputPrice = sc.nextDouble();
        var endirim = (5.0 / 100) * inputPrice;
        var endirim2 = (8.0 / 100) * inputPrice;
        var endirim3 = (12.0 / 100) * inputPrice;

        var price = 0.0;
        if (50 <=inputPrice && inputPrice <= 150) {
            price = inputPrice - endirim;
            System.out.println("Endirim: " + endirim);
            System.out.println("Endirimli qiymet: " + price);

        } else if (150 < inputPrice && inputPrice <= 250) {
            price = inputPrice - endirim2;
            System.out.println("Endirim: " + endirim2);
            System.out.println("Endirimli qiymet: " + price);

        } else if (250 < inputPrice) {
            price = inputPrice - endirim3;
            System.out.println("Endirim: " + endirim3);
            System.out.println("Endirimli qiymet: " + price);
        } else {
            System.out.println("Endirim yoxdur !!!");
        }


    }
}
