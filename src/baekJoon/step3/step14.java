package baekJoon.step3;

import java.util.Scanner;

public class step14 {

    public static void main(String[] args) {

        // 3단계 14번 문제 - 더하기 싸이클
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int first, second, count = 0;
        int tmpNumber = 0;
        int orgNumber = 0;

        while(true){
            if(number >= 0 && number <= 99){        // 1. 0이상 99이하의 정수
                orgNumber = number;
                System.out.println("origen : " + orgNumber);
                while(true){

                    if(number < 10){                    // 2. 숫자가 한자리수일경우 x10
                        number *= 10;
                        System.out.println("number * 10 : " + number);
                    }

                    tmpNumber = number;
                    first = tmpNumber/10;
                    second = tmpNumber%10;
                    System.out.println("first : " + first);
                    System.out.println("second : " + second);
                    number = (second*10) + ((first+second)%10);
                    System.out.println("number : " + number);
                    count++;
                    if(orgNumber == number) {
                        System.out.println(count);
                        break;
                    }
                }
                break;

            }else {
                System.out.println("0이상 99이하의 정수를 입력하세요.");
                number = sc.nextInt();
            }
        }

    }

}
