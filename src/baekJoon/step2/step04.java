package baekJoon.step2;

public class step04 {

    public static void main(String[] args) {

        // 2단계 4번 문제 - 사분면 고르기 (커밋 테스트)

        int a = 9;
        int b = -13;

        if(a > 0 && b > 0){
            System.out.println("1");
        }else if(a > 0 && b < 0){
            System.out.println("4");
        }else if(a < 0 && b > 0){
            System.out.println("2");
        }else if(a < 0 && b < 0){
            System.out.println("3");
        }

    }

}
