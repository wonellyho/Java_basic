package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속

        Camera camera =new Camera();
        FactoryCam factoryCam=new FactoryCam();
        SpeedCam speedCam=new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);  // 부모 클래스에 있는 name을 가져온다.
        System.out.println(speedCam.name);

        camera.takePicture(); // 부모클래스의 기능을 사용하고, 가져온다.
        factoryCam.recordVideo();
        speedCam.takePicture();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}
