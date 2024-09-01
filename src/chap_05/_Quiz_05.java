package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int size_start=250;
        int size[]=new int[10];

        // 사이즈 배열에 넣어주기
        for (int i = 0; i < size.length; i++) {
            size[i]=size_start;
            // size[i]=250+(5*i);
            size_start+=5;

        }

        for (int i = 0; i < size.length; i++) {
            System.out.println("사이즈 "+size[i]+" (재고있음)");

        }
    }
}
