package chap_04;

public class _07_Dowhile {
    public static void main(String[] args) {
        // 반복문 Dowhile
        int distance=25; // 전체거리 25m
        int move=0; // 현재 이동거리 0m

        int height=2; // 키2m
        while(move+height<distance){
            System.out.println(("발차기를 계속 합니다."));
            System.out.println("현재 이동거리: "+move);
            move+=3; // move 3m 이동
        }
        System.out.println("도착했습니다.");
        System.out.println("===반복문 #1===");

        // 키가 엄청나게 큰 사람
        move=0;
        height=25;

        while(move+height<distance){
            System.out.println(("발차기를 계속 합니다."));
            System.out.println("현재 이동거리: "+move);
            move+=3; // move 3m 이동
        }
        System.out.println("도착했습니다.");
        // 시작부터 조건이 거짓이라 while문 밖에 문장만 실행된다.

        //Do while반복문
        // 조건 상관없이 일단 do 문장을 실행한 후,
        // 이후 조건을 보고 더 반복할지 결정한다.

        System.out.println("===반복문#2====");
        do{
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: "+move);
            move+=3;

        }while(move+height<distance);
        System.out.println("도착했습니다.");
    }

}
