package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 나코매장
        System.out.println("어서오세요. 나코입니다.");
        // 또다른 손님이 들어오면?
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        // 만약에 인사법이 바뀌면?
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        // 매장 이름이 바뀌면?
        // 나코->코나
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");


        System.out.println(("---- 반복문 사용 -----"));
        // 반복문 사용 For
        for( int i=0; i<10; i++){
            System.out.println("어서오세요 나코입니다."+(i+1));
        }

        // 짝수만 출력 (fori 만 적고 엔터)
        for (int i = 0; i < 10; i+=2) {
//            System.out.print(i); //print만 쓰면 줄바꿈 없다
            System.out.println(i);
        }

        //홀수만 출력
        System.out.println("홀수 출력");
        // 홀수만 출력 , shift tab키로 들여쓰기 제거
        for (int j = 1; j < 10; j+=2) {
            System.out.println(j);

            }

        // 거꾸로 숫자 출력해보기 5,4,3,2,1

        for(int i=5; i>0;i--)
        {
            System.out.println(i);
        }

        //1부터 10까지 수들의 합
        int sum=0;
        for(int i=1; i<=10; i++){
            sum+=i;
            System.out.println(sum);
        }

        }
    }

