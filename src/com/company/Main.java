package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int section=0;
        do {
            //сделать удобное меню
            System.out.println("1. С помощью цикла вычислите значение выражения 2n");
            System.out.println("2. Составьте программу расчета факториала для произвольного\n" +
                    "числа n<10.");
            System.out.println("3. Даны два действительных числа. Необходимо получить их\n" +
                    "сумму, разность и произведение. Результат вывести на консоль.");
            System.out.println("4. Определить время свободного падения материального тела с\n" +
                    "заданной высоты h. Результат вывести в консоль.");
            System.out.println("5. Составьте программу для нахождения длины катета прямоугольного\n" +
                    "треугольника (b), если известны длины гипотенузы (c) и\n" +
                    "катета (a). Результат вывести на консоль.");

            System.out.println("Введите номер действия:");
            section = scan.nextInt();

            switch (section) {
                case 1:
                    Pow();
                    break;
                case 2:
                    Factorial();
                    break;
                case 3:
                    Numbers();
                    break;
                case 4:
                    Time();
                    break;
                case 5:
                    triangle();
                    break;


                default:
                    System.out.println("Неверное действие!!!");
                    break;
            }
        }while (true);

    }

    private static void Pow() {
        System.out.println("Введите c:");
        int i = 0;
        int res = 1;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 0; i < n; i++) {
            res = res * 2;

        }
        System.out.println(res);
    }

    private static void Factorial(){
        Scanner scan=new Scanner(System.in);

        int n=0;
        int res=1;
        System.out.println("Ввудите число, от которого необходимо вычислить факториал:");
        n=scan.nextInt();
        n++;
        for (int i = 1; i <n; i++) {
            res=res*i;
        }
        System.out.println("Факториал равен:"+res);
    }

    private static void Numbers(){
        Scanner scan=new Scanner(System.in);

        int number1=0;
        int number2=0;
        int sum=0;
        int differens=0;
        int composition=0;

        System.out.println("Введите первое число:");
        number1=scan.nextInt();
        System.out.println("Введите второе число:");
        number2=scan.nextInt();

        sum=number1+number2;
        differens=number1-number2;
        composition=number1*number2;

        System.out.println("Сумму равна:"+sum+
            "\nРазность равна:"+differens+
                "\nПроизведение равно:"+composition);

    }

    private static void Time(){
        Scanner scan=new Scanner(System.in);

        double time=0;
        double h=0;
        final double g=9.8;

        System.out.println("Введите высоту:");
        h=scan.nextDouble();

        time=Math.sqrt(2*h/g);

        System.out.println("Время свободного падения с высоты "+h+
            " равнa:"+time);

    }

    private static void triangle(){

        Scanner scan=new Scanner(System.in);

        double a=0;
        System.out.println("Введите катет a:");
        a = scan.nextDouble();
        double b=0;
        double c=0;
        System.out.println("Введите гипотенузу c:");
        c = scan.nextDouble();
            b=((c*c)-(a*a));
       // System.out.println("Катет равен:"b, Math.sqrt(double b));
        System.out.printf("sqrt(%.3f) = %.3f%n", b, Math.sqrt(b));
    }

}