package project;

import java.util.Scanner;

public class Show {
	public Show() {}
	public Show(int number) {
		Scanner sc = new Scanner(System.in);
		int showCard = 0;
		System.out.println("올릴 카드를 입력해주세요");
		while(true) {
			if(showCard +number == 10) {
				showCard += number;
				System.out.println(showCard);
				break;
			}
			else {
				System.out.println("더해서 10이 나오지 않는 카드를 입력하셨거나, 숫자가 아닌 문자를 입력하셨습니다.\n올릴 카드를 입력해주세요");
				number = sc.nextInt();
			}
		}
	}
	
}
