package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열(2차원 배열)

        // 소규모 영화관 좌석
        // A1~A5
        // B1~B5
        // C1~C5

        // 4번째 방법임
        String[] seatA={"A1","A2","A3","A4","A5"};
        String[] seatB={"B1","B2","B3","B4","B5"};
        String[] seatC={"C1","C2","C3","C4","C5"};

        // 3x5 크기의 2차원 배열
        String[][] seats=new String[][] {
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}

        };

        // B2에 접근하려면
        System.out.println(seats[1][1]); // [세로(행)][가로(열)]

        // C5에 접근하려면
        System.out.println(seats[2][4]);

        // 첫 줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5칸
        String[][] seats2={
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}

        };
        // A3에 접근하려면
        System.out.println(seats2[0][2]);

        // A5란 값이 없지만 접근하려면
        System.out.println(seats2[0][4]);

        // 3차원 배열 만들기
        String[][][] marray=new String[][][]{
                { {}, {}, {} }, // 1차원 배열을 둘러싼 2차원배열
                { {}, {}, {} }, // 그런 2차원 배열이 3개인 배열
                { {}, {}, {} }
        };

        // 3차원 배열 만들기(세로x가로x높이)
//        String[][][] marray= new String[3][3][3];
    }
}
