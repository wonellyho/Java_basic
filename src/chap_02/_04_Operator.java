package chap_02;

public class _04_Operator {
    public static void main(String[] args) {

        // 논리연산자
        boolean 김치찌개=true;
        boolean 계란말이=true;
        boolean 제육볶음=false;

        System.out.println(김치찌개||계란말이||제육볶음); // 하나라도 true일때
        System.out.println(김치찌개 && 계란말이 && 제육볶음); //모두 true 일때

        //And연산
        System.out.println(5>3 && 3>1); // 5는 3보다 코드, 3은 1보다 크다.
        System.out.println(5>3 && 3<1); //5는 3보다 크고, 3은 1보다 작다.

        //Or 연산
        System.out.println(5>3 || 3>1); //5는 3보다 크거나, 3은 1보다 크다.
        System.out.println((5>3) || (3<1)); //앞식은 참 , 뒤식은 거짓 , 괄호 있어도 되고 없어도됨
        System.out.println(5<3 || 3<1); //5는 3보다 작거나, 3은 1보다 작다. false


        // System.out.println(1<3<5); // 이런 연속 비교연산은 안된다.

        // 논리 부정 연산자
        System.out.println(!true);// false
        System.out.println(!false); // true
        System.out.println(!(5==5)); //false
        System.out.println(!(5==3)); //true
    }
}
