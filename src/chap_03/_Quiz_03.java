package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String s="930215-1234567";
        System.out.println(s.substring(0,8)); // 0 위치부터 8위치 직전까지


        // 방법2 하이푼 위치 찾아서 처리하기
        System.out.println(s.substring(0,s.indexOf("-")+2)); // 0위치 부터 하이푼+2 위치 직전까지
    }
}
