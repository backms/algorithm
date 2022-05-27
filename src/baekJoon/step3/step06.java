package baekJoon.step3;

import java.util.Scanner;

public class step06 {

    public static void main(String[] args) {

        // 3단계 7번 문제 - N 거꾸로 찍기
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while(true){
            if(number <= 100000){
                for(int i=0; i<number; i++){
                    System.out.println(number-i);
                }
                break;
            }
            System.out.println("100,000 이하의 정수를 입력하세요.");
            number = sc.nextInt();
        }

    }

}
