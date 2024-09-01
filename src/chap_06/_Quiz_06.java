package chap_06;

public class _Quiz_06 {

    // substring()을 이용하면 문자열 일부를 자를 수 있다.
    // length()를 이용하면 문자열의 길이를 알 수 있다.
    public static String getHiddenData(String object, int start_index) {
        String object_after = object.substring(0, start_index); // 나코딩 -> 나 만 남기기

        for (int i = 0; i < object.length() - start_index; i++) { // 문자열전체길이에서 index를 뺀만큼 *을 찍자
            object_after += "*";

        }
        return object_after;
    }



//      자바에서는 문자열의 특정문자를 변경할 수 없다.
//      배열이나 리스트와 같은 데이터 구조에서 사용되는 방식입니다.
//      하지만 Java의 String 클래스는 배열처럼 특정 인덱스를 통해 개별 문자를 수정할 수 없습니다.

        // 위에 정답코드와 같이 새로운 문자열 변수를 선언해 주어야한다.
//        for (int i = start_index; i < object.length(); i++) {
//            object_after[i]="*";
//
//        }
//        String object_after=object;
//        return object_after;
//    }

    public static void main(String[] args) {

        String name="나코딩"; // 이름
        String id="990130-1234567";//주민등록번호
        String phone="010-1234-1433"; // 전화번호

        System.out.println("이름 : "+ getHiddenData(name,1)); // 개인정보, 비공개 시작 위치
        System.out.println("이름 : "+ getHiddenData(id,8));
        System.out.println("이름 : "+ getHiddenData(phone,9));

    }
}
