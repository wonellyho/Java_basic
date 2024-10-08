package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1= new BlackBox();
        b1.modelName="까망이";

        // 클래스안에 메소드를 만들어서
        // 클래스로 만들어진 객체로부터 메소드를 호출할 수 있다.
        b1.autoReport(); // 지원 안됨
        BlackBox.canAutoReport=true;
        b1.autoReport(); // 지원됨

        b1.insertMemoryCard(256);


        // type
        // 일반 영상 : 1
        // 이벤트 영상(충돌 감지): 2

        int fileCount=b1.getVideoFileCount(1); // 일반영상
        System.out.println("일반 영상 파일 수: "+fileCount+"개");

        fileCount=b1.getVideoFileCount(2); // 이벤트 영상
        System.out.println("이벤트 영상 파일 수 "+fileCount+"개");

        fileCount=b1.getVideoFileCount(7); // 이벤트 영상
        System.out.println("이벤트 영상 파일 수 "+fileCount+"개");
    }
}
