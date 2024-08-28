package chap_01;

public class _03_variables
{
    public static void main(String[] args) {
        String name; // name이라는 문자열 변수를 String을 통해서 선언
        name="나도코딩";
        int hour=15;
        //String name="나도코딩";

        System.out.println( name + "님, 배송이 시작됩니다. "+ hour + "시에 방문예정입니다.");
        //나도코딩님, 배송이 시작됩니다. 15시에 방문예정입니다.
        System.out.println("나도코딩님, 배송이 완료되었습니다.");

        double score=90.5;

        // 한 글자인 글자는 작은 따옴표로 대입해야한다.
        char grade='A';
        name="강백호";
        System.out.println(name+"님의 평균 점수는 "+score+"점 입니다.");
        System.out.println("학점은 "+grade+"입니다.");

        //boolean변수도 선언이 가능하다.
        boolean pass = true;
        System.out.println("이번 시험에 합격 했을까? "+pass);

        double d=3.14123456789;

//        float f=3.14; : 빨간줄뜬다. 3.14와 같은 기본 실수를 더 정교한 double 자료형으로 인식하기 떄문에
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

//        int i=1000000000000; // 일반 int는 +- 21억까지만 넣을 수 있다.
        long l =1000000000000L; // long 자료형은 정수 뒤에 l 또는 L을 넣는다.
        l= 1_000_000_000_000L; // _로 자릿수 구분해 줘도 똑같이 출력된다.
        System.out.println(l);

//        int, long, float, double, char, String, boolean
//                float vs double: 더 정확한 소수점 자리가 필요할때 double을 쓴다.
    }
}
