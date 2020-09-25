package exercise14_5;

import java.security.SecureRandom;;
public class RandomSentence {

	private String[] article = {"the", "a", "one", "some", "any"};
	private String[] noun = {"boy", "girl", "dog", "town", "car"};
	private String[] verb = {"drove","jumped","ran","walked","skipped"};
	private String[] preposition = {"to","from","over","under", "on"};
	
	private SecureRandom random = new SecureRandom();
	
	public String[] getArticle() {
		return article;
	}
	public void setArticle(String[] article) {
		this.article = article;
	}
	public String[] getNoun() {
		return noun;
	}
	public void setNoun(String[] noun) {
		this.noun = noun;
	}
	public String[] getVerb() {
		return verb;
	}
	public void setVerb(String[] verb) {
		this.verb = verb;
	}
	public String[] getPreposition() {
		return preposition;
	}
	public void setPreposition(String[] preposition) {
		this.preposition = preposition;
	}
	
	public StringBuilder generateSentences() {
		
		StringBuilder sentence = new StringBuilder();
		
		int selectNo = random.nextInt(4);
		sentence.append(article[selectNo])
				.append(" ");
		
		selectNo = random.nextInt(4);
		sentence.append(noun[selectNo])
				.append(" ");
		
		selectNo = random.nextInt(4);
		sentence.append(verb[selectNo])
				.append(" ");
		
		selectNo = random.nextInt(4);
		sentence.append(preposition[selectNo])
				.append(" ");
		
		selectNo = random.nextInt(4);
		sentence.append(article[selectNo])
				.append(" ");
		
		selectNo = random.nextInt(4);
		sentence.append(noun[selectNo]);
		
		return sentence;
	}
	
	
}
