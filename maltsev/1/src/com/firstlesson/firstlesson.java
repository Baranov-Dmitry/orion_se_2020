package com.firstlesson;

import java.util.Scanner;

public class firstlesson {

    public static void main(String[] args) {

        System.out.println("Введите число 1: ");

        Scanner in = new Scanner(System.in);
        int in1 = in.nextInt();

        System.out.println("Введите число 2: ");
        int in2 = in.nextInt();

        String output = String.format("Число %s больше %s", Math.max(in1,in2), Math.min(in1,in2));
        System.out.println(output);

        System.out.println(in1 + in2    );

    }

}
