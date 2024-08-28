package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s="I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and",",")); // " and"를 ","로 변환
        System.out.println(s.substring(7)); // 인덱스 기준 7부터 시작( I like 부분 삭제된다.) -> 결과가 반영되는 것은 아니다.
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); // substring( (시작인덱스),(끝인덱스) )
        // 시작위치는 시작부분을 포함하는데, 끝위치는 끝인덱스 바로 직전까지 출력한다.
        // Java and Python and C


        // 공백제거
        s="               I love Java.        ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞 뒤 공백 제거; I love Java.

        // 문자열 결합
        String s1= "Java";
        String s2= "Python";
        System.out.println(s1+s2);//JavaPython
        System.out.println(s1+", "+s2);//Java, Python
        System.out.println(s1.concat(",").concat(s2));
        // s1.concat(" , ")  . concat(s2) : s1문자열 뒤에 , 를 붙이고 그 뒤에 s2를 붙인다.
        // concat= concatenate(연결시키다)


    }
}
