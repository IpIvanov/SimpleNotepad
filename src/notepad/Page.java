package notepad;

public class Page {
	private String title;
	private String content;

	public Page(String pageTitle, String pageContent) {
		title = pageTitle;
		content = pageContent;
	}

	public void addContent(String newContent) {
		content += " " + newContent;
	}

	public void deleteContent() {
		content = "";
	}

	public void replaceContent(String newContent) {
		content = newContent;
	}

	public void printPage() {
		System.out.println(title);
		System.out.println(content);
	}

	public boolean searchWord(String word) {
		return content.contains(word);
	}

	public boolean containsDigits() {
		return content.matches(".*\\d+.*");
	}

}
