package baekJoon.step2;

public class step06 {

    public static void main(String[] args) {

        // 2단계 6번 문제 - 오븐 시계

        int hour = 23;
        int minute = 48;
        int timer = 25;
        int calcTimer = (minute + timer);

        if( calcTimer > 60 ){
            hour += calcTimer / 60;
            if(hour >= 24){
                hour -= 24;
            }
            minute = calcTimer % 60;
        }else {
            minute += timer;
        }

        System.out.println(hour);
        System.out.println(minute);
    }

}
