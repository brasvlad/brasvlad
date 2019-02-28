package geekbrains.course1.lesson1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 50;
        int b = 67;
        int c = 10;
        int d = 2;
        int e = 15;
        int f = 5;
        String name = "Vladislav";

        res (a,b,c,d);
        compareSumEF(e,f);
        number();
        number2();
        name(name);


    }

    public static void res (int a,int b, int c, int d) {
        int res;
        res = a * (b + (c / d));
        System.out.println("Результат: " + res);
    }

    public static void compareSumEF (int e, int f) {
        int res;
        res = e + f;
        if (res > 10 && res <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static void number (){
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    public static void number2 (){
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int numberYour = scanner.nextInt();
        boolean number = numberYour >= 0 ? true : false;
        return;
    }

    public static void name (String name){
        System.out.println("Добрый день, " + name);
    }


}
