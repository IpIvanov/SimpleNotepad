package notepad;

import notepad.Page;

public class SimpleNotepad implements INotepad {
	public String notepadName;
	public int numberOfPages;
	public Page[] colectionPages;
	public static Page pageObject;

	public SimpleNotepad(String name, int pages) {
		notepadName = name;
		numberOfPages = pages;
		colectionPages = new Page[numberOfPages + 1];
		for (int i = 1; i <= pages; i++) {
			pageObject = new Page("Default Title " + i, "Default Content " + i);
			colectionPages[i] = pageObject;
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
		colectionPages[pageNumber].content = newContent;
	}

	@Override
	public void removeContentFromPage(int pageNumber) {
		colectionPages[pageNumber].content = "";
	}

	@Override
	public void printBook(SimpleNotepad notePad) {
		System.out.println("--------------------------------");
		for (int i = 1; i <= numberOfPages; i++) {
			System.out.println(colectionPages[i].title);
			System.out.println(colectionPages[i].content);
		}
		System.out.println("--------------------------------");
	}

}
