package classroomTask;

public class Task_16_11 {
    public static void main(String[] args) {


        int max=0;
        int[] arr= {2,34,56,7,9};
        for(int i=0;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }System.out.println(max);








//----------------------------------------------
//        var num1 = 246744;
//        var numYoxla = 7;
//        var numTeklik = 0;
//        var count = 0;
//        while (num1 != 0) {
//            numTeklik = num1 % 10;
//            if (numYoxla == numTeklik) {
//                count++;
//            }
//            num1 = num1 / 10;
//        }
//        System.out.println(count);


//----------------------------------------------

//        var num = 24;
//        var say = 0;
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                System.out.print(i+" ");
//                say++;
//            }
//        }
//        System.out.println("\n----------");
//        System.out.println(say);
//----------------------------------------------

//        for (int i = 0; i < 4; i++) {
//            System.out.println("*");
//            System.out.println("#");
//        }

//        for (int i = 0; i < 6; i++) {
//
//            for (int j = 0; j < i; j++) {
//
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }

//        for (int i = 0; i < 4; i++) {
//            System.out.print("*");
//            for (int j = 0; j < 4; j++) {
//                System.out.print(" ");
//            }
//            System.out.println("*");
//        }
//* # *
//        for (int i = 0; i < 4; i++) {
//            System.out.print("*");
//            for (int j = 1; j <= 3; j++) {
//                if (j % 2 == 0) {
//                    System.out.print("#");
//                    continue;
//                }System.out.print(" ");
//
//            }System.out.println("*");
//        }


    }
}