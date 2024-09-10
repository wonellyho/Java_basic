package chap_01;

import com.sun.org.apache.xpath.internal.objects.XString;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자, 숫자 사용가능(공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 문자는 제외)
        // 6. 예약어 사용 불가(public, static, void, int, double ,...)

        // 입국 신고서(여행)
        String nationality="대한민국"; // 국적
        String firstName="현성"; // 이름
        String lastName="김"; // 성
        String dateOfBirth = "2001-12-31"; // 생년월일
        String residentialAddress="무슨 호텔"; //체류지
        String purposeOfVisit="관광"; // 입국목적
        String flightNo="KE657"; // 항공편명
        String _flightNo="KE657"; // 밑줄로 시작하기
        String flight_no_2="KE657"; // 밑줄과 숫자 포함
//        String -flightNo="KE433"; // - 하이푼으로 시작안돼

        int accompany=2; // 동반가족수
        int lengthOfStay=5; // 체류기간

        String item1 ="시계";
        String item2 ="가방";
//        String 3item="돈"; // 숫자로 시작하는거 안된다.

        // 프로그램 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않을 떄)
        int i=0;
        String s="";
        String str="";

        // 절대변하지 않는 상수는 대문자로 쓴다.
        // 자료형 앞에 final 을 넣어서 상수임을 선언
        final String CODE="KR";
/*        CODE="US"; // 안된다.*/



    }
}
