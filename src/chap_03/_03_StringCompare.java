package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1="Java";
        String s2="Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분없이 문자열 내용이 같은지 여부 체크

        //문자열 비교 심화
        s1="1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2="1234";
        System.out.println(s1.equals(s2)); //true (내용 비교) 중요!
        System.out.println(s1==s2); // true (참조 하는지 비교)

        // s1 메모지와 s2메모지는 서로 다른 곳을 참조한다. (서로 다른 곳에 데이터 존재)
        s1= new String("1234");
        s2= new String("1234");
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1==s2); // false
    }
}
