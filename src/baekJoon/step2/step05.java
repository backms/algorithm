package baekJoon.step2;

public class step05 {

    public static void main(String[] args) {

        // 2단계 5번 문제 - 알람 시계
        int hour = 9;
        int minute = 25;

        int calcMinute = minute - 45;   // 0이하면 hour -1

        if (calcMinute < 0){
            if(hour > 0){       // hour 가 0 일경우 알람시간(45)에 의해 23로 수정
                hour -= 1;
            }else{
                hour = 23;
            }
            minute = 60 + calcMinute;
        }else {
            minute = calcMinute;
        }

        System.out.println(hour);
        System.out.println(minute);

    }

}
