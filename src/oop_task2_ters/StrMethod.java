package oop_task2_ters;

import java.util.Scanner;

public class StrMethod {
// User ad daxil etsin , netice olaraq adin tersi cap edilsin. Taskin hellini mothod yaradaraq edin .
// Yaratdiginiz methodu main methodunda cagiraraq isdifade edin .

    public static String tersCevir() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Metni daxil edin");
        var inputWord=sc.nextLine();
        String newWord="";
        for(int i =inputWord.length()-1;i>=0;i--){
            newWord=newWord+inputWord.charAt(i)+"";
        }
        return newWord;
    }


}
