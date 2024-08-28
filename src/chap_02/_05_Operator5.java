package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항연산자
        // 결과를 담는 변수 == (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x=3;
        int y=5;
        int max =(x>y) ? x : y; // x가 y보다 큰 조건이 참일때, x가 결과값 , 거짓일 때 결과값 y
        System.out.println(max); // 5

        int mim=(x<y) ? x: y; // x=5, y=3 인 경우나, x=3,y=5 인 경우 둘 중 작은 값이 나온다.
        System.out.println(mim); // 3

        boolean b=(x==y)? true : false;
        System.out.println(b);// false

        String s=(x!=y)? "달라요":"같아요";
        System.out.println(s); // 달라요
    }
}
