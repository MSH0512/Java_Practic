package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.
        // 키가 120cm 이상인 경우에만 탑승 가능
        // 삼항 연산자 이용

        // 실행결과값 : 키가 115cm 이므로 탑승 불가능 합니다 (115인 경우)
        //            키가 121cm 이므로 탑승 가능합니다(121인 경우)

        int height = 115;
        String result = (height >= 120) ? "가능" : "불가능";
        System.out.println("키가 " + height + "cm 이므로 탑승 " + result + "합니다.");

    }
}
