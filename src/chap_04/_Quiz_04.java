package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 일일 최대 요금 :30000원
        int parking_hour=8;
        String car="경차";

        int parkingfee=4000*parking_hour;
        if(parkingfee>30000)
        {
            System.out.println("일일 최대 요금을 초과하셨습니다.");
        }
        if(car=="경차"||car=="장애인 차량")
        {
            parkingfee=parkingfee/2;
        }

        System.out.println("===주차 요금 정산===");
        System.out.println("주차하신 차량: "+car);
        System.out.println("주차 시간: "+parking_hour+"시간");
        System.out.println("주차 요금: "+parkingfee+"원");



        // 나도코딩 정답
        int hour=10; // 주차 시간
        boolean isSmallcar=false; // 경차여부
        boolean withDisabledPerson=true; // 장애인차량여부

        int fee= 4000*hour; // 주차정산요금_시간당 4000원곱하기

        // 30000원 초과시 일일 최대 요금으로 수정
        if(fee>30000)
        {
            fee=30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 확인
        if(isSmallcar || withDisabledPerson)
        {
            fee=fee/2; // 50% 할인 적용
            // fee*=0.5
        }
        // 실행결과 출력
        System.out.println("주차요금은 "+fee+"원 입니다.");
    }
}
