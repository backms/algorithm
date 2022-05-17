package baekJoon.step1;

public class step13 {

    public static void main(String[] args) {

        // baekJoon 알고리즘 문제 (https://www.acmicpc.net/problem/2588)

        int firstNum = 472;
        int secondNum = 385;

        int secondLength1 = secondNum%1000/100;
        int secondLength2 = secondNum%100/10;
        int secondLength3 = secondNum%10;

        System.out.println(secondLength3 * firstNum);
        System.out.println(secondLength2 * firstNum);
        System.out.println(secondLength1 * firstNum);
        System.out.println(firstNum * secondNum);


    }
}
