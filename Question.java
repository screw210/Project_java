package project;
//돌아감
import java.util.Scanner;

public class Question extends Cardran{
	public Question() {}
	public void Question() {
		Cardran Card = new Cardran();
		Show sh = new Show();
		Scanner sc = new Scanner(System.in);
		System.out.print("계속 이어가시겠습니까? : ");
		String q = sc.nextLine();
		String yesAnswer = "네", yesAnswer1 = "응", yesAnswer2 = "어", yesAnswer3 = "ㅇ", yesAnswer4 = "좋아요", yesAnswer5 = "좋아", yesAnswer6 = "승낙", yesAnswer7 = "수락", yesAnswer8 = "새로 시작", yesAnswer9 = "새로";
		String noAnswer = "아니요", noAnswer1 = "아니오", noAnswer2 = "no", noAnswer3 = "싫어", noAnswer4 = "ㄴ", noAnswer5 = "싫어요", noAnswer6 = "거절", noAnswer7 = "거부", noAnswer8 = "계속", noAnswer9 = "계속하기", noAnswer10 = "아뇨";
		while(true) {
			if(q.equals(yesAnswer) || q.equals(yesAnswer1) || q.equals(yesAnswer2) || q.equals(yesAnswer3) || q.equals(yesAnswer4) || q.equals(yesAnswer5) || q.equals(yesAnswer6) || q.equals(yesAnswer7) || q.equals(yesAnswer8) || q.equals(yesAnswer9)) {
				System.out.println("상대방 : ");
				System.out.println("현재 : ");
				break;
			}
			else if(q.equals(noAnswer9) || q.equals(noAnswer8) || q.equals(noAnswer7) || q.equals(noAnswer6) || q.equals(noAnswer5) || q.equals(noAnswer4) || q.equals(noAnswer3) || q.equals(noAnswer2) || q.equals(noAnswer1) || q.equals(noAnswer) || q.equals(noAnswer10)) {
					System.out.println("현재 : ");
					System.out.println("상대방 : ");
					break;
			}
			else {
				System.out.println("알맞지 않은 말을 입력하셨습니다. 다시해주세요.");
				System.out.print("계속 이어가시겠습니까? : ");
				q = sc.next();
			}	
		}
	}
	
}
