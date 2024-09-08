package chap_07;

public class _01_Class {
    public static void main(String[] args) {

        // 객체 지향 프로그래밍( OOP : Object Oriented Programming)

        // 유지보수 용이
        // 높은 재사용성

        // 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상
        String modelName="까망이";
        String resolution="FHD";
        int price=200000;
        String color="블랙";
        // price는 정수형이랑 Str 배열로 4가지 특징을 못 묶어 ㅠ

        // 새로운 제품 개발
        String modelName2="하양이";
        String resolution2="UHD";
        int price2=300000;
        String color2="흰색";

        // 또다른 제품을 개발?
        // chap_07의 BlackBox 클래스를 설계도로 하여,
        // bbox라는 객체를 생성한다.
        // bbox 객체는 BlackBox 클래스의 인스턴스

        BlackBox bbox = new BlackBox();
        // BlackBox 클래스로부터 bbox 객체 생성
        // bbkx 객체는 BlackBox

        BlackBox bbox2 = new BlackBox();





    }

}
