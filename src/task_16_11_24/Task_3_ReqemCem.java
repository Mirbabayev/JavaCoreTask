package task_16_11_24;

public class Task_3_ReqemCem {
    public static void main(String[] args) {
        var num = 1;
        var num2 = 0;
        do {
            num2 = num2 + num;
            num++;
        } while (num <= 10);
        System.out.println(num2);
    }
}
