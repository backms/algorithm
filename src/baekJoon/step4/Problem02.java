package baekJoon.step4;

import java.util.Scanner;

public class Problem02 {

    public static void main(String[] args) {

        // 4단계 2번 문제 - 최댓값
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[9];
        int bigNum = 0;
        int arrCnt = 0;

        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
            if(numbers[i] > 0 && numbers[i] <= 100){
                if(numbers[i] > bigNum){
                    bigNum = numbers[i];
                    arrCnt = i+1;
                }
            }else{
                i--;
            }
        }

        System.out.println("최대값 : " + bigNum + " , 순서 : " + arrCnt);

    }

}
