package org.example;

public class Calc {

    public int summ(int a, int b){
        int result;
        result = a + b;
        System.out.println("Сумма " + a + " и " + b + " равна " + result);
        System.out.printf("Сумма %d и %d равна %d", a, b, result);
        return result;
    }
    public int minus(int a, int b){
        int result;
        result = a - b ;
        System.out.println("Число " + a + " минус " + b + " равна " + result);
        System.out.printf("Число %d и %d равна %d", a, b, result);
        return result;
    }
}
