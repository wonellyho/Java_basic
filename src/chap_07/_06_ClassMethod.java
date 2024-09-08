package chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
//        BlackBox b1= new BlackBox();
//        b1.callServiceCenter();
//
//        BlackBox b2= new BlackBox();
//        b2.callServiceCenter();


        // 객체를 만들지 않은 상태에서도 호출이 가능하다.
        BlackBox.callServiceCenter();

        String s=String.valueOf(3); // 3 정수를 문자열로 바꾸는 메소드
    }
}
