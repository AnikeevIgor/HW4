package com.company;

public class Main {

    public static void main(String[] args) {
        //zadanie 1
        int i = 1;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (int n = 10; n > 0; n--) {
            System.out.print(n + " ");
        }
        //zadanie 2
        System.out.println();
        for (int f = 6; f <= 31; f += 7 )
        {
            System.out.println("Сегодня пятница " + f + "-е число");
        }
        //zadanie 3
        int b = 2022;
        int g = b-200;
        int c = b+100;
        for( ; g % 79 != 0; g++ ){
        }
        for (; g < c ;g = g + 79){
            System.out.println(g);
        }
    }
}
