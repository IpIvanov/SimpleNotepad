package notepad;

public class SimpleNotepad implements INotepad {
	private String notepadName;
	private int numberOfPages;
	private Page[] pagesArray;

	public SimpleNotepad(String name, int pages) {
		notepadName = name;
		numberOfPages = pages;
		pagesArray = new Page[numberOfPages + 1];
		for (int i = 1; i < pagesArray.length; i++) {
			pagesArray[i] = new Page("Default Title " + i, "Default Content " + i);
		}
	}

	public void printNotePadName() {
		System.out.println("--------------------------------");
		System.out.println(notepadName);
		System.out.println("--------------------------------");
	}

	@Override
	public void addContentToPage(String newContent, int pageNumber) {
		try {
			pagesArray[pageNumber].addContent(newContent);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("--------------------------------");
			System.out.println("Sorry, No Such Page.");
		}
	}

	@Override
	public void replaceContentToPage(String newContent, int pageNumber) {
		try {
			pagesArray[pageNumber].replaceContent(newContent);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("--------------------------------");
			System.out.println("Sorry, No Such Page.");
		}
	}

	@Override
	public void removeContentFromPage(int pageNumber) {
		try {
			pagesArray[pageNumber].deleteContent();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("--------------------------------");
			System.out.println("Sorry, No Such Page.");
		}
	}

	@Override
	public void printNotepad(SimpleNotepad notePad) {
		System.out.println("--------------------------------");
		for (int i = 1; i < pagesArray.length; i++) {
			pagesArray[i].printPage();
		}
		System.out.println("--------------------------------");
	}

	@Override
	public void searchWord(String word) {
		for (int i = 1; i < pagesArray.length; i++) {
			if (pagesArray[i].searchWord(word)) {
				System.out.println("--------------------------------");
				System.out.println("The word " + word + " is in " + ordinal(i) + " page");
				System.out.println("--------------------------------");
			} else {
				System.out.println("--------------------------------");
				System.out.println("No match found");
				System.out.println("--------------------------------");
			}
		}

	}

	public static String ordinal(int i) {
		String[] sufixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
		switch (i % 100) {
		case 11:
		case 12:
		case 13:
			return i + "th";
		default:
			return i + sufixes[i % 10];

		}
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int i = 1; i < pagesArray.length; i++) {
			if (pagesArray[i].containsDigits()) {
				System.out.println("--------------------------------");
				pagesArray[i].printPage();
				System.out.println("--------------------------------");
			}
		}

	}

}
