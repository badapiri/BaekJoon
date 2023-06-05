import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // 테스트 케이스 개수 입력

    for (int t = 0; t < T; t++) {
    	
        int num = sc.nextInt(); // 정수 입력
        
        int first = num; // 초기값 저장
        
        int reverse = 0; // 역순으로 변환된 정수를 저장할 변수

        while (num != 0) {
            reverse = reverse * 10 + num % 10; // 일의 자리를 가져와서 역순으로 변형
            num /= 10; // 다음 자릿 수로 이동
        }

        num = first; // num을 초기값으로 다시 설정
        
        int sum = num + reverse; // 원래 정수와 역순으로 변한 정수를 더한 값
        
        String sumStr = Integer.toString(sum); // 합을 문자열로 변환

        boolean isSymmetrical = true; // 좌우대칭 여부를 저장하는 변수

        for (int i = 0; i < sumStr.length() / 2; i++) {
            if (sumStr.charAt(i) != sumStr.charAt(sumStr.length() - i - 1)) {
                isSymmetrical = false; // 대칭이 아닌 경우 false로 설정하고 반복문 종료
                break;
            }
        }

        if (isSymmetrical) {
            System.out.println("YES"); // 좌우대칭인 경우 출력
        } else {
            System.out.println("NO"); // 좌우대칭이 아닌 경우 출력
        }
    }

    sc.close();
    }
}
