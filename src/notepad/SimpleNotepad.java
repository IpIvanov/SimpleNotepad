package notepad;

import notepad.Page;

public class SimpleNotepad extends SecuredNotepad implements INotepad {
	public String notepadName;
	public int numberOfPages;
	public Page[] colectionPages;

	public SimpleNotepad(String name, int pages) {
		notepadName = name;
		numberOfPages = pages;
		colectionPages = new Page[numberOfPages + 1];
		for (int i = 1; i <= pages; i++) {
			colectionPages[i] = new Page("Default Title " + i, "Default Content " + i);
		}
	}

	public void printNotePadName(SimpleNotepad notePad) {
		System.out.println("--------------------------------");
		System.out.println(notePad.notepadName);
		System.out.println("--------------------------------");
	}

	@Override
	public void addContentToPage(String newContent, int pageNumber) {
		try {
			colectionPages[pageNumber].content = colectionPages[pageNumber].content + " " + newContent;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("--------------------------------");
			System.out.println("Sorry, No Such Page.");
		}
	}

	@Override
	public void replaceContentToPage(String newContent, int pageNumber) {
		try {
			colectionPages[pageNumber].content = newContent;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("--------------------------------");
			System.out.println("Sorry, No Such Page.");
		}
	}

	@Override
	public void removeContentFromPage(int pageNumber) {
		try {
			colectionPages[pageNumber].content = "";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("--------------------------------");
			System.out.println("Sorry, No Such Page.");
		}
	}

	@Override
	public void printNotepad(SimpleNotepad notePad) {
		System.out.println("--------------------------------");
		for (int i = 1; i <= numberOfPages; i++) {
			System.out.println(colectionPages[i].title);
			System.out.println(colectionPages[i].content);
		}
		System.out.println("--------------------------------");
	}

	@Override
	public void searchWord(String word) {
		for (int i = 1; i <= numberOfPages; i++) {
			if(colectionPages[i].searchWord(word)){
				System.out.println("The word " + word + " is in " + i + " page");
				System.out.println("--------------------------------");
			}
			else{
				System.out.println("No match");
				System.out.println("--------------------------------");
			}
		}
		
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int i = 1; i <= numberOfPages; i++) {
			if(colectionPages[i].containsDigits()){
				colectionPages[i].printPage();
				System.out.println("--------------------------------");
			}
			else{
				System.out.println("This page has no digits");
				System.out.println("--------------------------------");
			}
		}
		
	}

}
