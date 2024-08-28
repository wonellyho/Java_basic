package chap_01;

public class _07_TypeCasting {
        public static void main(String[] args) {
            // 형변환: TypeCasting
            // 정수형에서 실수형으로
            // 실수형에서 정수형으로

            // int to float,double
            int score=93;
            System.out.println(score); //93
            System.out.println((float) score); //93.0
            System.out.println((double) score); //93.0

            //float, double to int
            float score_f=93.7f; //93
            double score_d=93.8;
            System.out.println((int)score_f); //93
            System.out.println((int)score_d); //93

            // 정수+실수 연산
            // score는 위에서 int로 선언했다.
            score=93+(int)98.9; // 93+98
            System.out.println(score);

            score_d=93+93.8; // score_d를 실수형 자료형으로 먼저 선언했었다.  앞에 93은 자동으로 (double) 93이 된다.
            score_d=(double)93 +93.8;
            System.out.println(score_d); //186.8

            // 변수에 형변환된 데이터 집어넣기
            double convertedScoreDouble=score; //191->191.0

            // int -> long -> float -> double (자동 형변환)

//            int convertedScoreInt=score_d; //186.8-> 186, 정수에서 실수로 그냥 변환은 안된다.
            int convertedScoreInt=(int)score_d; //186.8-> 186

            //double -> float ->long ->int ( 수동 형변환 )

            // 숫자를 문자열로

            // String이라는 클래스가 제공하는 valueOf라는 기능으로 문자열로 바꿔준다.
            // 다음 아래의 두가지 방법이 있다.

            // 방법1
            String s1=String.valueOf(93);

            // 방법2
            s1=Integer.toString(93); // 정수를 문자열 자료형으로 바궈주는 toString이 있다.
            System.out.println(s1); //93

            // double 실수형 자료형을 문자열로 바꿔주기

            //방법1
            String s2= String.valueOf(98.8);

            //방법2
            s2=Double.toString(98.8);
            System.out.println(s2); //98.8

            //문자열을 숫자로
            // parse: 데이터를 꺼내서 활용하는거
            int i=Integer.parseInt("93");
            System.out.println(i); //93

            double d=Double.parseDouble("93.8");
            System.out.println(d); //93.8


            int error =Integer.parseInt("자바"); // 자바라는 글자를 정수로 변환하려함
            System.out.println(error); // 오류뜬다.

        }
}
