package calculator;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Toplama toplama = new Toplama();
        Cixma cixma = new Cixma();
        Bolme bolme = new Bolme();
        Vurma vurma = new Vurma();
        String operation = sc.nextLine();

        var result = 0.0;
        if (operation.equals("+")) {
            result = toplama.toplama(sc.nextInt(), sc.nextInt());
            System.out.println("toplama " + result);
        } else if (operation.equals("-")) {
            result = cixma.cixma(sc.nextInt(), sc.nextInt());
            System.out.println("cixma " + result);

        } else if (operation.equals("*")) {
            result = vurma.vurma(sc.nextInt(), sc.nextInt());
            System.out.println("vurma " + result);

        } else if (operation.equals("/")) {
            result = bolme.bolme(sc.nextDouble(), sc.nextDouble());
            System.out.println("bolme " + result);

        } else {
            System.out.println("yanlis");
        }

//        var result=toplama.toplama(sc.nextInt(), sc.nextInt());
//        System.out.println("toplama "+result);
//        var result2=cixma.cixma(sc.nextInt(), sc.nextInt());
//        System.out.println("cixma "+result2);
//        var result3=bolme.bolme(sc.nextDouble(), sc.nextDouble());
//        System.out.println("bolme "+result3);
//        var result4=vurma.vurma(sc.nextInt(), sc.nextInt());
//        System.out.println("vurma "+result4);


    }
}
