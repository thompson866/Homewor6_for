public class Main {
    public static void main(String[] args) {

        //Задача 1//
        System.out.println("Task 1");
        for (int q = 1; q <= 10; q++) {
            System.out.println(q);
        }
        //Задача 2//
        System.out.println("Task 2");
        for (int q = 10; q > 0; q--) {
            System.out.println(q);
        }
        //Задача 3//
        System.out.println("Task 3");
        for (int q = 2; q <= 17; q = q + 2) {
            System.out.println(q);
        }
        //Задача 4//
        System.out.println("Task 4");
        for (int q = 10; q >= -10; q--) {
            System.out.println(q);
        }
        //Задача 5//
        System.out.println("Task 5");
        for (int q = 1904; q <= 2096; q = q + 4) {
            System.out.println(q + " год является високосным");
        }
        //Задача 6//
        System.out.println("Task 6");
        for (int q = 7; q < 100; q = q + 7) {
            System.out.println(q);
        }
        //Задача 7//
        System.out.println("Task 7");
        for (int q = 1; q < 600; q = q * 2) {
            System.out.println(q);
        }
        System.out.println("Task 8");
        //Задача 8//
        int money = 29000;
        int moneyTotal = 0;
        int months = 12;
        for (int month = 1; month <= months; month++) {
            moneyTotal = moneyTotal + money;
            System.out.println("Месяц " + month + " сумма накоплений равна " + moneyTotal + " рублей");
        }

        //Задача 9//
        System.out.println("Task 9");
        double totalPercent = 0;
        double percent = 0.01;
        for (int month = 1; month <= months; month++) {
            totalPercent = totalPercent + money + (totalPercent * percent);

            System.out.println("Месяц " + month + " сумма накоплений равна " + totalPercent + " рублей");
        }

        //Задача 10//
        System.out.println("Task 10");
        int number = 2;
        for (int num = 1; num < 11; num++) {
            System.out.printf("%d * %d = %d%n", number, num, number * num);
        }
    }
}