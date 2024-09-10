package chap_08;


import chap_07.BlackBox;
import chap_07.BlackBoxRefurbish;


public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1= new BlackBoxRefurbish();
        b1.modelName="까망이"; // chap_07.BlackBoxRefurbish에서 [public]으로 선언-> 다른 패키지여도 사용가능
//        b1.resolution="FHD"; // default로 선언: 같은패키지 내에서만 접근이 가능함
//        b1.price //private으로 선언해서 같은 패키지에서만 사용가능했다.
//        b1.color = "블랙"; //protected

//        A a= new A(); // public이 아니라 default로 되있어서 다른패키지 접근x


    }
}
