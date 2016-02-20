package notepad;

import notepad.SimpleNotepad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotepadDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("--------------------------------");
		System.out.print("Enter the name of the notepad: ");
		System.lineSeparator();
		String name = br.readLine();
		System.out.print("Enter Number of pages: ");
		System.lineSeparator();
		int pages = Integer.parseInt(br.readLine());
		SimpleNotepad notePadObject = new SimpleNotepad(name, pages);
		System.out.println("--------------------------------");
		while (true) {
			System.out.println("1. Add text to the page content.");
			System.out.println("2. Replace text from the page content.");
			System.out.println("3. Delete content from page.");
			System.out.println("4. Print notepad content");
			System.out.println("5. Print notepad title");
			System.out.println("0. EXIT");
			System.out.println("--------------------------------");
			System.out.print("Your Choice: ");
			String choice = br.readLine();
			System.out.println(choice);

			switch (choice) {
			case "1":
				System.out.println("--------------------------------");
				System.out.print("Enter the content you want to add: ");
				System.lineSeparator();
				String addedContent = br.readLine();
				System.out.print("Enter the page you want to edit: ");
				System.lineSeparator();
				int pageNumber = Integer.parseInt(br.readLine());
				notePadObject.addContentToPage(addedContent, pageNumber);
				System.out.println("--------------------------------");
				break;
			case "2":
				System.out.println("--------------------------------");
				System.out.print("Enter the new content: ");
				System.lineSeparator();
				String newContent = br.readLine();
				System.out.print("Enter the page you want to edit: ");
				System.lineSeparator();
				int pageNumber2 = Integer.parseInt(br.readLine());
				notePadObject.replaceContentToPage(newContent, pageNumber2);
				System.out.println("--------------------------------");
				break;
			case "3":
				System.out.println("--------------------------------");
				System.out.print("Enter the page you want to delete: ");
				System.lineSeparator();
				int pageNumber3 = Integer.parseInt(br.readLine());
				notePadObject.removeContentFromPage(pageNumber3);
				System.out.println("--------------------------------");
				break;
			case "4":
				notePadObject.printBook(notePadObject);
				break;
			case "5":
				notePadObject.printNotePadName(notePadObject);
				break;
			case "0":
				System.out.println("Exit");
				return;
			default:
				System.out.println("Exit");
				return;
			}
		}
	}

}
