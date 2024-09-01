package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님 중에 노쇼 손님이 있다고 가정
        // For
        int max=20; // 최대 치킨 판매 수량
        int sold=0; // 현재 치킨 판매 수량
        int noShow=17; // 대기번호 17번 손님이 노쇼
        for (int i = 1; i <=50 ; i++) {
            System.out.println(i+"번 손님, 주문하신 치킨 나왔습니다.");

            // 치킨을 가져가는 상황

            // 손님이 없다면(no show)
            if(i==noShow)
            {
                System.out.println(i+"번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
                // continue를 만나는 순간 그 아래문장은 아예 실행하지 않고, i++(다음회차)을 하며 위로 넘어간다.
                // sold++ 가 실행안하므로, 21번 손님까지 치킨을 주게된다.
            }

            sold++; // 판매처리
            if(sold==max)
            {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }


        }
        System.out.println("영업 종료합니다.");
        System.out.println("-----------");
        // while문
        sold=0;
        int index=1;//손님번호
        //while(index<=50)
        while(true) // if문으로 break로 탈출을 해주니까(무한반복이 아니니까) 조건을 true로 써도 된다.
        {
            System.out.println(index+"번 손님, 주문하신 치킨 나왔습니다.");
            // 노쇼손님이 있다면
            if(index==noShow)
            {
                System.out.println(index+"번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                index++;
                continue;
            }
            sold++;
            if(sold==max)
            {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
