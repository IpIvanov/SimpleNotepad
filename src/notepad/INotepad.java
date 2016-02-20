package notepad;

public interface INotepad {
	public void addContentToPage(String newContent, int pageNumber);
	public void replaceContentToPage(String pageContent, int pageNumber);
	public void removeContentFromPage(int pageNumber);
	public void printBook(SimpleNotepad notePad);
}