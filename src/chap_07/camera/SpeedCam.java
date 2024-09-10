package chap_07.camera;

public class SpeedCam extends Camera{


//    public final String name; // 자식클래스 : camera를 상속받아




//    public String name;

    public SpeedCam() {
        this.name="과속 단속 카메라";

    }

//    public void takePicture(){
//        // 사진촬영
//        System.out.println("사진을 촬영합니다.");
//    }
//
//    public void recordVideo(){
//        // 동영상 녹화
//        System.out.println("동영상을 녹화합니다.");
//    }

    public void checkSpeed(){
        // 속도체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate(){
        // 번호인식
        System.out.println("차량번호를 인식합니다.");
    }
}
