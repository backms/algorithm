package baekJoon.step4;

import java.util.Random;
import java.util.Scanner;

public class Problem01 {

    public static void main(String[] args) {

        // 4단계 1번문제 - 최소,최대 구하기
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Random r = new Random();

        while(true){
            if(number >= 1 && number <= 1000000){
                int[] arr = new int[number];
                for(int i=0; i<number; i++){
                    arr[i] = r.nextInt(10)*1;
                    if(arr[i]<1000000 && arr[i]>1000000){
                        i--;
                    }
                    for(int j=0; j<i; j++){
                        if(arr[i]==arr[j]){
                            i--;
                        }
                    }
                }
                for(int i=0; i<number; i++){
                    System.out.printf(arr[i] + " \n");
                }

                break;
            }
            System.out.println("1이상, 1,000,000 이하의 수를 입력하세요.");
            number = sc.nextInt();
        }

    }

}
