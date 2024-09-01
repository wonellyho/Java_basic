package chap_06;

public class _05_Overloading {

    public static int getPower(int number){
        int result=number*number;
        return result;
        // return number*number;
    }

    public static int getPower(String strNumber){
        int number=Integer.parseInt(strNumber);  // 정수형으로 형변환
        return number*number;
    }

    public static int getPower(int number, int exponent){

        // ctrl + alt+ L 위치 정렬해주는 단축키
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number; // 첫번째 시행, 1에다가 number를 곱한다. number의 1승꼴이되버림
        }
        return result;

    }




    public static void main(String[] args) {
        // 메소드 오버로딩
        // 똑같은 이름의 메소드를 선언할 수 있다.
        // 1. 전달값의 자료형이 다르거나
        // 2. 전달값의 개수가 다르든가 상관없다.
        // 3. 반환형이 다른형태로는 안돼!!
        System.out.println(getPower(3)); // 위에선 정수전달
//        System.out.println(getPowerStr("4"));
        System.out.println(getPower("4")); // 아래는 문자열전달

        System.out.println(getPower(3,3)); //3*3*3=27








    }
}
