package notepad;


public class Page {
	public String title;
	public String content;

	public Page(String pageTitle, String pageContent) {
		title = pageTitle;
		content = pageContent;
	}

	public void addContent(String newContent) {
		content = content + " " + newContent;
	}

	public void printPage() {
		System.out.println(title);
		System.out.println(content);
	}
	
}
