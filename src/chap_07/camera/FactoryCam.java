package chap_07.camera;

public class FactoryCam extends Camera{ // 자식클래스

    // 부모는 하나의 클래스로만 정의할 수 있다.


//    public String name;
//    // alt+insert 눌러서 generate-constructor 자동생성
    public FactoryCam() {
        this.name="공장 카메라";
    }

//    public void takePicture(){
//        // 사진촬영
//        System.out.println("사진을 촬영합니다.");
//
//    }
//
//    public void recordVideo(){
//        // 동영상 녹화
//        System.out.println("동영상을 녹화합니다.");
//    }

    public void detectFire(){
        // 화재감지
        System.out.println("화재를 감지합니다.");
    }
}
