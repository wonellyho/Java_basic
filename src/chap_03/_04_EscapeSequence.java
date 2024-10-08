package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자(Escape Sequence, Escape Character, special Character)
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");


        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t: tab
        // 해물파전     9000원
        // 김치전      8000원
        // 부추전      8000원
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        // \\: 역슬래쉬 자체 출력하고 싶을 떄
        System.out.println("C:\\Program Files\\Java");


        // \": 큰따옴표
        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\"이라고 했어요");

        // \' : 작옴따옴표
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요"); // 똑같이 출력된다.

        char c='A';
//        c=''';
        // 작음 따옴표 안에 ' 를 넣고 싶을때
        c='\'';
        System.out.println(c);
    }
}
