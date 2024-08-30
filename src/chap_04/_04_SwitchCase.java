package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 1등: 전액
        // 2등: 반액
        // 3등: 반액
        // 그외: 장학금 대상 아님

        int ranking=2; // 2등
//        if(ranking==1)
//        {
//            System.out.println("전액 장학금");
//        } else if (ranking==2 )
//        {
//            System.out.println("반액 장학금");
//        } else if (ranking==3)
//        {
//            System.out.println("반액 장학금");
//
//        }
//        else{
//            System.out.println("장학금 대상 아님");
//        }
//        System.out.println("조회 완료 #1");
//
//
//        ranking=2; // 2등
//        if(ranking==1)
//        {
//            System.out.println("전액 장학금");
//        } else if (ranking==2 || ranking==3) {
//            System.out.println("반액 장학금");
//        }
//        else{
//            System.out.println("장학금 대상 아님");
//        }
//        System.out.println("조회 완료 #2");


        // 조건이 명확한 값(케이스)으로 나뉠때, Switch-case문을 이용
        ranking=1;
        switch (ranking)
        {
            case 1:
                System.out.println("전액장학금");
                break; // Switch 문 자체를 탈출해라
            case 2:
                System.out.println("반액장학금");
                break;
            case 3:
                System.out.println("반액장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회완료 #3");

        // case 2와 3을 통합, 랭킹=2 일때 바로 아래 문장을 실행한다.
        ranking = 2;
        switch (ranking)
        {
            case 1:
                System.out.println("전액장학금");
                break; // Switch 문 자체를 탈출해라
            case 2:
            case 3:
                System.out.println("반액장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회완료 #3");

        // 중고상품의 등급에 따른 가격을 책정(1급:최상, 4급: 최하)
        // break가 없는 switch-case문

        int grade=1; // 등급
        int price=7000; // 기본 가격
        switch(grade){

            case 1:
                price+=1000; // price=price+1000 =8000원
            case 2:
                price+=1000; // 8000원 + 1000원 = 9000원
            case 3:
                price+=1000; // 9000원 + 1000원 = 10000원
                break;
        }
        System.out.println(grade+"등급 제품의 가격: "+price+"원");

        // 여러조건 도는 어떤 범위로 조건을 나눌때는 if-else문을 쓴다.
        int score=95;
        if(score>=90)
            System.out.println("A");
        else if(score>=80)
            System.out.println("B");

    }
}
