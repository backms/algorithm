package baekJoon.step6;

import java.util.Scanner;

public class Problem01 {

    public static void main(String[] args) {

        // 6단계 1번 문제 - 아스키 코드
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);

        int num = (int)ch;

        System.out.println(num);
    }

}
