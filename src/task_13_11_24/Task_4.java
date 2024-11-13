package task_13_11_24;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
//        İsdifadeci ayi daxil etsin hansi fesil olduğu çap edilsin .
//        Numune :
//        User'in daxil etdiyi ay  --> Yanvar
//        Netice ---> Qış fesli
        System.out.println("Aylari daxil edin");
        Scanner sc = new Scanner(System.in);
        var month = sc.nextLine();
        switch (month) {
            case "Mart",
                 "Aprel",
                 "May":
                System.out.println(month + " ayi Yaz aylarindandir");
                break;
            case "İyun",
                 "İyul",
                 "Avqust":
                System.out.println(month + " ayi Yay aylarindandir");
                break;
            case "Sentyabr",
                 "Oktyabr",
                 "Noyabr":
                System.out.println(month + " ayi Payiz aylarindandir");
                break;
            case "Dekabr",
                 "Yanvar",
                 "Fevral":
                System.out.println(month + " ayi Qis aylarindandir");
                break;
                default:
                    System.out.println("Bele bir ay yoxdur !!!");

        }


    }
}
