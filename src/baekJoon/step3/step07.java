package baekJoon.step3;

import java.util.Scanner;

public class step07 {

    public static void main(String[] args) {

        // 3단계 7번 문제 - 별찍기
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i=1; i<=number; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
