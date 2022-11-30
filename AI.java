package project;

public class AI {
	public AI() {
		int[] aiCard = {1, 3, 3, 4, 5, 6, 7};
		
		for(int i = 0; i <= aiCard.length; i++) {
			for(int j = i + 1; j < i; j++) {
			if(aiCard[i] == aiCard[j]) {
				System.out.println(aiCard[i] + aiCard[j]);
			}
			}
		}
		
	}
}
