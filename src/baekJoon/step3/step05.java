package baekJoon.step3;

import java.util.Scanner;

public class step05 {

    public static void main(String[] args) {

        // 3단계 5번 문제 - n 찍기기
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while(true){
            if(number <= 100000){
                for(int i=1; i<=number; i++){
                    System.out.println(i);
                }
                break;
            }
            System.out.println("100,000 이하의 숫자를 입력하세요.");
            number = sc.nextInt();
        }


    }
}
