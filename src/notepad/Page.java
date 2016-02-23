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
	
	public boolean searchWord(String word){
		if(content.contains(word)){
			return true;
		}
		else return false;
	}
	
	public boolean containsDigits(){
		if(content.matches(".*\\d+.*")){
			return true;
		}
		else return false;
	}

}
