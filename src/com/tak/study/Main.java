package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //두 수 입력받음
        int a = sc.nextInt();
        int b = sc.nextInt();

        //수 뒤집음
        a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
        b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());

        System.out.print(a > b ? a : b);

    }

}
