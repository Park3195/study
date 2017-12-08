import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpDownGame {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			boolean yn = true;
			char a = 0;
			int min = 1;
			int max = 100;
			int count = 0;
			int ran = (int) (Math.random() * 100 + 1);
			do {
				int su = 0;
				System.out.printf("%d ~ %d 의 숫자를 입력하세요. : ", min, max);
				try {
					su = Integer.parseInt(br.readLine());
				} catch (Exception e) {
				}
				if (min < su && su < max) {
					System.out.println("입력하신 수는 " + su + "입니다.");
					if (su == ran) {
						count += 1;
						System.out.println("축하합니다. 정답입니다." + count + "번만에 맞추셨습니다.");
						do {
							System.out.println("다시 하시겠습니까?(y/n)");
							a = (char) br.read();
							br.readLine();
							if (a == 'y' || a == 'Y') {
								yn = false;
								break;
							} else if (a == 'n' || a == 'N') {
								System.out.println("프로그램을 종료합니다.");
								System.exit(0);
							} else {
								System.out.println("잘못 입력하셨습니다.");
							}
							System.out.print("");
						} while (true);
					} else if (su > ran) {
						max = su;
						count += 1;
						System.out.printf("입력하신 %d 보다 작은 값입니다.(%d~%d)\n", su, min, max);
					} else if (su < ran) {
						min = su;
						count += 1;
						System.out.printf("입력하신 %d 보다 큰 값입니다.(%d~%d)\n", su, min, max);
					} else {
						System.out.println("입력이 올바르지 않습니다.");
					}
				} else {
					System.out.printf("%d 보다 크고 %d 보다 작은 정수를 입력하세요. (%d ~ %d)\n", min, max, min, max);
				}
			} while (yn);
		} while (true);
	}
}