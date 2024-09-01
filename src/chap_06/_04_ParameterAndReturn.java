package chap_06;

public class _04_ParameterAndReturn {

//    public static void power(int number)
//    { // number는 parameter, 매개변수 이다.
//        int result=number*number;
//        System.out.println(number+ "의 제곱은 "+result);
//    }

    public static int getpower(int number){
        int result=number*number;
        return result;
        // return number*number;
    }



//    public static void powerByExp(int number, int exponent){
//        int result=1;
//        for (int i = 0; i < exponent; i++) {
//            result*=number; // 첫번째 시행, 1에다가 number를 곱한다. number의 1승꼴이되버림
//        }
//        System.out.println(number+" 의 "+exponent+" 승은 "+ result);
//    }

    public static int getPowerByExp(int number, int exponent){

        // ctrl + alt+ L 위치 정렬해주는 단축키
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number; // 첫번째 시행, 1에다가 number를 곱한다. number의 1승꼴이되버림
        }
        return result;

    }



    public static void main(String[] args) {
        // 전달값과 반환값이 있는 함수
        int retVal=getpower(2); //2*2=4
        System.out.println(retVal);

        retVal=getpower(3);
        System.out.println(retVal); // 3*3=9

        retVal=getPowerByExp(3,3) ;
        System.out.println(retVal); // 3*3*3=27

        System.out.println(getPowerByExp(2,4)); // 2*2*2*2=16
    }
}
