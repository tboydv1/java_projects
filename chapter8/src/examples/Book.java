package examples;

public enum Book {

	JHTP("Jave How to Program", "2015"),
	CHTP("How to program", "2013"),
	IW3HTP("Internet & World Wide Web How to Program", "2012"),
	CPPHTP("C++ How to program", "2014"),
	CSHARPHTP("Visual C# How to Program", "2014");
	
	private final String title;
	private final String copyrightYear;
	
	Book(String title, String copyrightYear){
		this.title = title;
		this.copyrightYear = copyrightYear;
	}
	
	public String getTitle() {
		
		return title;
	}
	
	public String getCopyrightYear() {
		
		return copyrightYear;
	}
}
