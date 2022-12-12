package capitalizingWords;

public class Application {

	public static void main(String[] args) {
		//create a sentence
		String sentence="I am the sentence, nice to meet you";
		
		for(int i=0;i<sentence.length();i++) {
			if(i==0) {
				System.out.print(sentence.toUpperCase().charAt(i));
			}else if(sentence.charAt(i-1)==' ') {
				System.out.print(sentence.toUpperCase().charAt(i));
			}else {
				System.out.print(sentence.charAt(i));
			}
		}

	}

}
