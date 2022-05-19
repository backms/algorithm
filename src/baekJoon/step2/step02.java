package baekJoon.step2;

public class step02 {

    public static void main(String[] args) {

        // 2단계 2번 문제 - 시험 성적

        int score = 100;
        String grade = "";

        if(score >= 90){
            grade = "A";
        }else if(score >= 80 && score <= 89){
            grade = "B";
        }else if(score >= 60 && score <= 69){
            grade = "C";
        }

        System.out.println(grade);
    }
}
