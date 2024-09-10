package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {

        // 생성자:
        // 생성자는 인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드'이다.
        // 따라서 인스턴스 변수의 초기화 작업에 주로 사용되며, 인스턴스 생성 시에 실행되어야 할 작업을 위해서도 사용된다.

        BlackBox b1= new BlackBox();
        b1.modelName="까망이";
        b1.resolution="FHD";
        b1.price=200000;
        b1.color="블랙";
        System.out.println(b1.modelName);
        System.out.println(b1.SerialNumber);

        System.out.println("===============");

        BlackBox b2= new BlackBox("하양이","UHD",300000,"화이트");
        System.out.println(b2.modelName);
        System.out.println(b2.SerialNumber);


    }
}
