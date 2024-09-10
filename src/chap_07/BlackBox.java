package chap_07;

// 설명서 설계도, main 함수 선언해줄 필요없다.
public class BlackBox {

    // 각 개체가 갖는 인스턴스 변수
    String modelName; //모델명
    String resolution;//해상도
    int price; // 가격
    String color; // 색상
    int SerialNumber; // 시리얼 번호

    static int counter=0; // 시리얼 번호를 생성하는 역할 ++(처음엔 0이었다가) 1,2,3,4,5 ...

    static boolean canAutoReport = false; // 자동 신고 기능
    //static을 붙이면 class변수가 되는데, 이는 모든 인스턴스(객체)들이 공유하는 특성이다.
    //모든객체가 false가 돼

    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.SerialNumber= ++counter; // +하고 들어감
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다.: "+ this.SerialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color){
//        this(); // 기본생성자를 먼저 접근하게 한다.(기본 생성자 호출)
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName=modelName;
//        this.resolution=resolution;
//        this.price=price;
//        this.color=color;
    }




    // 전달값이 없는 경우
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 감지되지 않습니다.");
        }
    }

    // 전달값이 있는 경우
    void insertMemoryCard(int capacity) {
        System.out.println("메모리카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { // 일반영상
            return 9;
        } else if (type == 2) { // 이벤트영상
            return 1;

        }
        return 10;
    }


    // showDateTime: 날짜 정보 표시여부
    // showSpeed: 속도정보 표시 여부
    // min : 영상 기록 단위(분)
    void record(boolean showDataTime,boolean showSpeed, int min)
    {
        System.out.println("녹화를 시작합니다.");
        if(showDataTime){
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if(showSpeed){
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 "+min+"분 단위로 기록됩니다.");
    }

    // 기본값 설정
    void record(){
        record(true,true,5);
    }


    // 클래스 변수 만드는 느낌
    // 클래스 메소드
    static void callServiceCenter(){
        System.out.println("서비스센터(1588-0000) 로 연결합니다.");

        // 인스턴스변수는 바로 접근이 불가능하다.
//        modelName="test";

        // static으로 선언한 클래스변수는 static 메소드에서 바로 사용할 수 있다.
        canAutoReport=false;
    }

    void appendModelName(String modelName) {

        // 파라미터
        // 클래스의 인스턴스변수 modelName에 바로 접근이 가능하다
        this.modelName+=modelName;

    }




    // Getter & Setter
    // 외부에서 메서드를 통해 데이터에 접근하는거임
    // Getter : 외부에서 객체데이터를 읽어올때
    String getModelName(){
        return modelName;
    }

    // Setter 의 느낌
    // 외부에서 메서드를 통해 데이터를 변경할 때
    void setModelName(String modelName){
        this.modelName=modelName;
    }

    String getResolution(){
        if(resolution==null || resolution.isEmpty()){
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    void setResolution(String resolution){
        this.resolution=resolution;
    }

    int getPrice(){
        return price;
    }

    void setPrice(int price){
        if(price<100000)
        {
            this.price=100000;
        }
        else {
            this.price=price;
        }

    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color=color;
    }
}


