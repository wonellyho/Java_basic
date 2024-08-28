package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height;
        height=125;

        String impossible="키가 "+height+"cm 이므로 탑승 불가능합니다.";
        String possible="키가 "+height+"cm 이므로 탑승 가능합니다.";
        String s=(height>=120)?possible:impossible;
        System.out.println(s);

        // 나도 코딩
        String result=(height>=120)? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println("키가 "+height+"cm 이므로 "+result);
    }
}
