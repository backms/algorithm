package baekJoon.step3;

import java.util.Scanner;

public class step01 {

    public static void main(String[] args) {

        // 3단계 1번 문제 - 구구단
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i=1; i<=9; i++){
            System.out.println(number + " * " + i + " = " + number*i);
        }

    }

}
