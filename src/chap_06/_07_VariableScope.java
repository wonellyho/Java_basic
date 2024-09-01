package chap_06;

public class _07_VariableScope {
    public static void methodA(){
//        System.out.println(number);
//        System.out.println(result);
    }

    public static void methodB()
    {
        int result=1; // 지역변수: 변수가 선언된 영역 내에서만 사용할 수 있다. ( {중괄호} 안에서만 )
    }
    public static void main(String[] args) {
        int number=3;

//        System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);

        }
        // System.out.println(i);
        {
            int j=0;
            System.out.println(j);
            System.out.println(number); // main {} 안에서 number를 사용하는 것은 가능하다.
        }


    }
}
