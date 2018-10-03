package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int section=0;
        do {
            //сделать удобное меню
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");

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

}