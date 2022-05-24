package baekJoon.step2;

public class step07 {

    public static void main(String[] args) {

        // 2단계 7번 문제 - 주사위 세개
        int first = 2;
        int second = 2;
        int third = 2;
        int temp = 0;

        boolean firstSecond = (first == second);
        boolean firstThird = (first == third);
        boolean secondThird = (second == third);

        if(firstSecond && firstThird && secondThird){       // 세개의 수가 모두 같을 때
            System.out.println(10000 + (first*1000));
        }else if(firstSecond) {                             // 두개의 수가 같을 때
            System.out.println(1000 + (first*100));
        }else if(firstThird) {
            System.out.println(1000 + (first*100));
        }else if(secondThird) {
            System.out.println(1000 + (second*100));
        }else {                                             // 세개의 수가 모두 다를 때
            // 세 숫자 중 가장 큰 수 구하기
            if(first >= second){
                temp = first;
            }else if(second >= third){
                temp = second;
            }else {
                temp = third;
            }
            System.out.println( temp*100 );
        }

    }

}
