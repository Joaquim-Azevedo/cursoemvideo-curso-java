package com.joaquim.estudos.fibonacci;

/* 
* Fibonacci é uma sequência que começa com 0 e 1 e 
* os números subsequentes são a 
* soma do atual com o anterior.
*/
public class Fibonacci {
    public static void main(String[] args) {
        long xNum = 0;
        long yNum = 1;
        long zNum = xNum + yNum;

        System.out.println("1: " + xNum);
        System.out.println("2: " + yNum);
        for (int i = 0; i < 99; i++) {
            xNum = yNum;
            yNum = zNum;

            System.out.print((i + 2) + ": ");
            System.out.println(zNum);

            zNum = xNum + yNum;
        }
    }
}
