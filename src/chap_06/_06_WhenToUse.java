package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number){ // 제곱해주는 함수
//        int result=number*number;
//        return result;
        // return number*number;

        //메소드 안에 또 다른 메소드 호출 가능
        return getPower(number,2); // 아래정의된 함수를 이용하여 값반환
    }

    public static int getPower(int number, int exponent){

        // ctrl + alt+ L 위치 정렬해주는 단축키
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number; // 첫번째 시행, 1에다가 number를 곱한다. number의 1승 꼴이되버림
        }
        return result;

    }

    public static void main(String[] args) {
        // 메소드 필요 이유

        // 2의 2승을 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2; //
        }
        System.out.println(result);

        // 3의 3승을 구하기
        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3; //
        }
        System.out.println(result);

        // 4의 2승을 구하기
        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4; //
        }
        System.out.println(result); // 4*4


        // 함수사용
        System.out.println(getPower(4,2));
        System.out.println(getPower(3,3));
        System.out.println(getPower(5,2));
    }
}
