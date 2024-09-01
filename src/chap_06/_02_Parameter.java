package chap_06;

public class _02_Parameter {

    public static void power(int number)
    { // number는 parameter, 매개변수 이다.
        int result=number*number;
        System.out.println(number+ "의 제곱은 "+result);
    }

    public static void powerByExp(int number, int exponent){
        int result=1;
        for (int i = 0; i < exponent; i++) {
            result*=number; // 첫번째 시행, 1에다가 number를 곱한다. number의 1승꼴이되버림
        }
        System.out.println(number+" 의 "+exponent+" 승은 "+ result);
    }

    public static void main(String[] args) {
        // 전달값, parameter
        // 2 -> 2*2
        // 3 -> 3*3
        power(3);


        powerByExp(2,5);
        powerByExp(3,0);
    }
}
