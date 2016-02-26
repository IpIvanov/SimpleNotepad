package notepad;

public interface INotepad {
	void addContentToPage(String newContent, int pageNumber);
	void replaceContentToPage(String pageContent, int pageNumber);
	void removeContentFromPage(int pageNumber);
	void printNotepad(SimpleNotepad notePad);
	void searchWord(String word);
	void printAllPagesWithDigits();
}
