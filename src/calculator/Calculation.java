package calculator;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Toplama toplama=new Toplama();
        Cixma cixma=new Cixma();
        Bolme bolme =new Bolme();
        Vurma vurma =new Vurma();


        var result=toplama.toplama(sc.nextInt(), sc.nextInt());
        System.out.println("toplama "+result);
        var result2=cixma.cixma(sc.nextInt(), sc.nextInt());
        System.out.println("cixma "+result2);
        var result3=bolme.bolme(sc.nextDouble(), sc.nextDouble());
        System.out.println("bolme "+result3);
        var result4=vurma.vurma(sc.nextInt(), sc.nextInt());
        System.out.println("vurma "+result4);








    }
}
