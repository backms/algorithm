package baekJoon.step1;

public class step13 {

    public static void main(String[] args) {

        // 1단계 13번 문제

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
