import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchText {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String check = "";
		String[] id = new String[3];
		String[] pw = new String[3];
		int sw = 0;
		int sel = 0;

		do {

			for (int i = 0; i < id.length; i++) {
				System.out.println("아이디 : " + id[i] + ", 패스워드 : " + pw[i]);
			}

			do {
				System.out.println("***도서 관리 프로그램***");
				System.out.println("[1]로그인");
				System.out.println("[2]회원가입");
				System.out.println("[3]아이디/패스워드찾기");
				System.out.println("[4]종료");
				System.out.print("메뉴를 선택하세요._");
				try {
					sw = Integer.parseInt(in.readLine());
				} catch (Exception e) {
					System.out.println("1~4 사이의 정수만 입력하세요.");
				}
			} while (!(sw == 1 || sw == 2 || sw == 3 || sw == 4));

			switch (sw) {
			case 1:
				System.out.println("로그인을 선택하셨습니다.");

				do {
					System.out.print("아이디 : ");
					check = in.readLine();
					for (int i = 0; i < id.length; i++) {
						if (check == id[i]) {
							sel = i;
							sw = 0;
							break;
						} else {
							System.out.println("존재하지 않는 아이디 입니다.");
							break;
						}
					}

				} while (sw != 0);
				sw = 1;

				do {
					System.out.print("패스워드 : ");
					check = in.readLine();
					if (check == pw[sel]) {
						System.out.println("로그인에 성공하셨습니다.");
						sw = 0;
						sel = 0;
					} else {
						System.out.println("맞지 않는 패스워드 입니다.");
						break;
					}
				} while (sw != 0);
				sw = 1;

				break;
			case 2:
				System.out.println("회원가입을 선택하셨습니다.");

				do {
					System.out.print("아이디 : ");
					check = in.readLine();
					for (int j = 0; j < id.length; j++) {
						if (check == id[j]) {
							System.out.println("입력하신 아이디는 이미 존재합니다.");
						} else if (id[j] == null) {
							id[j] = check;
							sel = j;
							sw = 0;
							break;
						}
					}
					System.out.println("빈공간이 없어서 가입하실 수 없습니다.");
				} while (sw != 0);
				sw = 1;

				System.out.print("패스워드 : ");
				pw[sel] = in.readLine();

				System.out.println("회원가입에 성공하셨습니다.");
				sel = 0;
				break;
			case 3:
				System.exit(0);
			case 4:
				System.exit(0);
			}
		} while (sw != 4);

	}

}
