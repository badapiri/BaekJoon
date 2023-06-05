import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		
		int Sticks = sc.nextInt(); // 막대 개수
		
		int high[] = new int[Sticks]; // 높이 배열 생성
		
		for (int i = 0; i < Sticks; i++) {
			high[i] = sc.nextInt(); // 높이 입력
		}
		
		int cnt = 1; // 가장 오른쪽에서 보이는 막대 수 카운트
		int maxHigh = high[Sticks - 1]; // 가장 오른쪽 막대 높이
		
		//가장 오른쪽에서부터 보이는 막대기의 개수를 센다
        for (int i = Sticks - 2; i >= 0; i--) {
            if (high[i] > maxHigh) {
                cnt++; // 새로운 막대기가 오른쪽에서 보이는 경우 개수를 증가
                maxHigh = high[i]; // 최고 높이 갱신
            }
        }
        System.out.println(cnt); // 결과 출력
        
        sc.close(); // 어디서 쓰라고 들었는데 굳이 왜 쓰는지 아직도 모르겠는 친구 하지만 그냥 쓰죠
	}
}
