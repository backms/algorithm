package baekJoon.step6;

import java.util.Scanner;

public class Problem02 {

    public static void main(String[] args) {

        // 5단계 2번문제 - 숫자의 합
        Scanner sc = new Scanner(System.in);
        int num;
        String str;
        char ch;
        int sum = 0;

        num = sc.nextInt();
        sc.nextLine();
        str = sc.nextLine();

        while(true){
            if(str.length() <= num){
                for(int i=0; i<str.length(); i++){
                    ch = (char)str.charAt(i);
                    sum += Character.getNumericValue(ch);
                }
                System.out.println("sum : " + sum);
                break;
            }
            System.out.println("입력한 숫자이상으로 문자열을 입력할 수 없습니다.");
            str = sc.nextLine();
        }


    }

}
