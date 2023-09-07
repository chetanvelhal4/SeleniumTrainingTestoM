package myMethods;

import java.util.Scanner;

public class FindallCharacters {

	char ch[] = null;
	String sentence;
	int i = 0;
	int c = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindallCharacters g = new FindallCharacters();
		g.getcharacter();
		g.totalcharacters();

	}

	public void getcharacter() {

		Scanner get_sentence = new Scanner(System.in);
		System.out.println("Please Enter Sentence :->");
		String sentence = get_sentence.nextLine();
		char ch[] = sentence.toCharArray();
		i = sentence.length();
		//System.out.println("length is " + i);

		for (int k = 0; k <= i-1; k++) {
			if (ch[k] == ' ') {

				c= c+1;
			}
		}

	}
	public void totalcharacters()
	{
		int TotalCharInSentence = i-c;
		System.out.println("Total Characters without space are   ->"+TotalCharInSentence);
	}

}
