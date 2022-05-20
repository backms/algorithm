package baekJoon.step2;

public class step03 {

    public static void main(String[] args) {

        // 2단계 3번 문제 - 윤년

        int year = 2000;
        int fourMul = year/4;
        int hundredMul = year/100;

        if(fourMul%10 == 0 && hundredMul%10 == 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }

}
