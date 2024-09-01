package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키코드
        char c='A'; // 알파벳 대문자는 65부터 시작, 소문자는 97, 숫자는 48 부터 시작
        System.out.println(c);
        System.out.println((int)c);

        c='B';
        System.out.println(c); //B
        System.out.println((int)c); //66

        c++;
        System.out.println(c); //C
        System.out.println((int)c); //67




        // 아스키코드로 영화관 좌석만들기

        String[][] seats3=new String[10][15];
        char ch='A';

        for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j <seats3[i].length; j++) { // 가로: seats3[i].length 어차피 다 15이긴하다.
                seats3[i][j]=String.valueOf(ch)+(j+1);

            }
            ch++;
        }

        for (int i = 0; i < seats3.length; i++) { // 세로(행) seats2.length ~중괄호안에 중괄호들 몇개 있는지
            for (int j = 0; j < seats3[i].length; j++) {// 가로
                System.out.print(seats3[i][j]+" ");

            }
            System.out.println();


        }
    }
}
