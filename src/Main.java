public class Main {
    public static void main(String[] args) {

        //Задача 1//
        System.out.println("Task 1");
        for ( int q = 1; q <= 10; q ++) {
        System.out.println(q);}
        //Задача 2//
        System.out.println("Task 2");
        for (int q = 10; q > 0; q = q -1) {
        System.out.println(q);
        }
        //Задача 3//
        System.out.println("Task 3");
        for (int q = 2; q <=17; q = q + 2) {
            System.out.println(q);
        }
        //Задача 4//
        System.out.println("Task 4");
        for (int q = 10; q >= -10; q = q - 1) {
            System.out.println(q);
        }
        //Задача 5//
        System.out.println("Task 5");
        for (int q = 1904; q <= 2096; q = q + 4) {
            System.out.println(q + " год является високосным");
        }
        //Задача 6//
        System.out.println("Task 6");
        for (int q = 7; q < 100; q = q + 7){
            System.out.println(q);
        }
        //Задача 7//
        System.out.println("Task 7");
        for (int q = 1; q < 600; q = q * 2){
            System.out.println(q);
        }
        System.out.println("Task 8");
        //Задача 8//
        int money = 29000;
        int moneyTotal = 0;
        for (int i = 1; i<=12; i++){
            moneyTotal = moneyTotal + money;
            System.out.println("Месяц " + i +" сумма накоплений равна " + moneyTotal + " рублей");
        }

        //Задача 9//
        System.out.println("Task 9");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i<=12; i++) {
            total = total + total/100*12;
            total = total + money;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        //Задача 10//
        System.out.println("Task 10");
        int number = 2;
        for (int i=1; i<11; i++){
            System.out.println(number * i);

        }

    }
}