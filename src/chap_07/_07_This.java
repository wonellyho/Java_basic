package chap_07;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 =new BlackBox();
        b1.modelName="까망이"; // 까망이(최신형)


        // Ctrl+shift+i 메소드정보확인할 수 있다. or Ctrl누르면 메소드선언한데로 넘어감
        // 전달값의 파라미터 이름과, 인스턴스변수의 이름이 같을 때,
        // 이를 구분하기 위해 this를 쓴다.
        // 위의 두 이름이 다르다면, this를 쓰지 않아도 된다.
        b1.appendModelName("(최신형)");
        System.out.println(b1.modelName);

    }
}
