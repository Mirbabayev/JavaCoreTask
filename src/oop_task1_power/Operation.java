package oop_task1_power;

import java.util.Scanner;

public class Operation {
//User eded ve quvvet daxil etsin siz neticeni hesablayin.
//Bunu bir ayri method yardaraq yazin ve main methodunda cagirin .

    public double power(){
        Scanner sc =new Scanner(System.in);
        System.out.print("ededi daxil edin: ");
        var a= sc.nextDouble();
        System.out.print("quvveti daxil edin: ");
        var b= sc.nextInt();
        var number=1;
        for(int i=1;i<=b;i++){
           number*=a;
        }return number;
    }




}
