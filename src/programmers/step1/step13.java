package programmers.step1;

public class step13 {

    public static void main(String[] args) {

        int firstNum = 472;
        int secondNum = 385;

        int firstLength1 = firstNum%1000/100;       // firstNum 의 세자릿 수
        int firstLength2 = firstNum%100/10;         // firstNum 의 두자릿 수
        int firstLength3 = firstNum%10;             // firstNum 의 세자릿 수

        int secondLength1 = secondNum%1000/100;
        int secondLength2 = secondNum%100/10;
        int secondLength3 = secondNum%10;

        int mul11 = secondLength3 * firstLength3;       // secondNum의 세자릿수 값 * firstNum의 세자릿 수 값
        int mul12 = secondLength3 * firstLength2;       // secondNum의 세자릿수 값 * firstNum의 두자릿 수 값
        int mul13 = secondLength3 * firstLength1;       // secondNum의 세자릿수 값 * firstNum의 첫자릿 수 값

        int mul21 = secondLength2 * firstLength3;       // secondNum의 두자릿수 값 * firstNum의 세자릿 수 값
        int mul22 = secondLength2 * firstLength2;       // secondNum의 두자릿수 값 * firstNum의 두자릿 수 값
        int mul23 = secondLength2 * firstLength1;       // secondNum의 두자릿수 값 * firstNum의 첫자릿 수 값

        int mul31 = secondLength1 * firstLength3;        // secondNum의 첫자릿수 값 * firstNum의 세자릿 수 값
        int mul32 = secondLength1 * firstLength2;        // secondNum의 첫자릿수 값 * firstNum의 두자릿 수 값
        int mul33 = secondLength1 * firstLength1;        // secondNum의 첫자릿수 값 * firstNum의 첫자릿 수 값

        int sum1 = mul11 + mul12 + mul13;
        int sum2 = mul21 + mul22 + mul23;
        int sum3 = mul31 + mul32 + mul33;

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum1+sum2+sum3);


    }
}
