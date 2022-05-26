package baekJoon.step3;

import java.util.Scanner;

public class step03 {

    public static void main(String[] args) {

        // 3단계 3번 문제 - 합
        Scanner sc = new Scanner(System.in);
        System.out.println("1이상 10000이하 정수를 입력하세요.");
        int number = sc.nextInt();
        int sum = 0;

        while(true){
            if(number <= 10000 || number <= 1){
                for(int i=1; i<=number; i++){
                    sum += i;
                }
                System.out.println("sum : " + sum);
                break;
            }
            System.out.println("1이상 10000이하 정수를 입력하세요.");
            number = sc.nextInt();

        }

    }

}
