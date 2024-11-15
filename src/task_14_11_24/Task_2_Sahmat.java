package task_14_11_24;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Task_2_Sahmat {
    public static void main(String[] args) {

//        Shahmat taxtasinin ilk xanasina 1 bugda, novbeti her xanaya evvelkinden 2 defe chox bugda qoyulur.
//        umumi 64 xana var. opshi neche eded bugda qoyulub?

        BigDecimal bugdaXanada =new BigDecimal("1") ;

        BigDecimal bugdaCem =new BigDecimal("1") ;
        BigDecimal artim=new BigDecimal("2");

        for (var i = 2; i <= 64; i++) {

            bugdaXanada = bugdaXanada.multiply(artim);

            bugdaCem = bugdaCem.add(bugdaXanada);


        }

        System.out.println(bugdaCem + " bugda denesi");


    }
}
