package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4+2); // 6
        System.out.println(4-2); // 2
        System.out.println(4*2); // 8
        System.out.println(4/2); // 2
        System.out.println(5/2); // 2 정수끼리 연산이라 결과가 정수가 나온다.
        System.out.println(2/4); //0.5 ->0

        System.out.println(4%2); // 0 4를 2로 나눈 나머지
        System.out.println(5%2); // 1

        // 우선 순위 연산
        System.out.println(2 + 2*2); //6
        System.out.println((2+2)*2); //8
        System.out.println(2+(2*2)); //6

        // 변수를 이용한 연산
        int a=20;
        int b=10;
        int c;

        c=a+b;
        System.out.println(c); //30

        c=a-b;
        System.out.println(c); //10

        c=a*b;
        System.out.println(c); //200

        c=a/b;
        System.out.println(c); // 2

        c=a%b;
        System.out.println(c); //0

        // 증감연산 ++, --
        int val=10;
        System.out.println(val);
//        val=val+1;
//        val++;
//        ++val; // ++ 연산을 먼저하고 수행해라
        System.out.println(++val); //11
        System.out.println(val); // 11
        System.out.println(val++); // 11 출력을 하고, val이 12인 상태
        System.out.println(val); // 12

        val=10;
        System.out.println(val);
        System.out.println(--val); //9
        System.out.println(val); //9

        System.out.println(val--); //9 출력하고 나서 val=8인 상태
        System.out.println(val); //8

        // 은행 대기번호 표
        int waiting =0;

        System.out.println("대기 인원 : "+waiting++); // 대기인원: 0    , 1이 된상태
        System.out.println("대기 인원 : "+waiting++); // 대기인원: 1    , 2가 된 상태
        System.out.println("대기 인원 : "+waiting++); // 대기인원: 2    , 3이 된 상태
        System.out.println("총 대기인원: "+waiting); // 총 대기인원: 3


    }
}
