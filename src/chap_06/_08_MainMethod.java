package chap_06;

public class _08_MainMethod {

    // Run-> Edit Configuration -> Application ->Choosemainclass에서 현재파일(MainMethod)선택
    // programs arguments 에  1, 2, 3 등을 넣는다.(띄어쓰기 간격으로)
    public static void main(String[] args) {
        for(String s:args){
            System.out.println(s);

        }

        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        if(args.length==1){
            switch (args[0]){
                case "1":
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴입니다.");
                case "3":
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
            }
        } else{
            System.out.println("사용법) 1~3 중 하나를 입력하세요");
        }

    }
}
